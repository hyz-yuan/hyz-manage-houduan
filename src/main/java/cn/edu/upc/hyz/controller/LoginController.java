package cn.edu.upc.hyz.controller;

import cn.edu.upc.hyz.common.CommonReturnType;
import cn.edu.upc.hyz.model.User;
import cn.edu.upc.hyz.service.LoginService;
import cn.edu.upc.hyz.service.MailSenderSrvServices;
import cn.edu.upc.hyz.service.UserService;
import cn.edu.upc.hyz.utils.SendEmailUtil;
import cn.edu.upc.hyz.utils.SysUser;
import cn.edu.upc.hyz.utils.exception.BusinessException;
import cn.edu.upc.hyz.utils.exception.EmBusinessError;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@CrossOrigin
@Controller
@RequestMapping(value="/web",method = {RequestMethod.POST,RequestMethod.GET})
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;
    @Autowired
    private MailSenderSrvServices mailsend;


    @RequestMapping("/login")
    @ResponseBody
    public CommonReturnType login(@RequestBody JSONObject user, HttpSession session){
        String loginName=user.getString("loginName");
        String password= user.getString("password");
        //String password=MD5Util.md5(password2);
        /*UsernamePasswordToken token = new UsernamePasswordToken(loginName,password);*/
        Map<String,Object> returnMsg = new HashMap<String, Object>();
        //通过用户名得到user
        System.out.println("loginName:"+loginName);
        System.out.println("password:"+password);
        User user1 = loginService.selectByUsername(loginName);
        if(user1!=null){
            if(user1.getPassword().equals(password)){
                session.setAttribute("user",user1);
                //回话存活时间
                session.setMaxInactiveInterval(30*60);
                returnMsg.put("loginTips","登陆成功");
                /*System.out.println("返回权限1"+SysUser.getCurrentUserRole(session));*/
                returnMsg.put("userType", SysUser.getCurrentUserRole(session));
                returnMsg.put("user",user1);
                return CommonReturnType.create(returnMsg);
            }else{
                throw new BusinessException(EmBusinessError.STUDENT_LOGIN_FAIL);
            }

        }else{
            throw new BusinessException(EmBusinessError.STUDENT_NOT_EXIST);
        }


    }

    /**
     * 创建验证码
     */
    public static String smsCode(){
        //创建一个6位的随机数字
        String ran = new Random().nextInt(1000000)+"";
        if(ran.length()!=6){
            smsCode();
        }
        return ran;
    }
    /**
     *
     * sendCode
     * */
    @RequestMapping("/sendCode")
    @ResponseBody
    public CommonReturnType sendCode(@RequestBody JSONObject jsonObject){

        String userName=jsonObject.getString("userName");
        String newPassword = jsonObject.getString("password");
        String email=jsonObject.getString("email");

        User user=loginService.selectByUsername(userName);
        if(user!=null){
            if(!user.getEmail().equals(email)){
                return CommonReturnType.create("邮箱错误");
            }
            if(newPassword.equals(user.getPassword())){
                return CommonReturnType.create("请输入不同的密码");
            }
            String code2=smsCode();

            String to = "1530189635@qq.com";  //收件人地址
            String subject = "验证码";   //邮件标题
            String content = code2;    //邮件内容
            mailsend.sendEmail(to,subject,content);    //发送邮件

            return CommonReturnType.create(code2);
        }else{
            return CommonReturnType.create("请输入正确的用户名");
        }


    }
    /**
     * 修改密码
     * */
    @RequestMapping("/passwordUpdate")
    @ResponseBody
    public CommonReturnType passwordUpdate(@RequestBody JSONObject jsonObject){
        String userName=jsonObject.getString("userName");
        String password=jsonObject.getString("password");

        User user=loginService.selectByUsername(userName);
        user.setPassword(password);
        if(userService.updateUser(user)==1){
            return CommonReturnType.create("修改成功");
        }else {
            return CommonReturnType.create("修改失败");
        }
    }
}

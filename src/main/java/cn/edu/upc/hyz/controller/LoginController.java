package cn.edu.upc.hyz.controller;

import cn.edu.upc.hyz.common.CommonReturnType;
import cn.edu.upc.hyz.model.User;
import cn.edu.upc.hyz.service.LoginService;
import cn.edu.upc.hyz.service.UserService;
import cn.edu.upc.hyz.utils.SysUser;
import cn.edu.upc.hyz.utils.exception.BusinessException;
import cn.edu.upc.hyz.utils.exception.EmBusinessError;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping(value="/web",method = {RequestMethod.POST,RequestMethod.GET})
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;
    //    @Autowired
//    private SysUser sysUser;
    /*@Autowired
    private SendEmailUtil sendEmailUtil;
    @Autowired
    private RolerManageService rolerManageService;*/

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
                return CommonReturnType.create(returnMsg);
            }else{
                throw new BusinessException(EmBusinessError.STUDENT_LOGIN_FAIL);
            }

        }else{
            throw new BusinessException(EmBusinessError.STUDENT_NOT_EXIST);
        }


    }

}

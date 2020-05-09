package cn.edu.upc.hyz.controller;

import cn.edu.upc.hyz.service.UserService;
import cn.edu.upc.hyz.common.CommonReturnType;
import cn.edu.upc.hyz.model.User;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping(value="/user",method = {RequestMethod.POST, RequestMethod.GET})
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * gsl
     * 从user表获取管理者名单：manager
     * @date 2020/4/2
     * @return managerList
     */
    @RequestMapping("/manager")
    @ResponseBody
    public CommonReturnType getManagerList(){
        List<User> managerList = userService.selectManager();
        return CommonReturnType.create(managerList,"获取成功");
    }
    /*
    * 获取所有user名单
    * */
    @RequestMapping("/allUser")
    @ResponseBody
    public CommonReturnType allUser(){
        List<User> users = userService.selectUsers();

        return CommonReturnType.create(users);
    }
    /*
    * 获取指定user信息
    * */
    @RequestMapping("/getUserById")
    @ResponseBody
    public CommonReturnType getUserById(@RequestBody User user){
        User result = userService.selectUser(user);

        return CommonReturnType.create(result);
    }
    /*
    * 删除user
    * */
    @RequestMapping("/deletUser")
    @ResponseBody
    public CommonReturnType deletUser(@RequestBody User user){
        int result = userService.deletUser(user);

        return CommonReturnType.create(result);
    }
    /*
    * 更新user
    * */
    @RequestMapping("/updateUser")
    @ResponseBody
    public CommonReturnType updateUser(@RequestBody User user){
        int result = userService.updateUser(user);

        return CommonReturnType.create(result);

    }
    /*
    * 添加新用户
    * */
    @RequestMapping("/insertUser")
    @ResponseBody
    public CommonReturnType insertUser(@RequestBody User user){
        int result = userService.insertUser(user);

        return CommonReturnType.create(result);

    }
    /*
    * 通过id修改密码
    * */
    @RequestMapping("/changePassword")
    @ResponseBody
    public CommonReturnType changePassword(@RequestBody User user){
        User newUser=userService.selectUser(user);
        newUser.setPassword(user.getPassword());
        userService.updateUser(newUser);

        return CommonReturnType.create(null);

    }


    @RequestMapping("/json1")
    @ResponseBody
    public CommonReturnType stringTest(@RequestBody User webUser, HttpServletRequest request){

        request.getSession().setAttribute("user",webUser);
        User user = userService.selectUser(new User());
        List l=new ArrayList();
        l.add(user);
        l.add(request.getSession().getAttribute("user"));
        return CommonReturnType.create(l);

    }

}

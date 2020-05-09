package cn.edu.upc.hyz.controller;

import cn.edu.upc.hyz.service.UserService;
import cn.edu.upc.hyz.service.EmployeeManageService;
import cn.edu.upc.hyz.common.CommonReturnType;
import cn.edu.upc.hyz.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping(value="/Employee",method = {RequestMethod.POST, RequestMethod.GET})
public class EmployeeController {
    @Autowired
    private EmployeeManageService employeeManageService;
    @Autowired
    private UserService userService;
    @RequestMapping("/getEmployee")
    @ResponseBody
    public CommonReturnType disEmployee(){
        List<EmployeeSelect> e1 = employeeManageService.selectAllEmployee();
        return CommonReturnType.create(e1);
    }
    @RequestMapping("/search")
    @ResponseBody
    public CommonReturnType searchEmployee(@RequestBody EmployeeSelectInput employeeSelectInput){
        List<EmployeeSelect> e2 = employeeManageService.selectEmployee(employeeSelectInput);
        return CommonReturnType.create(e2);
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public CommonReturnType deleteUser(@RequestBody User user)
    {
        User newUser = userService.selectUser(user);
        newUser.setDelFlag(1);
        userService.updateUser(newUser);
        return CommonReturnType.create(null,null,0,"删除成功");
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public CommonReturnType updateUser(@RequestBody User user)
    {
        User user1 = userService.selectUser(user);
        user1.setWorkPlace(user.getWorkPlace());
        user1.setFieldPosition(user.getFieldPosition());
        user1.setTechnology(user.getTechnology());
        user1.setRole(user.getRole());
        userService.updateUser(user1);
        return CommonReturnType.create(null,null,0,"更新成功");
    }
    @RequestMapping("/changePassword")
    @ResponseBody
    public CommonReturnType changePassWord(@RequestBody ChangePassword para)
    {
        String password= para.getPassword();
        employeeManageService.changePassWord(password,para.getId());
        return CommonReturnType.create(null,null,0,"修改成功");
    }


}

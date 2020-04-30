package cn.edu.upc.hyz.controller;

import cn.edu.upc.hyz.common.CommonReturnType;
import cn.edu.upc.hyz.model.Role;
import cn.edu.upc.hyz.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin//解决跨域问题
@Controller
@RequestMapping(value="/manage",method = {RequestMethod.POST, RequestMethod.GET})
public class RoleController {
    @Autowired(required = false)
    @Qualifier("rolesServiceImpl")
    private RoleServiceImpl roleService;

    @RequestMapping("/Role")
    @ResponseBody
    public CommonReturnType selectAllRole() {
        List<Role> r= roleService.selectAllRole();
        return CommonReturnType.create(r);
    }
    @RequestMapping("/insertRole")
    @ResponseBody
    public CommonReturnType insertRole(@RequestBody Role role) throws ParseException {
        role.setOperator("test");
        Date date= new Date();
        role.setCreateTime(date);// new Date()为获取当前系统时间
        role.setOperatorTime(date);// new Date()为获取当前系统时间
        roleService.insertRole(role);
        return CommonReturnType.create(null);
    }

    @RequestMapping("/deleteRole")
    @ResponseBody
    public CommonReturnType deleteRole(@RequestBody Role role){
        role.setOperator("test");
        role.setOperatorTime(new Date());// new Date()为获取当前系统时间
        roleService.deleteRole(role);
        return CommonReturnType.create(null);
    }

    @RequestMapping("/updateRole")
    @ResponseBody
    public CommonReturnType updateRole(@RequestBody Role role){
        role.setOperator("test");
        role.setOperatorTime(new Date());// new Date()为获取当前系统时间
        roleService.updateRole(role);
        return CommonReturnType.create(null);
    }
}

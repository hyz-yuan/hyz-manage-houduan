package cn.edu.upc.hyz.service;

import cn.edu.upc.hyz.model.EmployeeSelect;
import cn.edu.upc.hyz.model.EmployeeSelectInput;

import java.util.List;

public interface EmployeeManageService {
    public List <EmployeeSelect> selectAllEmployee();
    public List <EmployeeSelect> selectEmployee(EmployeeSelectInput employeeSelectInput);
    public void changePassWord(String password, String id);
}

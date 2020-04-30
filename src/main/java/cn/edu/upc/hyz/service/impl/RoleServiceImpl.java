package cn.edu.upc.hyz.service.impl;


import cn.edu.upc.hyz.dao.RoleMapper;
import cn.edu.upc.hyz.model.Role;
import cn.edu.upc.hyz.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("rolesServiceImpl")
public class RoleServiceImpl implements RoleService {
    @Resource
    public RoleMapper roleMapper;
    @Resource
    private RoleMapper rolesDao;
    public Role selectRoles(Integer id) {
        return rolesDao.selectRoles(id);
    }

    @Override
    public void insertRole(Role role) {
        roleMapper.insertRole(role);
    }
    @Override
    public List<Role> selectAllRole() {
        return roleMapper.selectAllRole();
    }


    @Override
    public void deleteRole(Role role){
        roleMapper.deleteRoleLN(role);
    }
    @Override
    public void updateRole(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

}

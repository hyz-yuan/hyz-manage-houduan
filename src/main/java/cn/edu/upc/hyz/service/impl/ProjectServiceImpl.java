package cn.edu.upc.hyz.service.impl;

import cn.edu.upc.hyz.service.ProjectService;
import cn.edu.upc.hyz.dao.ProjectMapper;
import cn.edu.upc.hyz.model.Project;
import cn.edu.upc.hyz.utils.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;
    @Override
    public void insertProject(Project project) {
            projectMapper.insertSelective(project);
    }

    @Override
    public List<Project> selectByManager(HttpSession session) {
        //int managerId=2; //session获取
        Integer loginId = SysUser.getCurrentUserId(session);
        System.out.println(loginId);
        return projectMapper.selectByManager(loginId);
    }

    @Override
    public Project selectByPrimaryKey(int id) {
        return projectMapper.selectByPrimaryKey(id);
    }
}

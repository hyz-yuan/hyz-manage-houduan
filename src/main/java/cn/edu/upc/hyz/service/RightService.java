package cn.edu.upc.hyz.service;

import cn.edu.upc.hyz.model.Rights;

import java.util.List;
import java.util.Map;


public interface RightService {
    public void insertRight(Rights rights);

    public void deleteRight(Rights rights);
    public void updateRight(Rights rights);
    public List<Rights>selectAllRights();
    public List<Map<String,Object>> selectAllViewRights();
}

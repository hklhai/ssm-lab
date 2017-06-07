package cn.edu.ncut.dao;

import cn.edu.ncut.model.RoleObj;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao {
    int deleteByPrimaryKey(Integer roleid);

    int insert(RoleObj record);

    int insertSelective(RoleObj record);

    RoleObj selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(RoleObj record);

    int updateByPrimaryKey(RoleObj record);
}
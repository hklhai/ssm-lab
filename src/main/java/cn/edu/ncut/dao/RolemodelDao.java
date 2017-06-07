package cn.edu.ncut.dao;

import cn.edu.ncut.model.RolemodelObj;
import org.springframework.stereotype.Repository;

@Repository
public interface RolemodelDao {
    int deleteByPrimaryKey(Integer rolemodelid);

    int insert(RolemodelObj record);

    int insertSelective(RolemodelObj record);

    RolemodelObj selectByPrimaryKey(Integer rolemodelid);

    int updateByPrimaryKeySelective(RolemodelObj record);

    int updateByPrimaryKey(RolemodelObj record);
}
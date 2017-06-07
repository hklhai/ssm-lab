package cn.edu.ncut.dao;

import cn.edu.ncut.model.ModelObj;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelDao {
    int deleteByPrimaryKey(Integer modelid);

    int insert(ModelObj record);

    int insertSelective(ModelObj record);

    ModelObj selectByPrimaryKey(Integer modelid);

    int updateByPrimaryKeySelective(ModelObj record);

    int updateByPrimaryKey(ModelObj record);
}
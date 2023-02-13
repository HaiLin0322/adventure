package com.hailin.adventure.model.dao;

import com.hailin.adventure.model.pojo.Status;

public interface StatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Status row);

    int insertSelective(Status row);

    Status selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Status row);

    int updateByPrimaryKey(Status row);
}
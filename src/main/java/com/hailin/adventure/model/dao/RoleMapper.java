package com.hailin.adventure.model.dao;

import com.hailin.adventure.model.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role row);

    int insertSelective(Role row);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role row);

    int updateByPrimaryKey(Role row);
}
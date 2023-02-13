package com.hailin.adventure.model.dao;

import com.hailin.adventure.model.pojo.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item row);

    int insertSelective(Item row);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item row);

    int updateByPrimaryKey(Item row);
}
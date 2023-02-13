package com.hailin.adventure.model.dao;

import com.hailin.adventure.model.pojo.Equipment;

public interface EquipmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equipment row);

    int insertSelective(Equipment row);

    Equipment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Equipment row);

    int updateByPrimaryKey(Equipment row);
}
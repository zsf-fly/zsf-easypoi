package com.demo.mapper;

import com.demo.pojo.Weiuser;

import java.util.List;

public interface WeiuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Weiuser record);

    int insertSelective(Weiuser record);

    Weiuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Weiuser record);

    int updateByPrimaryKey(Weiuser record);

    List<Weiuser> selectAll();

    int insertAll(List<Weiuser> list);
}
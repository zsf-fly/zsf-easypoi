package com.demo.service;

import com.demo.pojo.Weiuser;

import java.util.List;

public interface WeiuserService {

    List<Weiuser> selectAll();

    int insertAll(List<Weiuser> list);
}

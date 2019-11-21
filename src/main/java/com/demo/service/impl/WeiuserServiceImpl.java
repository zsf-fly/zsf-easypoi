package com.demo.service.impl;

import com.demo.pojo.Weiuser;
import com.demo.mapper.WeiuserMapper;
import com.demo.service.WeiuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeiuserServiceImpl implements WeiuserService {

    @Autowired
    WeiuserMapper weiuserMapper;

    @Override
    public List<Weiuser> selectAll() {
        return weiuserMapper.selectAll();
    }

    @Override
    public int insertAll(List<Weiuser> list) {
        return weiuserMapper.insertAll(list);
    }
}

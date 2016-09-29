package com.xueyou.ssmagagin.serviceimpl;

import com.xueyou.ssmagagin.dao.FirstDao;
import com.xueyou.ssmagagin.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxueyou on 16/9/29.
 */
@Service("FirstService")
public class FirstServiceImpl implements FirstService{
    @Autowired
    private FirstDao firstDao;
    @Override
    public Map<String, Object> getJson(Map<String,Object> params) {
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("resCode","1");
        resMap.put("resMessage","2");
        resMap.put("list",firstDao.getUser(params));
        return resMap;
    }
}

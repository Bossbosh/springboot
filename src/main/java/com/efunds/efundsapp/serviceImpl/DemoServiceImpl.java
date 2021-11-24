package com.efunds.efundsapp.serviceImpl;

import com.efunds.efundsapp.dao.DemoMapper;
import com.efunds.efundsapp.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    private DemoMapper demoMapper;


    @Override
    public String getDemoDesc() {
        return demoMapper.queryDemoDbInfo();
    }
}

package com.efunds.efundsapp.controller;

import com.efunds.efundsapp.service.DemoService;
import com.zhy.cache.service.CacheProviderService;
import com.zhy.log.annotations.RequestLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired(required = false)
    private CacheProviderService cacheProviderService;

    @Autowired
    private DemoService demoService;

    @GetMapping("/log")
    @RequestLog
    public String test(){
       return demoService.getDemoDesc();
    }

    @GetMapping("/setcache")
    public void testSetCache(){
        cacheProviderService.set("name","zhy");
    }

    @GetMapping("/getcache")
    @RequestLog
    public void testGetCache(@RequestParam String key){
        logger.info("the key is " + key+" value is "+cacheProviderService.get(key));
    }


}

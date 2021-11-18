package com.boot.project.controller;

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
@RequestMapping("/test")
public class Controller {

    private final static Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired(required = false)
    private CacheProviderService cacheProviderService;

    @GetMapping("/log")
    @RequestLog
    public void test(){
        System.out.println("test request.......");
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

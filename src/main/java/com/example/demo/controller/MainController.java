package com.example.demo.controller;

import com.example.demo.domain.Market;
import com.example.demo.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private MarketService service;
    @RequestMapping("getMarket")
    @ResponseBody
    public List<Market> getMarket(){
        List<Market> list = service.getMarket();
        return list;
    }
    @RequestMapping("aa")
    public String get(){
        return "hello";
    }

//    public MarketService getService() {
//        return service;
//    }
//
//    public void setService(MarketService service) {
//        this.service = service;
//    }
}

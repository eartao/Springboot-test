package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.MarketMapper;
import com.example.demo.domain.Market;
import com.example.demo.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    private MarketMapper marketMapper;
    @Override
    public List<Market> getMarket() {
        System.out.println(12312+"+++++++++++==============");
        Market market = marketMapper.selectByPrimaryKey(1);
        List<Market> list = new ArrayList<>();
        list.add(market);
        return list;
    }

}

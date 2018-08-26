package com.example.demo.dao;
public class Market {
    private Integer id;
    private String usd;
    private String market;
    private String description;
    private String description2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", usd='" + usd + '\'' +
                ", market='" + market + '\'' +
                ", description='" + description + '\'' +
                ", description2='" + description2 + '\'' +
                '}';
    }

}

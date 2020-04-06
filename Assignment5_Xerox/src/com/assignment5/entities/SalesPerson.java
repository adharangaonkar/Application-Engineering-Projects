/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
public class SalesPerson {
    
    int salesId;
    String marketSegment;
    private List<Order> orders;
    
    public SalesPerson(int salesId, String marketSegment)
    {
        this.salesId = salesId;
        this.marketSegment = marketSegment;
        this.orders = new ArrayList<>();
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getMarketSegment() {
        return marketSegment;
    }

    public void setMarketSegment(String marketSegment) {
        this.marketSegment = marketSegment;
    }
    
    @Override
    public String toString() {
        return "Sales Person Information {" + "Sales Id = " + salesId + ", Market Segment = " + marketSegment + '}';
    }
    
}




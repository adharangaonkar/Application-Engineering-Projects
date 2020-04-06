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
public class Customer {
    
    int customerId;
    String marketSegment;
    private List<Order> orders;
    
    public Customer(int customerId, String marketSegment){
        this.customerId = customerId;
        this.marketSegment = marketSegment;
        this.orders = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
    
    /*@Override
    public String toString() {
        return "Customer{" + "Customer_Id = " + customerId + ", Order_Id = " + orderId +'}';
    }*/
    
}


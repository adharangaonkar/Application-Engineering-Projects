/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.*;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    DataReader orderReader;
    DataReader productReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
    }
    
    public static void main(String args[]) throws IOException{
        GateWay inst = new GateWay();
        inst.readData();
    }
       
    
    private void readData() throws IOException{
        String[] row;
        while((row = productReader.getNextRow()) != null ){
            generateProduct(row);
        }
        while((row = orderReader.getNextRow()) != null ){
            generateCustomer(row);
            generateSalesPerson(row);
            Item item = generateItem(row);
            generateOrder(row, item);
        }
        runAnalysis();
    }
    
    private void generateProduct(String[] row){
        // TODO
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        
        Product product = new Product(productId,minPrice,maxPrice,targetPrice);
        DataStore.getInstance().getProducts().put(productId, product);
    }
    
    private Item generateItem(String[] row){
        // TODO
        int itemId = Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int salesPrice = Integer.parseInt(row[6]);
        int quantity = Integer.parseInt(row[3]);
        
        Item item = new Item(itemId, productId, salesPrice, quantity);
        DataStore.getInstance().getItems().put(itemId, item);
        
        return item;
    }
    
    private void generateOrder(String[] row, Item item){
        // TODO
        int orderId = Integer.parseInt(row[0]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        
        Order order = new Order(orderId, salesId, customerId, item);
        DataStore.getInstance().getOrders().put(orderId, order);
        
        Map<Integer, Customer> customers = DataStore.getInstance().getCustomers();
        customers.get(customerId).getOrders().add(order);
        
        Map<Integer, SalesPerson> person = DataStore.getInstance().getSalespeople();
        person.get(salesId).getOrders().add(order);

    }
    
    private void generateCustomer(String[] row){
        // TODO
        int customerId = Integer.parseInt(row[5]);
        String marketSegment = row[7];

        Customer customer = new Customer(customerId, marketSegment);
        DataStore.getInstance().getCustomers().put(customerId, customer);
    }
    
     private void generateSalesPerson(String[] row){
        // TODO
        int salesId = Integer.parseInt(row[4]);
        String marketSegment = row[7];

        SalesPerson person = new SalesPerson(salesId, marketSegment);
        DataStore.getInstance().getSalespeople().put(salesId, person);
    }
    
    private void runAnalysis() throws IOException
    {
        
        helper.getTopThreeProducts();
        helper.getTopThreeCustomers();
        helper.getTopThreeSalesPerson();
        helper.getTotalRevenue();
        helper.getOptimumPrice();
        
        
    }

    
}




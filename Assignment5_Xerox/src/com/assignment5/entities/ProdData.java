/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author rohan
 */
public class ProdData implements Comparable<ProdData>{
    private int productId;
    private double avgSalesPrice;
    private double targetPrice;
    private Double diff;
    private Double error;
    
    public ProdData(int productId, double avgSalesPrice, double targetPrice, double diff, double error){
        this.productId = productId;
        this.avgSalesPrice = avgSalesPrice;
        this.targetPrice = targetPrice;
        this.diff = diff;
        this.error = error;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getAvgSalesPrice() {
        return avgSalesPrice;
    }

    public void setAvgSalesPrice(double avgSalesPrice) {
        this.avgSalesPrice = avgSalesPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public Double getDiff() {
        return diff;
    }

    public void setDiff(Double diff) {
        this.diff = diff;
    }

    public Double getError() {
        return error;
    }

    public void setError(Double error) {
        this.error = error;
    }
    
    @Override
    public String toString() {
        return "            " + productId + "               " + avgSalesPrice + "               " + targetPrice + "                 " + diff + "";
    }
    
    @Override
    public int compareTo(ProdData p) {
        return this.getDiff().compareTo(p.getDiff()); 
    }
    
}

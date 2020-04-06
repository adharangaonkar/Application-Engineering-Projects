/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;
//************************************************
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.ProdData;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author adhar
 */
public class AnalysisHelper {

     Map<Integer, Integer> sale1 = new HashMap<Integer, Integer>();
     
     
     public void getDiffer() {
        Map<Integer, SalesPerson> salesPersonMap = DataStore.getInstance().getSalespeople();
        Map<Integer, Product> product = DataStore.getInstance().getProducts();

        for (SalesPerson salesperson : salesPersonMap.values()) {
            for (Order o : salesperson.getOrders()) {
                if (o.getSalesId() == salesperson.getSalesId()) {
                    {
                        int price = 0;
                        if (sale1.containsKey(salesperson.getSalesId())) {
                            price = sale1.get(salesperson.getSalesId());
                        }
                        
                        int tarprice = product.get(o.getItem().getProductId()).getTargetPrice() * o.getItem().getQuantity();
                        int salesPrice = o.getItem().getSalesPrice() * o.getItem().getQuantity();
                        int salesDiff = salesPrice - tarprice;
                        sale1.put(salesperson.getSalesId(), price + salesDiff);
                        salesDiff = 0;
                    }
                }
            }
        }

    }
      public void getTopThreeProducts()
      {
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        Map<Integer, Item> items = DataStore.getInstance().getItems();
        Map<Integer, Integer> prod = new TreeMap<>();
        for (Product pro : products.values()) 
        {
            int count = 0;
            for (Item i : items.values())
            {
                if (pro.getProductId() == i.getProductId())
                {
                    int difference = i.getSalesPrice() - pro.getTargetPrice();
                    if (difference > 0) 
                    {
                        count++;
                    }
                }
                prod.put(pro.getProductId(), count);
            }
        }
        ArrayList<Integer> allProducts = new ArrayList<>(prod.values());
        int key = 0;
        Collections.sort(allProducts);
        Collections.reverse(allProducts);
        System.out.println(allProducts);
        Map<Integer, Integer> finalProds = new TreeMap<>();
        int distinct = 0;
        for (int i = 0; i < (allProducts.size() - 1); i++) 
        {
            if (allProducts.get(i) != allProducts.get(i + 1)) 
            {
                distinct++;
            }
            if (distinct <= 3) 
            {
                for (Map.Entry<Integer, Integer> entry : prod.entrySet()) 
                {
                    if (allProducts.get(i) == entry.getValue())
                    {
                        key = entry.getKey();
                        finalProds.put(key, entry.getValue());
                    }
                }
            }
            if (distinct == 3) {
                break;
            }
        }
        
List<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(finalProds.entrySet());
       Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() 
       {
           @Override
           public int compare(Map.Entry<Integer, Integer> a1,
                   Map.Entry<Integer, Integer> a2) 
           {
               return a2.getValue() - a1.getValue();
           }
       });
       System.out.println("-------------------------------------------------------------------------------------------");
       System.out.println("Q.1 : Our Top Three Best Negotiated Products are(The products that sell above target)are : ");
       System.out.println("-------------------------------------------------------------------------------------------");
      
       for (int j = 0; j < finalProds.size(); j++) 
       {
           System.out.println("Product:  " + entries.get(j) +  " ");
       }
    }

    public void getTopThreeCustomers() 
    {
       LinkedHashMap<Integer, Integer> topthreecust = new LinkedHashMap<Integer, Integer>();
       Map<Integer, Order> order = DataStore.getInstance().getOrders();
       Map<Integer, Product> prod = DataStore.getInstance().getProducts();
           for (Order ord : order.values()) 
           {
                   if (topthreecust.containsKey(ord.getCustomerId()))
                   {
                       int sumOfDiff = topthreecust.get(ord.getCustomerId());
                       topthreecust.put(ord.getCustomerId(), sumOfDiff + Math.abs((ord.getItem().getSalesPrice() - prod.get(ord.getItem().getProductId()).getTargetPrice())));
                   }
                   else 
                   {
                       
                       topthreecust.put(ord.getCustomerId(),  Math.abs((ord.getItem().getSalesPrice() - prod.get(ord.getItem().getProductId()).getTargetPrice())));
                   }
       }
       List<Map.Entry<Integer, Integer>> sortedList = new LinkedList<Map.Entry<Integer, Integer>>(topthreecust.entrySet());
       Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>()
       {
           public int compare(Map.Entry<Integer, Integer> a1, Map.Entry<Integer, Integer> a2) 
           {
              
               return a1.getValue() - a2.getValue();
           }
       });
       HashMap<Integer, Integer> temporaryList = new LinkedHashMap<Integer, Integer>();
       for (Map.Entry<Integer, Integer> abc : sortedList) 
       {
           temporaryList.put(abc.getKey(), abc.getValue());
       }
       List<Integer> key = new ArrayList<>(temporaryList.keySet());
       List<Integer> value = new ArrayList<>(temporaryList.values());
       System.out.println("------------------------------------------------------------------------------");
       System.out.println("Q.2 :Our Top Three customers (The Customers who buy about target price) are: ");
       System.out.println("------------------------------------------------------------------------------");
       System.out.println("\nCustomerID-Difference Values : "+temporaryList);
       for (int i = 0; i < 3; i++) {
           System.out.println("\n Customer Id: " + key.get(i) + " Customer's Profit is : " + value.get(i));
       }
   }
    
    
    
    
    public void getTopThreeSalesPerson() 
    {
       getDiffer();
       List<Map.Entry<Integer, Integer>> sortedList = new LinkedList<Map.Entry<Integer, Integer>>(sale1.entrySet());
       Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>() 
       {
           public int compare(Map.Entry<Integer, Integer> a1, Map.Entry<Integer, Integer> a2)
           {
               return (a1.getValue()).compareTo(a2.getValue());
           }
       }
       );
       HashMap<Integer, Integer> listTemp = new LinkedHashMap<Integer, Integer>();
       for (Map.Entry<Integer, Integer> aa : sortedList) {
           listTemp.put(aa.getKey(), aa.getValue());
       }
       Map<Integer, SalesPerson> salesp = DataStore.getInstance().getSalespeople();
       List<Integer> temporarykeys = new ArrayList<>(listTemp.keySet());
       List<Integer> temporaryvalues = new ArrayList<>(listTemp.values());
       Collections.reverse(temporarykeys);
       Collections.reverse(temporaryvalues);
       System.out.println("\n");
       System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Q.3 : Our top 3 best sales people (The sales person who sells higher that target) are : ");
       System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Sales Array : " + sale1 + "\n");
       for (int i = 0; i < 3; i++)
       {
           for (Map.Entry mappy : salesp.entrySet()) 
           {
               if (temporarykeys.get(i).equals(mappy.getKey())) 
               {
                   System.out.println(mappy.getValue());
                   System.out.println("Total Sale of that Sales Person is :" + temporaryvalues.get(i) + "\n");
               }
           }
       }
   }
    
    public void getTotalRevenue()
    {
       List<Integer> SalesPID = new ArrayList<>();
       getDiffer();
       System.out.println("------------------------------------------------------------------");
       System.out.println("Q.4 : Total Revenue of the year that is above expected target is :");
       System.out.println("------------------------------------------------------------------");
       System.out.println("Sales Array : " + sale1 + "\n");
       int t = 0;
       for (Map.Entry<Integer, Integer> total : sale1.entrySet()) 
       {
           if (total.getValue() > 0) 
           {
               t += total.getValue();
               SalesPID.add(total.getKey());
           }
       }
       System.out.println("Total Profit of the year is: " + t);
       System.out.println("Sales Person responsible for profit are : " + SalesPID);
   }
    
    public void getOptimumPrice() throws IOException
    {
        
        Map<Integer,Product> pro = DataStore.getInstance().getProducts();
        Map<Integer,Order> ord = DataStore.getInstance().getOrders();
        Map<Integer, Integer> additionOfSalesPrice = new HashMap<>();
        Map<Integer, Integer> cntOfProducts = new HashMap<>();
        Map<Integer, Double> averageSalesPrice = new HashMap<>();
        Map<Integer, Double> listOfTargetPrice = new HashMap<>();
        Map<Integer, Double> differenceBetnPriceList = new HashMap<>();
        Map<Integer, Double> errorMarginList = new HashMap<>();
        ArrayList<ProdData> orgD = new ArrayList<>();
        ArrayList<ProdData> modD = new ArrayList<>();

        
        
        for(Order order : ord.values())
        {
            int addition = 0;
            if(additionOfSalesPrice.containsKey(order.getItem().getProductId()))
            {
                addition = additionOfSalesPrice.get(order.getItem().getProductId());
            }
            addition += order.getItem().getSalesPrice()*order.getItem().getQuantity();
            additionOfSalesPrice.put(order.getItem().getProductId(), addition);
        }
        
        for(Order order : ord.values())
        {
            int cnt = 0;
            if(cntOfProducts.containsKey(order.getItem().getProductId()))
            {
                cnt = cntOfProducts.get(order.getItem().getProductId());
            }
            cnt += order.getItem().getQuantity();
            cntOfProducts.put(order.getItem().getProductId(), cnt);
        }
        
        for(int a1 : additionOfSalesPrice.keySet())
        {
            for(int a2 : cntOfProducts.keySet())
            {
                double average;
                if(a1 == a2)
                {
                    average = additionOfSalesPrice.get(a1)/cntOfProducts.get(a2);
                    averageSalesPrice.put(a1, average );
                    
                }
            }
        }
        
        for(Product prod: pro.values())
        {
            double dou = prod.getTargetPrice();
            listOfTargetPrice.put(prod.getProductId(), dou);
            
        }
       
        
        //Difference between avg sales price and target price
        for(int a1 : averageSalesPrice.keySet())
        {
            for(int a2 : listOfTargetPrice.keySet())
            {
                double difference;
                if(a1 == a2)
                {
                    difference = listOfTargetPrice.get(a2) - averageSalesPrice.get(a1);
                    differenceBetnPriceList.put(a1, difference);
                    
                }
            }
        }
        
      
        for(int a1 : differenceBetnPriceList.keySet())
        {
            for(int a2 : averageSalesPrice.keySet())
            {
                double error;
                if(a1 == a2)
                {
                    error = (differenceBetnPriceList.get(a1) / averageSalesPrice.get(a2))*100;
                    errorMarginList.put(a1, error);
                }
            }
        }
        
        for(int a1 : averageSalesPrice.keySet())
        {
            for(int a2 : listOfTargetPrice.keySet())
            {
                for(int a3 : differenceBetnPriceList.keySet())
                {
                    for(int a4 : errorMarginList.keySet())
                    {
                        if(a1 == a2 && a2 == a3 && a4 == a1 &&  a1 == a3 && a4 == a3 && a4 == a2 )
                        {
                            orgD.add(new ProdData(a1, averageSalesPrice.get(a1), listOfTargetPrice.get(a2), differenceBetnPriceList.get(a3), errorMarginList.get(a4)));
                            modD.add(new ProdData(a1, averageSalesPrice.get(a1), listOfTargetPrice.get(a2), differenceBetnPriceList.get(a3), errorMarginList.get(a4)));  
                        }    
                    }
                }
            }
        }
    
        Collections.sort(orgD, Collections.reverseOrder());
        
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("Q.5. A :                   The Original Data is as Follows: ");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("------------------Average Sales Less Than Target Price-----------------------------------------------------");
        System.out.printf("%16s %16s %16s %16s", "Product ID", "     Target Price", "    Average Sales Price",  "    Difference Between Prices");
        System.out.println(" ");
        for(ProdData produData : orgD)
        {
            if(produData.getAvgSalesPrice() < produData.getTargetPrice())
            {
                System.out.format("%16s %16s %16s     %16s", produData.getProductId(),produData.getTargetPrice(), produData.getAvgSalesPrice(),  produData.getDiff());
                System.out.println("");
            }
            
                for(ProdData produData1 : modD)
                {
                    if(produData1.getProductId() == produData.getProductId())
                    {
                        if(produData.getTargetPrice() < (produData.getAvgSalesPrice()- 0.05*produData.getAvgSalesPrice()))
                        {
                            double dou  = produData1.getAvgSalesPrice()- 0.05;
                            produData1.setTargetPrice((int)dou);
                            produData1.setDiff(produData1.getTargetPrice()- produData1.getAvgSalesPrice());
                            produData1.setError(produData1.getDiff()/produData1.getAvgSalesPrice());
                           
                        }
                    }
                }
            }
                
        System.out.println("");
        System.out.println("------------------Average Sales Greater Than Target Price--------------------------------------------------------");
        System.out.printf("%16s   %16s   %16s    %16s", "Product ID", "  Target Price", "  Average Sales Price",  "Difference Between Prices");
        System.out.println("");
        for(ProdData produData : orgD)
        {
            if(produData.getAvgSalesPrice() >= produData.getTargetPrice())
            {
                System.out.format("%16s %16s %16s     %16s", produData.getProductId(), produData.getTargetPrice(), produData.getAvgSalesPrice(), produData.getDiff());
                System.out.println("");
            }
            for(ProdData produData1 : modD)
            {
                    if(produData1.getProductId() == produData1.getProductId())
                    {
                        if(produData1.getTargetPrice() > (produData1.getAvgSalesPrice()+0.05*produData1.getAvgSalesPrice()))
                        {
                            double doub  = produData1.getAvgSalesPrice()-0.05;
                            produData1.setTargetPrice((int)doub);
                            produData1.setDiff(produData1.getTargetPrice()-produData1.getAvgSalesPrice());
                            produData1.setError(produData1.getDiff()/produData1.getAvgSalesPrice());
                            
                        }
                    }
                }
        }
        Collections.sort(modD, Collections.reverseOrder());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Q.5. B :                         The Modified Data is as Follows: ");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("-----------------------------------------------Average Sales Less Than Target Price-------------------------------------------------");
        System.out.printf("%16s %16s %16s %16s %16s", "Product ID", "Modified Target Price", "Average Sales Price",  "   Difference Between Prices", "Error Margin");
        System.out.println("");
        
        for(ProdData produData : modD)
        {
            if(produData.getAvgSalesPrice() < produData.getTargetPrice())
            {
                
                System.out.format("%16s %16s %16s   %16s               %16.3f", produData.getProductId(),  produData.getTargetPrice(), produData.getAvgSalesPrice(), produData.getDiff(), produData.getError());
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("----------------------------------------------Average Sales Greater Than Target Price-----------------------------------------------");
        System.out.printf("%16s %16s %16s %16s %16s", "Product ID", "Modified Target Price", "Average Sales Price",  "   Difference Between Prices", "Error Margin");
        System.out.println("");
        for(ProdData produData1 : modD)
        {
            if(produData1.getAvgSalesPrice() >= produData1.getTargetPrice())
            {
                System.out.format("%16s %16s %16s   %16s               %16.3f", produData1.getProductId(), produData1.getTargetPrice(), produData1.getAvgSalesPrice(),  produData1.getDiff(), produData1.getError());
                System.out.println("");
            }
        }
    }
}
    
    
     












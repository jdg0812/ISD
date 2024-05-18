/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isd.iotbay;

/**
 *
 * @author jogun
 */
public class Product {
    private String product_id;
    private String product_name; 
    private String cost;
    private String stock;
    private String delivery_date;

    public Product(String product_id, String product_name, String cost, String stock, String delivery_date) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.cost = cost;
        this.stock = stock;
        this.delivery_date = delivery_date;
    }
    
    public String getProduct_id(){
        return product_id; 
    }
    
    public void setProduct_id(String product_id){
        this.product_id = product_id;
    }
    
    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }
    
    
    
}

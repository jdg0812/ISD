/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isd.iotbay.dao;

import com.isd.iotbay.Product;
import java.sql.*; 
import java.util.ArrayList; 

/**
 *
 * @author jogun
 */
public class DBManager {
    private Statement st; 
    public DBManager(Connection conn) throws SQLException {
        st = conn.createStatement(); 
    }
    
    public Product findProduct(String product_name) throws SQLException{
        String fetch = "Select * from ISDUSER.Products where product_name = '"+product_name+"'";
        ResultSet rs = st.executeQuery(fetch);
        
        while (rs.next()) {
        String product_productname = rs.getString(2);
        if (product_productname.equals(product_name)) {
            String product_productid = rs.getString(1);
            String product_cost = rs.getString(3);
            String product_stock = rs.getString(4);
            String product_deliverydate = rs.getString(5);
            return new Product(product_productid, product_productname, product_cost, product_stock, product_deliverydate);
        }
    }
    return null;
    }
    
    public void addProduct(String product_id, String product_name, String cost, String stock, String delivery_date) throws SQLException{
        st.executeUpdate("INSERT INTO ISDUSER.Products" + "VALUES('"+product_id+"', '"+product_name+"', '"+cost+"', '"+stock+"', '"+delivery_date+"')");
        
    }
    
    public void updateProduct(String product_id, String product_name, String cost, String stock, String delivery_date) throws SQLException {        
        String query = "UPDATE ISDUSER.Products SET PRODUCT_NAME = ('"+product_name+"'), COST = ('"+cost+"'), STOCK = ("+stock+") DELIVERY_DATE = ('"+delivery_date+"') WHERE PRODUCT_ID = ("+product_id+")";
        st.executeUpdate(query);
    }
    
    public void deleteProduct(String product_name) throws SQLException {
        String query = "DELETE FROM IOTBAY.PRODUCT WHERE (PRODUCT_NAME) = ('"+product_name+"')";
        st.executeUpdate(query);
    }
    
    public ArrayList<Product>  fetchProducts() throws SQLException{
        String fetch = "select * from PRODUCTS"; 
        ResultSet rs = st.executeQuery(fetch); 
        ArrayList<Product> temp = new ArrayList(); 
        
        while (rs.next()){
            String product_id = rs.getString(1); 
            String product_name = rs.getString(2); 
            String cost = rs.getString(3); 
            String stock = rs.getString(4);
            String delivery_date = rs.getString(5); 
            temp.add(new Product(product_id, product_name, cost, stock, delivery_date));
        }
        
        return temp;
    }
    

}

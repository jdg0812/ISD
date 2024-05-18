
package com.isd.controller;

 

import com.isd.iotbay.Product;
import com.isd.iotbay.dao.DBConnector;
import com.isd.iotbay.dao.DBManager;
import java.sql.*;

import java.util.*;

import java.util.logging.*;

 

public class TestDB {

    private static Scanner in = new Scanner(System.in);
    private DBConnector connector; 
    private Connection conn; 
    private DBManager db; 

    public static void main(String[] args) throws SQLException{
        (new TestDB()).runQueries();
    }    
    
    public TestDB(){
        try {
            connector = new DBConnector();
            conn = connector.openConnection();
            db = new DBManager(conn);
        } catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private char readChoice(){
        System.out.print("Operation CRUDS or * to exit:");
        return in.nextLine().charAt(0);
    }
    
    private void runQueries() throws SQLException{
        char c;
        while ((c = readChoice()) != '*'){
            switch (c) {
                case 'C': 
                    testAdd(); 
                    break;
                case 'R': 
                    testRead(); 
                    break; 
                case 'U': 
                    //testUpdate(); 
                    break; 
                case 'D': 
                    //testDelete(); 
                    break; 
                case 'S': 
                    //testShow(); 
                    break; 
                default: 
                    System.out.println("Unknown Command"); 
                         
            }
        }
    }
    
    private void testAdd() {
        System.out.print("Product id");
        String product_id = in.nextLine(); 
        System.out.print("Product name"); 
        String product_name = in.nextLine(); 
        System.out.print("cost"); 
        String cost = in.nextLine(); 
        System.out.print("stock"); 
        String stock = in.nextLine(); 
        System.out.print("delivery date"); 
        String delivery_date = in.nextLine(); 
        
        try {
            db.addProduct(product_id, product_name, cost, stock, delivery_date); 
        } catch(SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Product is added to the database");     
    }
    private void testRead() throws SQLException { 
        System.out.print("Product name"); 
        String product_name = in.nextLine(); 
        Product product = db.findProduct(product_name); 
        if (product != null){
            System.out.println("Product" + product.getProduct_name() + "exists in the database."); 
        } else {
            System.out.println("Product does not exist");
        }
    }
    
    
    
    
  

}
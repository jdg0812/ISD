/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isd.iotbay.dao;
import java.sql.Connection;

/**
 *
 * @author jogun
 */
public abstract class DB {
    protected String URL = "jdbc:derby://localhost:1527"; 
    protected String db = "usersdb"; 
    protected String dbuser = "isduser"; 
    protected String dbpass = "admin"; 
    protected String driver = "org.apache.derby.jdbc.ClientDriver"; 
    protected Connection conn;
}
<%-- 
    Document   : Collection_add_conf.jsp
    Created on : 13/05/2024, 8:58:51 PM
    Author     : jogun
--%>

<%@page import="com.isd.iotbay.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Added</title>
    </head>
    <body>
        <%
            String product_id = request.getParameter("product_id");
            String product_name = request.getParameter("product_name");
            String cost = request.getParameter("cost");
            String stock = request.getParameter("stock"); 
            String delivery_date = request.getParameter("delivery_date");
        %>
        <h1>Product Added to Collection</h1>
        <p><%=product_id%></p>
        <p><%=product_name%></p>
        <p><%=cost%></p>
        <p><%=stock%></p>
        <p><%=delivery_date%></p>
    </body>
    
    <a href="Collection_show.jsp">Collections List</a>
    
    <% 
        Product product = new Product(product_id,product_name, cost, stock, delivery_date);
        session.setAttribute("product", product);
    %>   
</html>

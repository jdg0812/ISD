<%-- 
    Document   : Collection_show
    Created on : 13/05/2024, 9:05:17 PM
    Author     : jogun
--%>

<%@page import="com.isd.iotbay.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Collection</title>
    </head>
    <body>
        <% 
            Product product = (Product)session.getAttribute("product");
        %>
        
        <h1>Collection</h1>
        <div>
            <a href='Collection_update.jsp'>Edit</a>
            <a href='Collection_manage.jsp'>Back to Collection Management </a>
        </div>
        <table>
            <thead>
                <th>Product ID:</th>
                <th>Product Name:</th>
                <th>Cost:</th>
                <th>Stock:</th>
                <th>Delivery Date:</th>
            </thead>
            <tr>
                <td></td>
                <td>${product.product_name}</td>
                <td>${product.cost}</td>
                <td>${product.stock}</td>
                <td>${product.delivery_date}</td>
            </tr>
        </table>
    </body>
</html>

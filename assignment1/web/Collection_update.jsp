<%-- 
    Document   : Collection_update
    Created on : 14/05/2024, 6:50:21 PM
    Author     : jogun
--%>

<%@page import="com.isd.iotbay.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product</title>
    </head>
    <body>
        <% 
            Product product = (Product)session.getAttribute("product");
            String updated = request.getParameter("updated");
        %>
        
        <h1>Update Product Details </h1>
        
        <h3><span> <%= (updated != null)? "Update was successful":"" %></span></h3>
        <form action="Collection_update.jsp" method="post">
            <table>
                <tr>
                <td>Product ID:</td>
                <td><input type='text' name='product_id' value = "${product.product_id}"></td>
                </tr>
                <tr>
                <td>Product Name:</td>
                <td><input type='text' name='product_name' value="${product.product_name}"></td>
                </tr>
                <tr>
                <td>Cost:</td>
                <td><input type='text' name='cost' value="${product.cost}"></td>
                </tr>
                <tr>
                <td>Stock:</td>
                <td><input type='text' name='stock' value="${product.stock}"></td>
                </tr>
                <tr>
                <td>Delivery Date:</td>
                <td><input type='date' name='delivery_date' value="${product.delivery_date}"></td>
                </tr>
            </table>
            <input type='submit' value ='Update Product Details'>
            <input type="hidden" name="updated" value ="updated">
            <a href="Collection_show.jsp">Product List</a>
        </form>    
                <%
                    String product_id = request.getParameter("product_id");
                    String product_name = request.getParameter("product_name");
                    String cost = request.getParameter("cost");
                    String stock = request.getParameter("stock");
                    String delivery_date = request.getParameter("delivery_date");
                    product = new Product(product_id, product_name, cost, stock, delivery_date);
                    session.setAttribute("product", product);
                %>
    </body>
</html>

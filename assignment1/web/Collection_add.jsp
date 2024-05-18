<%-- 
    Document   : Collection_add
    Created on : 13/05/2024, 7:02:13 PM
    Author     : jogun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product to Collection</title>
    </head>
    <body>
        <h1>Add Product to Collection</h1>
        
        <form action="Collection_add_conf.jsp" method="post">
            <table>
                <tr>
                <td>Product ID:</td>
                <td><input type='text' name='product_id'></td>
                </tr>
                <tr>
                <td>Product Name:</td>
                <td><input type='text' name='product_name'></td>
                </tr>
                <tr>
                <td>Cost:</td>
                <td><input type='text' name='cost'></td>
                </tr>
                <tr>
                <td>Stock:</td>
                <td><input type='text' name='stock'></td>
                </tr>
                <tr>
                <td>Delivery Date:</td>
                <td><input type='date' name='delivery_date'></td>
                </tr>
            </table>
            <input type='submit' value ='Add Product'>
            
        </form>    
            
        
        <div>
            <a href='Collection_manage.jsp'>Back to Collection Management</a>
          
        </div>
    </body>
</html>

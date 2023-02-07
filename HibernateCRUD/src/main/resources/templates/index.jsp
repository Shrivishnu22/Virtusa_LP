<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8"/>
<title>Product Manager</title>
</head>

 
<body>
<div align="center">
    <h1>Product List</h1>
    <a href="/new">Create New Product</a>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Made In</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="product : ${listProducts}">
                <td th:text="${product.id}">Product ID</td>
                <td th:text="${product.name}">Name</td>
                <td th:text="${product.brand}">Brand</td>
                <td th:text="${product.madein}">Made in</td>
                <td th:text="${product.price}">Price</td>
                <td> 
                    <a th:href="@{/edit/{id}(id=${product.id})}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                     <a th:href="@{/delete/{id}(id=${product.id})}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
</div>   
</body>
</html>
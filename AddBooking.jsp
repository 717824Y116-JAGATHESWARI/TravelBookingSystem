<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Booking</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
}

.container {
    width: 400px;
    margin: 50px auto;
    padding: 20px;
    background: white;
    border-radius: 8px;
    box-shadow: 0px 0px 10px gray;
}

h2 {
    text-align: center;
}

input[type="text"],
input[type="date"] {
    width: 100%;
    padding: 8px;
    margin-top: 5px;
    margin-bottom: 15px;
}

input[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #45a049;
}

a {
    text-decoration: none;
}
</style>

</head>
<body>

<div class="container">

<h2>Add Travel Booking</h2>

<form action="../addBooking" method="post">

    <label>Customer Name</label>
    <input type="text" name="customername" required>

    <label>Destination</label>
    <input type="text" name="destination" required>

    <label>Travel Date</label>
    <input type="date" name="traveldate" required>

    <label>Package Price</label>
    <input type="text" name="packageprice" required>

    <input type="submit" value="Add Booking">

</form>

<br>
<center>
<a href="../index.jsp">⬅ Back to Home</a>
</center>

</div>

</body>
</html>

<%@ page import="java.util.*,com.travel.model.Booking" %>
<!DOCTYPE html>
<html>
<head>
<title>View Bookings</title>
</head>
<body>

<h2>All Travel Bookings</h2>

<a href="add_booking.jsp">Add New Booking</a>
<br><br>

<table border="1" cellpadding="10">
<tr>
<th>ID</th>
<th>Name</th>
<th>Destination</th>
<th>Date</th>
<th>Price</th>
</tr>

<%
List<Booking> list = (List<Booking>) request.getAttribute("bookingList");
if(list != null){
for(Booking b : list){
%>

<tr>
<td><%= b.getBookingid() %></td>
<td><%= b.getCustomername() %></td>
<td><%= b.getDestination() %></td>
<td><%= b.getTraveldate() %></td>
<td><%= b.getPackageprice() %></td>
</tr>

<%
}
}
%>

</table>

<br>
<a href="../index.jsp">Back to Home</a>

</body>
</html>

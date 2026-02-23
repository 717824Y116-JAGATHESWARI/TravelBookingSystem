package com.travel.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.travel.dao.BookingDAOImpl;
import com.travel.model.Booking;

@WebServlet("/addBooking")
public class AddBookingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String customername = request.getParameter("customername");
            String destination = request.getParameter("destination");
            String traveldateStr = request.getParameter("traveldate");
            String packagepriceStr = request.getParameter("packageprice");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date traveldate = sdf.parse(traveldateStr);

            double packageprice = Double.parseDouble(packagepriceStr);

            Booking booking = new Booking();
            booking.setCustomername(customername);
            booking.setDestination(destination);
            booking.setTraveldate(traveldate);
            booking.setPackageprice(packageprice);

            BookingDAOImpl dao = new BookingDAOImpl();
            dao.addBooking(booking);

            response.sendRedirect("view_bookings");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.travel.model;
import java.util.Date;

public class Booking {

    private int bookingid;
    private String customername;
    private String destination;
    private Date traveldate;
    private double packageprice;

    public int getBookingid() { return bookingid; }
    public void setBookingid(int bookingid) { this.bookingid = bookingid; }

    public String getCustomername() { return customername; }
    public void setCustomername(String customername) { this.customername = customername; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public Date getTraveldate() { return traveldate; }
    public void setTraveldate(Date traveldate) { this.traveldate = traveldate; }

    public double getPackageprice() { return packageprice; }
    public void setPackageprice(double packageprice) { this.packageprice = packageprice; }
}

package com.jyoti.bookingservice.ws;
import javax.xml.ws.Endpoint;
import com.jyoti.bookingservice.ws.FlightBookingService;
/**
 * Created by lpoon2 on 2/2/2017.
 */
public class FlightBookingServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/", new FlightBookingService());

        System.out.println("The web service is published at http://localhost:8080/OrderProcessWeb/orderprocess");

        System.out.println("To stop running the web service , terminate the java process");
    }
}
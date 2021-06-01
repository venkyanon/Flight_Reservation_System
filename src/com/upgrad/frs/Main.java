package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {

        Ticket regularTicket = new RegularTicket("1A22B8", "Hyderabad", "Maldives", null, "DepartureDateTime", "ArrivalDateTime", null, 50000, false, "4A", "lunch");
        Ticket touristTicket = new TouristTicket("95AA54", "Hyderabad", "UAE", null, "DepartureDateTime", "ArrivalDateTime", null, 100000, false, "1B", "uae Resort", new String[]{" "});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }


}

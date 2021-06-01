package com.upgrad.frs;

public class RegularTicket extends Ticket {

    private String specialServices;

    public RegularTicket(String pnr,String from,String to,Flight flight,String departureDateTime,String arrivalDateTime,Passenger passenger,float price, boolean cancelled,String seatNo,String specialServices){
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, price, cancelled, seatNo);
        this.specialServices=specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    @Override
    public String toString() {
        return "RegularTicket{" +
                "specialServices='" + specialServices + '\'' +
                '}';
    }
}

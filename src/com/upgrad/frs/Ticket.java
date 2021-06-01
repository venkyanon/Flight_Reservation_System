package com.upgrad.frs;
import  java.time.LocalDateTime;
public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private  String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private float price;
    private boolean cancelled;
    private String seatNo;


    public Ticket(String pnr,String from,String to,Flight flight,String departureDateTime,String arrivalDateTime,Passenger passenger,float price, boolean cancelled,String seatNo){
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.flight=flight;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.passenger=passenger;
        this.price=price;
        this.cancelled=cancelled;
        this.seatNo=seatNo;
    }
    public String checkStatus(){
        return cancelled ? "Cancelled" : "Confirmed";
    }
    public int getFlightDuration(){
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth()-departureLocalDateTime.getDayOfMonth())*24 +(arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());

    }

    public void cancel(){
        cancelled=true;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}

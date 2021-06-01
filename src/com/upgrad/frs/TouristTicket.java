package com.upgrad.frs;

import java.util.Arrays;

public class TouristTicket extends Ticket{

    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket( String pnr,String from,String to,Flight flight,String departureDateTime,String arrivalDateTime,Passenger passenger,float price, boolean cancelled,String seatNo,String hotelAddress,String[] selectedTouristLocation) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, price, cancelled, seatNo);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public void removeTouristLocation(String location){
        int index=-1;
        for(int i=0;i<selectedTouristLocation.length;i++){
            if(selectedTouristLocation[i]==(location)){
                index=i;
                break;
            }
        }
        if (index==-1){
            return;
        }
        for(int i=index;i<selectedTouristLocation.length;i++){
            selectedTouristLocation[i]=selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length-1]=null;
    }
    public void addTouristLocation(String location){
        int index = -1;
        for(int i=0; i< selectedTouristLocation.length;i++){
            if (selectedTouristLocation[i]==null){
                index = i;
                break;
            }
        }
        if(index!=-1){
            selectedTouristLocation[index]=location;
        }
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    @Override
    public String toString() {
        return "TouristTicket{" +
                "hotelAddress='" + hotelAddress + '\'' +
                ", selectedTouristLocation=" + Arrays.toString(selectedTouristLocation) +
                '}';
    }
}

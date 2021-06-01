package com.upgrad.frs;

public class Passenger {
    private static int idCounter=0;
    private int id;

    private static class Address{
        String street, city, state;

        Address(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
    }
    private Address address;

    private static class Contact {
        String name, email, phone;

        Contact(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }
    }
    private Contact contact;

    public Passenger(String street,String city,String state,String name,String email,String phone){
        this.id=++idCounter;
        this.address=new Address(street,city,state);
        this.contact=new Contact(name,email,phone);

    }
    public int getId(){
        return  this.id;
    }
    public String getAddressDetails(){
        return "Street: "+address.street+", City: "+address.city+", State: "+address.state;
    }

    public String getContactDetails(){
        return "Name: "+contact.name+", Email: "+contact.email+", Phone: "+contact.phone;
    }
    public static int getPassengerCount(){
        return idCounter;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", address=" + address +
                ", contact=" + contact +
                '}';
    }
}

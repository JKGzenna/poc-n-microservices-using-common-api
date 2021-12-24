package com.example.dto.libraries.uk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserViewUK {

    //Attributes From Common API
    private long id;
    private String name;
    private String surname;
    private String country;
    private List<String> notifications;
    private double accountbalance;
    private List<String> creditcards;
    private boolean inversionproducts;

    //UK Customization Attributes
    private boolean youngplan = true;
    private double averagebalance = accountbalance / 12 + 500.50;

    public UserViewUK(){
    }

    //Getters for Common API
    public long getId() { return id; }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCountry() {
        return country;
    }
    public List<String> getNotifications() { return notifications; }
    public double getAccountbalance() { return accountbalance; }
    public List<String> getCreditcards() { return creditcards; }
    public boolean isInversionproducts() {return inversionproducts;}

    //Getters for UK Customization Attributes
    public boolean isYoungplan() {return youngplan;}
    public double getAveragebalance() { return averagebalance; }

}

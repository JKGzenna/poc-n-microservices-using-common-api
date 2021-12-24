package com.example.dto.libraries.portugal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserViewPortugal {

    //Attributes From Common API
    private long id;
    private String name;
    private String surname;
    private String country;
    private List<String> notifications;
    private double accountbalance;
    //Friends are deprecated in API and should not be used
    private List<String> friends;
    private List<String> creditcards;
    private boolean inversionproducts;

    //Portugal Customization Attributes
    private boolean insurances = true;

    public UserViewPortugal(){
    }

    //Getters for Common API
    public long getId() {
        return id;
    }
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
    //Friends are deprecated in API and should not be used
    public List<String> getFriends() { return friends; }
    public List<String> getCreditcards() { return creditcards; }
    public boolean isInversionproducts() {return inversionproducts;}

    //Getters for Portugal Customization Attributes
    public boolean isInsurances() {return insurances;}

}

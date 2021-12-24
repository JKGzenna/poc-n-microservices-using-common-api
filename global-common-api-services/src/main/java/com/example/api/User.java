package com.example.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
public class User {

    private final long id;
    private final String name;
    private final String surname;
    private final String country;
    private final List<String> notifications;
    private final double accountbalance;
    private final List<String> creditcards;
    //Only for Spain
    private final long aviopoints;
    //Friends are deprecated and should not be used, only for Portugal
    private final List<String> friends;
    private final boolean inversionproducts;

    public User(int id) {
        String[] names = {"Juan Luis", "Juan Luis", "Patrick", "Joao", "Javier"};
        String[] surnames = {"Goldaracena", "Goldaracena", "Miller", "Sousa", "Leyva"};
        String[] countries = {"Spain", "Spain", "UK", "Portugal", "Spain"};

        name = names[id%5];
        surname = surnames[id%5];
        country = countries[id%5];
        notifications= new ArrayList<>();
        notifications.add("Your agent has tried to contact you at 8:45AM");
        notifications.add("You have new messages");
        creditcards= new ArrayList<>();
        creditcards.add("1234 5678 9101 1121");
        creditcards.add("1211 1219 9765 4321");
        accountbalance = id * 1000 + 1000.50;
        //Only for Spain
        aviopoints = id * 31 % 1000;
        //Friends are deprecated and should not be used, only for Portugal
        friends = new ArrayList<>();
        friends.add("Fernando Pinto");
        friends.add("Leonardo Meireles");
        inversionproducts = true;

        this.id = id;
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
    public List<String> getNotifications() {
        return notifications;
    }
    public double getAccountbalance() { return accountbalance; }
    public List<String> getCreditcards() {
        return creditcards;
    }
    //Only for Spain
    public long getAviopoints() {
        return aviopoints;
    }
    //Friends are deprecated and should not be used, only for Portugal
    public List<String> getFriends() {
        return friends;
    }
    public boolean isInversionproducts() {return inversionproducts;}
}

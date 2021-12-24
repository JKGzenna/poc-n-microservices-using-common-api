package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
public class User {

    private final long id;
    private final String forename;
    private final String surname;
    private final String country;
    private final List<String> notifications;
    private final double accountbalance;
    private final long points;
    //Friends are deprecated and should not be used
    private final List<String> friends;

    public User(int id) {
        String[] forenames = {"Juan Luis", "Juan Luis", "Patrick", "Joao", "Javier"};
        String[] surnames = {"Goldaracena", "Goldaracena", "Miller", "Sousa", "Leyva"};
        String[] countries = {"Spain", "Spain", "UK", "Portugal", "Spain"};

        forename = forenames[id%5];
        surname = surnames[id%5];
        country = countries[id%5];
        notifications= new ArrayList<>();
        notifications.add("You have been promoted!");
        notifications.add("Sorry, disregard the previous notifaction- wrong user");
        accountbalance = id * 1000 + 1000.50;
        points = id * 31 % 1000;

        //You have no friends
        friends = new ArrayList<>();

        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getForename() {
        return forename;
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

    public double getAccountbalance() {
        return accountbalance;
    }

    public long getPoints() {
        return points;
    }

    public List<String> getFriends() {
        return friends;
    }
}

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
    private final long points;
    //Friends are deprecated and should not be used
    private final List<String> friends;

    public User(int id) {
        String[] forenames = {"Juan Luis", "Javier", "Joao", "Patrick"};
        String[] surnames = {"Goldaracena", "Leyva", "Sousa", "Miller"};
        String[] countries = {"Spain", "Portugal", "UK"};

        forename = forenames[id%3];
        surname = surnames[id%4];
        country = countries[id%2];
        notifications= new ArrayList<>();
        notifications.add("You have been promoted!");
        notifications.add("Sorry, disregard the previous notifaction- wrong user");
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

    public String getOrganisation() {
        return country;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public long getPoints() {
        return points;
    }

    public List<String> getFriends() {
        return friends;
    }
}

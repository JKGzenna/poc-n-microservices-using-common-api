package com.example.dto.libraries.spain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserViewSpain {

    //Attributes From Common API
    private long id;
    private String name;
    private String surname;
    private String country;
    private List<String> notifications;
    private double accountbalance;
    private List<String> creditcards;
    //Only for Spain
    private long aviopoints;
    private boolean inversionproducts;

    //Spain Customization Attributes

    //Con Sobrecarga en el método y con la propiedad como no final, no hace falta generar Getter
    //private final boolean bansacar = true;
    //public UserViewSpain(boolean bansacar){
        //this.bansacar = bansacar;
    //}

    //Método vacío sin sobrecarga y con la propiedad/atributo como no final, debemos por tanto generar el getter
    private boolean bansacar = true;
    public UserViewSpain(){
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
    public List<String> getCreditcards() { return creditcards; }
    public long getAviopoints() {
        return aviopoints;
    }
    public boolean isInversionproducts() {return inversionproducts;}

    //Getters for Spain Customization Attributes
    public boolean isBansacar() {return bansacar;}
    //Si declaramos nuestra personalización con final y la metemos como argumento necesario al constructor
    //siempre estara esperando ese argumento y no hace falta generar su getter, si dejamos el constructor
    //vacio y declaramos no final nuestra propiedad/atributo tambien funcionara.

}

package com.example.dashboard;

import com.example.dto.libraries.portugal.UserViewPortugal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@RestController
public class UserDashboardControllerPortugal {

    @RequestMapping("/dashboard")
    public String getUser(@RequestParam(value="id", defaultValue="1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserViewPortugal user = restTemplate.getForObject("http://localhost:9001/user?id="+id, UserViewPortugal.class);
        return "USER DASHBOARD <br>" +
                "Welcome " + user.getName() +" "+ user.getSurname()+"<br>"+
                "Your Account Balance: " + user.getAccountbalance() + "€"+"<br>"+
                "Bank Insurances: " +user.isInsurances()+"<br>"+
                "Your Country: " +user.getCountry();
    }

}

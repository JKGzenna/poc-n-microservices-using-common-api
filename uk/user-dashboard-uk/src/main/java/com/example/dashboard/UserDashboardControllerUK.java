package com.example.dashboard;

import com.example.dto.libraries.uk.UserViewUK;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@RestController
public class UserDashboardControllerUK {

    @RequestMapping("/dashboard")
    public String getUser(@RequestParam(value="id", defaultValue="1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserViewUK user = restTemplate.getForObject("http://localhost:9001/user?id="+id, UserViewUK.class);
        return "USER DASHBOARD <br>" +
                "Welcome " + user.getName() +" "+ user.getSurname()+"<br>"+
                "Your Account Balance: " + user.getAccountbalance() + "€"+"<br>"+
                "Your Country: " +user.getCountry();
    }

}

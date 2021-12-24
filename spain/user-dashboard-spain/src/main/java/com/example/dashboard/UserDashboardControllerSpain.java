package com.example.dashboard;

import com.example.dto.libraries.spain.UserViewSpain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@RestController
public class UserDashboardControllerSpain {

    @RequestMapping("/dashboard")
    public String getUser(@RequestParam(value="id", defaultValue="1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserViewSpain user = restTemplate.getForObject("http://localhost:9001/user?id="+id, UserViewSpain.class);
        return "USER DASHBOARD <br>" +
                "Welcome " + user.getName() +" "+ user.getSurname()+"<br>"+
                "You have " + user.getAviopoints() + " points!, Good job!"+"<br>"+
                "Your Account Balance: " + user.getAccountbalance() + "€"+"<br>"+
                "Your Country: " +user.getCountry();
    }

}

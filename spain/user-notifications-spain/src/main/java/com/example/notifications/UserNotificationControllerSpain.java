package com.example.notifications;

import com.example.dto.libraries.spain.UserViewSpain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Juan Luis Goldaracena Izquierdo
 */
@RestController
public class UserNotificationControllerSpain {

    @RequestMapping("/notification")
    public String getUser(@RequestParam(value="id", defaultValue="1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserViewSpain user = restTemplate.getForObject("http://localhost:9001/user?id="+id, UserViewSpain.class);
        String response = "NOTIFICATIONS";
        int number = 1;
        for(String notification : user.getNotifications()){
            response += "<BR> Notification number "+(number++)+": "+notification;
        }
        return response;
    }

}

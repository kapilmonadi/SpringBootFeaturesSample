package com.kapil.client;

import com.kapil.dto.UserRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String endpointURL = "http://localhost:8080/api/v1/users/get/0";

        ResponseEntity<UserRecord> responseEntity = restTemplate.getForEntity(endpointURL, UserRecord.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            UserRecord userRecord = responseEntity.getBody();
            System.out.println(userRecord);
        }
        else{
            System.out.println("Exception occurred with status code  "
                    + responseEntity.getStatusCode()
                    + " and error message" + responseEntity.getBody());
        }
    }
}

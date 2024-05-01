package com.example.Phase3_Practiceproject5.services;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

    private static final String QUOTE_API_URL = "https://type.fit/api/quotes";

    public String getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(QUOTE_API_URL, String.class);
    }
}

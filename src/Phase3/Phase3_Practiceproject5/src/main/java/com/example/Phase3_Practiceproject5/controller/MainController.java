package com.example.Phase3_Practiceproject5.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Phase3_Practiceproject5.services.Quote;
import com.example.Phase3_Practiceproject5.services.QuoteService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MainController {

    private QuoteService quoteService;

    public MainController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
    @GetMapping("/")
    public String getQuote(Model model) {
        String quoteJson = quoteService.getQuote();
        Quote quote = null; // Initialize quote to null

        // Parse JSON string to Quote object using a library like Jackson
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            quote = objectMapper.readValue(quoteJson, Quote.class);
        } catch (IOException e) {
            // Handle exception (e.g., log error, return default quote)
            quote = new Quote();
            quote.setText("Failed to fetch quote");
            quote.setAuthor("Unknown");
        }

        model.addAttribute("quote", quote);
        return "quote";
    }

}

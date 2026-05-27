package com.example.demo.que_13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    public PaymentResponse callPaymentService() {

        String url = "http://payment-service/api/pay";

        return restTemplate.getForObject(url, PaymentResponse.class);
    }

    // Fallback method
    public PaymentResponse fallbackPayment(Exception ex) {

        PaymentResponse response = new PaymentResponse();
        response.setStatus("FAILED");
        response.setMessage("Payment service is unavailable");

        return response;
    }
}
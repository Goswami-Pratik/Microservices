package com.microservices.fraud;

import com.microservices.clients.fraud.FraudCheckResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
public record FraudCheckHistoryController(FraudCheckService fraudCheckService) {
    @GetMapping (path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudster = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("Performing Customer Fraud Check {CustomerId={} isFraudster={}}", customerId, isFraudster);
        return new FraudCheckResponse(isFraudster);
    }
}
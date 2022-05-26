package com.microservices.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

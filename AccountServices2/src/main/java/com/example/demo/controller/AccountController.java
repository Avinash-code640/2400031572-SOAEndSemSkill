
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/balance")
    public String getBalance() {
        return "Account Balance: Rs. 50000";
    }

    @GetMapping("/details")
    public String getDetails() {
        return "Bank Account Details: SBI - Account Active";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Account Status: Active";
    }
}

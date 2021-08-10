package com.bfdestiny.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
    @GetMapping("/invoice-status")
    public String getInvoiceStatus() {
        return "invoice-status";
    }
}

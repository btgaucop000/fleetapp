package com.bfdestiny.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
    @GetMapping("/vehicle-types")
    public String getVehicleType() {
        return "vehicle-type";
    }
}

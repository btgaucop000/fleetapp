package com.bfdestiny.fleetapp.controller;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model) {
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("/countries/add")
    public String addCountry(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }
}

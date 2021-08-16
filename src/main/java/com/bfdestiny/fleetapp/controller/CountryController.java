package com.bfdestiny.fleetapp.controller;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model) {
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("/countries/add")
    public String addCountry(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }

    @RequestMapping("/countries/get")
    @ResponseBody
    public Optional<Country> getCountry(int id) {
        return countryService.getCountryById(id);
    }

    @RequestMapping(value = "/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateCountry(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteCountry(int id) {
        countryService.deleteCountry(id);
        return "redirect:/countries";
    }
}

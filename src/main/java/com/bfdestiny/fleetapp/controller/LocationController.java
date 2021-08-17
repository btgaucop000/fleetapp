package com.bfdestiny.fleetapp.controller;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.model.Location;
import com.bfdestiny.fleetapp.model.State;
import com.bfdestiny.fleetapp.service.CountryService;
import com.bfdestiny.fleetapp.service.LocationService;
import com.bfdestiny.fleetapp.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private StateService stateService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public String getLocations(Model model) {
        List<State> stateList = stateService.getAllSates();
        List<Country> countryList = countryService.getAllCountries();
        List<Location> locationList = locationService.getAllLocations();
        model.addAttribute("states", stateList);
        model.addAttribute("countries", countryList);
        model.addAttribute("locations", locationList);
        return "location";
    }

    @PostMapping("/locations/add")
    public String addLocation(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping("/locations/get")
    @ResponseBody
    public Optional<Location> getLocation(int id) {
        return locationService.getLocationById(id);
    }

    @RequestMapping(value = "/locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateLocation(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value = "/locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteLocation(int id) {
        locationService.deleteLocation(id);
        return "redirect:/locations";
    }
}

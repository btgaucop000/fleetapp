package com.bfdestiny.fleetapp.controller;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.model.State;
import com.bfdestiny.fleetapp.service.CountryService;
import com.bfdestiny.fleetapp.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;

    @Autowired
    private CountryService countryService;

    @GetMapping("/states")
    public String getStates(Model model) {
        List<State> stateList = stateService.getAllSates();
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("states", stateList);
        model.addAttribute("countries", countryList);
        return "state";
    }

    @PostMapping("/states/add")
    public String addState(State state) {
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping("/states/get")
    @ResponseBody
    public Optional<State> getState(int id) {
        return stateService.getStateById(id);
    }

    @RequestMapping(value = "/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateState(State state) {
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(int id) {
        stateService.deleteState(id);
        return "redirect:/states";
    }
}

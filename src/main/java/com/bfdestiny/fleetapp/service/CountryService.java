package com.bfdestiny.fleetapp.service;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }
}

package com.bfdestiny.fleetapp.service;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public void save(Country country) {
        countryRepository.save(country);
    }

    public Optional<Country> getCountryById(int id) {
        return countryRepository.findById(id);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }
}

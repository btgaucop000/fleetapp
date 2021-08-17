package com.bfdestiny.fleetapp.service;

import com.bfdestiny.fleetapp.model.Location;
import com.bfdestiny.fleetapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public void save(Location location) {
        locationRepository.save(location);
    }

    public Optional<Location> getLocationById(int id) {
        return locationRepository.findById(id);
    }

    public void deleteLocation(int id) {
        locationRepository.deleteById(id);
    }
}

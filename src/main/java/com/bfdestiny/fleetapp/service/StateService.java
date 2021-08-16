package com.bfdestiny.fleetapp.service;

import com.bfdestiny.fleetapp.model.Country;
import com.bfdestiny.fleetapp.model.State;
import com.bfdestiny.fleetapp.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getAllSates() {
        return stateRepository.findAll();
    }

    public void save(State state) {
        stateRepository.save(state);
    }

    public Optional<State> getStateById(int id) {
        return stateRepository.findById(id);
    }

    public void deleteState(int id) {
        stateRepository.deleteById(id);
    }
}

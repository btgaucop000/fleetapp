package com.bfdestiny.fleetapp.repository;

import com.bfdestiny.fleetapp.model.Client;
import com.bfdestiny.fleetapp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
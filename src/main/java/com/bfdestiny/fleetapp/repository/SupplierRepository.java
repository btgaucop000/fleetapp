package com.bfdestiny.fleetapp.repository;

import com.bfdestiny.fleetapp.model.Client;
import com.bfdestiny.fleetapp.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}

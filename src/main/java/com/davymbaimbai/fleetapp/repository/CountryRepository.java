package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}

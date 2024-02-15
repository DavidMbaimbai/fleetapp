package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}

package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {
}

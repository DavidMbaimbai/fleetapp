package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}

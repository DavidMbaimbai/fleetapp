package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
}

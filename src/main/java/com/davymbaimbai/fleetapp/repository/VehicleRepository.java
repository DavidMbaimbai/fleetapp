package com.davymbaimbai.fleetapp.repository;


import com.davymbaimbai.fleetapp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}

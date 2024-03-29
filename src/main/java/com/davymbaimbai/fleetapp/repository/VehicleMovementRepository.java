package com.davymbaimbai.fleetapp.repository;
import com.davymbaimbai.fleetapp.model.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {
}

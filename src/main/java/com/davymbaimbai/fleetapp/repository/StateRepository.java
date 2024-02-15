package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}

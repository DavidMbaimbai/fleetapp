package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
}

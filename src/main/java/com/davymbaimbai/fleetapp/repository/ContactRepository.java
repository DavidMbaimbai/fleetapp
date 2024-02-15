package com.davymbaimbai.fleetapp.repository;

import com.davymbaimbai.fleetapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}

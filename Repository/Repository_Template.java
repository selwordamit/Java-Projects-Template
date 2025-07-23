package com.example.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * Repository for accessing and managing [EntityName] entities.
 */
@Repository
public interface [EntityName]Repository extends JpaRepository<[EntityName], UUID> {

    // Example: find by custom field
    Optional<[EntityName]> findByEmail(String email);

    // Add more derived queries or custom methods as needed
}

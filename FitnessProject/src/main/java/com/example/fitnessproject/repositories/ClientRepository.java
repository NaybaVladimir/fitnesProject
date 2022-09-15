package com.example.fitnessproject.repositories;

import com.example.fitnessproject.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

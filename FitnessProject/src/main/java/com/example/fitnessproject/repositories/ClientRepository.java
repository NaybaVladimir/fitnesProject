package com.example.fitnessproject.repositories;

import com.example.fitnessproject.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findClientByPhoneNumber(String phoneNumber);
}

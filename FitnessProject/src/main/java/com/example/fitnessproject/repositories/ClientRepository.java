package com.example.fitnessproject.repositories;

import com.example.fitnessproject.models.AccessInfo;
import com.example.fitnessproject.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("select cl.accessInfo from Client cl where cl.phoneNumber=:phoneNumber")
    Optional<AccessInfo> findAccessInfoByPhoneNumberClient(String phoneNumber);
}

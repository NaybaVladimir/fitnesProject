package com.example.fitnessproject.repositories;

import com.example.fitnessproject.models.AccessInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessInfoRepository extends JpaRepository<AccessInfo, Long> {
}

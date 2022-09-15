package com.example.fitnessproject.models.dto;

import com.example.fitnessproject.models.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccessInfoDto {
    private Long personalNumber;
    private Date createDate;
    private Date renewalDate;
    private Client client;
}

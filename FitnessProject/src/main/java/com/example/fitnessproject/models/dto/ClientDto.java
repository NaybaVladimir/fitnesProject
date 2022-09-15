package com.example.fitnessproject.models.dto;

import com.example.fitnessproject.models.AccessInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private AccessInfo accessInfo;
    private Date dateBirthday;
    private String phoneNumber;
}

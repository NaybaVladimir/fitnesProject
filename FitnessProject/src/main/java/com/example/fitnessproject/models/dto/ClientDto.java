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
public class ClientDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private AccessInfoDto accessInfoDto;
    private Date dateBirthday;
    private String phoneNumber;

    public ClientDto(Client client) {
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.patronymic = client.getPatronymic();
        this.accessInfoDto = new AccessInfoDto(client.getAccessInfo());
        this.dateBirthday = client.getDateBirthday();
        this.phoneNumber = client.getPhoneNumber();
    }
}

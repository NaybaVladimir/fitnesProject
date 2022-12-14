package com.example.fitnessproject.models;

import com.example.fitnessproject.models.dto.AccessInfoDto;
import com.example.fitnessproject.models.dto.ClientDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    @OneToOne
    private AccessInfo accessInfo;
    private Date dateBirthday;
    private String phoneNumber;

    public Client(ClientDto client) {
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.patronymic = client.getPatronymic();
        this.dateBirthday = client.getDateBirthday();
        this.phoneNumber = client.getPhoneNumber();

        AccessInfoDto accessInfoDto = client.getAccessInfoDto();
        if (accessInfoDto != null) {
            this.accessInfo = new AccessInfo(accessInfoDto);
        }
    }
}

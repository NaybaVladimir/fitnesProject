package com.example.fitnessproject.models;

import com.example.fitnessproject.models.dto.AccessInfoDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccessInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long personalNumber;
    private Date createDate;
    private Date renewalDate;

    public AccessInfo(AccessInfoDto accessInfoDto) {
        this.personalNumber = accessInfoDto.getPersonalNumber();
        this.createDate = accessInfoDto.getCreateDate();
        this.renewalDate = accessInfoDto.getRenewalDate();
    }
}

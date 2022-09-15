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
public class AccessInfoDto {
    private Long personalNumber;
    private Date createDate;
    private Date renewalDate;

    public AccessInfoDto(AccessInfo accessInfo) {
        this.personalNumber = accessInfo.getPersonalNumber();
        this.createDate = accessInfo.getCreateDate();
        this.renewalDate = accessInfo.getRenewalDate();
    }
}

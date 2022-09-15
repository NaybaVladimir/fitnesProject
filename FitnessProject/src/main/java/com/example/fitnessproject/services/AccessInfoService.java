package com.example.fitnessproject.services;

import com.example.fitnessproject.models.AccessInfo;
import com.example.fitnessproject.models.dto.AccessInfoDto;
import com.example.fitnessproject.models.dto.AddPersonalNumberAccessInfoDto;
import com.example.fitnessproject.repositories.AccessInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@AllArgsConstructor
public class AccessInfoService {
    private final AccessInfoRepository accessInfoRepository;
    private final ClientService clientService;

    public AccessInfo getAccessInfo() {
        AccessInfo accessInfo = new AccessInfo();
        accessInfo.setCreateDate(new Date());
        accessInfo.setRenewalDate(new Date());
        return save(accessInfo);
    }

    @Transactional
    public AccessInfo save(AccessInfo accessInfo) {
        return accessInfoRepository.save(accessInfo);
    }

    public AccessInfoDto addPersonalNumberAccessInfo(AddPersonalNumberAccessInfoDto addPersonalNumberAccessInfoDto) {
        AccessInfo accessInfo = clientService.findByPhoneNumber(addPersonalNumberAccessInfoDto.getPhoneNumber()).getAccessInfo();
        accessInfo.setPersonalNumber(addPersonalNumberAccessInfoDto.getPersonalNumber());
        save(accessInfo);
        return new AccessInfoDto(accessInfo);
    }
}

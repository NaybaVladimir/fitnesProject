package com.example.fitnessproject.services;

import com.example.fitnessproject.models.AccessInfo;
import com.example.fitnessproject.models.Client;
import com.example.fitnessproject.models.dto.AccessInfoDto;
import com.example.fitnessproject.models.dto.AddPersonalNumberAccessInfoDto;
import com.example.fitnessproject.repositories.AccessInfoRepository;
import com.example.fitnessproject.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccessInfoService {
    private final AccessInfoRepository accessInfoRepository;
    private final ClientRepository clientRepository;

    public AccessInfo getNewAccessInfo() {
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
        AccessInfo accessInfo = findClientByPhoneNumber(addPersonalNumberAccessInfoDto.getPhoneNumber());
        accessInfo.setPersonalNumber(addPersonalNumberAccessInfoDto.getPersonalNumber());
        save(accessInfo);
        return new AccessInfoDto(accessInfo);
    }

    public AccessInfo findClientByPhoneNumber(String phoneNumber) {
        Optional<AccessInfo> accessInfoByPhoneNumberClient = clientRepository.findAccessInfoByPhoneNumberClient(phoneNumber);
        return accessInfoByPhoneNumberClient.isPresent() ? accessInfoByPhoneNumberClient.get() : null;
    }
}

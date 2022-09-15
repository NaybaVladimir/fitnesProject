package com.example.fitnessproject.services;

import com.example.fitnessproject.models.Client;
import com.example.fitnessproject.models.dto.ClientDto;
import com.example.fitnessproject.repositories.ClientRepository;
import com.example.fitnessproject.services.utils.JsonUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final AccessInfoService accessInfoService;

    public ClientDto saveClientDto(ClientDto clientDto) {
        Client client = new Client(clientDto);
        client.setAccessInfo(accessInfoService.getAccessInfo());
        client = save(client);
        return new ClientDto(client);

    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public Client findByPhoneNumber(String phoneNumber) {
        Optional<Client> clientByPhoneNumber = clientRepository.findClientByPhoneNumber(phoneNumber);
        return clientByPhoneNumber.isPresent() ? clientByPhoneNumber.get() : null;
    }

}

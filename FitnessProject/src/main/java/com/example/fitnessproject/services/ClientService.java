package com.example.fitnessproject.services;

import com.example.fitnessproject.models.Client;
import com.example.fitnessproject.repositories.ClientRepository;
import com.example.fitnessproject.services.utils.JsonUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {
    private final JsonUtils jsonUtils;
    private final ClientRepository clientRepository;

    public String saveClient(Client client) {
        clientRepository.save(client);
        return jsonUtils.objectToJson(client);

    }

}

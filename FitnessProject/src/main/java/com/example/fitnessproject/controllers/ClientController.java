package com.example.fitnessproject.controllers;

import com.example.fitnessproject.models.dto.ClientDto;
import com.example.fitnessproject.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/saveClient")
    private ResponseEntity newClient(@RequestBody ClientDto client) {
        return new ResponseEntity(clientService.saveClientDto(client), HttpStatus.OK);
    }
}

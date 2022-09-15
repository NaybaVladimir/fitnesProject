package com.example.fitnessproject.controllers;

import com.example.fitnessproject.models.dto.ClientDto;
import com.example.fitnessproject.services.ClientService;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
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
        String result = clientService.save(client);

        if (StringUtils.isBlank(result)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }

}

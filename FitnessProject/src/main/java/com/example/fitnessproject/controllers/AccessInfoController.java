package com.example.fitnessproject.controllers;

import com.example.fitnessproject.models.dto.AddPersonalNumberAccessInfoDto;
import com.example.fitnessproject.services.AccessInfoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accessInfo")
@AllArgsConstructor
public class AccessInfoController {
    private final AccessInfoService accessInfoService;

    @PostMapping(value = "/addPersonalNumberAccessInfo")
    public ResponseEntity addPersonalNumberAccessInfo(@RequestBody AddPersonalNumberAccessInfoDto addPersonalNumberAccessInfoDto) {
        return new ResponseEntity(accessInfoService.addPersonalNumberAccessInfo(addPersonalNumberAccessInfoDto), HttpStatus.OK);
    }
}

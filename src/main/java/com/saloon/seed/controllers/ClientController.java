package com.saloon.seed.controllers;

import com.saloon.seed.models.Client;
import com.saloon.seed.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService service;

    @PostMapping
    public Client create(@RequestBody Client client) {
        return service.create(client);
    }

}

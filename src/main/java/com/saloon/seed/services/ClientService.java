package com.saloon.seed.services;

import com.saloon.seed.models.Client;
import com.saloon.seed.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;
    public Client create(Client client)
    {
        return repository.save(client);
    }
}

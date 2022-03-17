package com.bootcamp.public_serviceclient.service.impl;

import com.bootcamp.public_serviceclient.model.dao.PersonalClient;
import com.bootcamp.public_serviceclient.repository.PersonalClientCrudRepository;

import com.bootcamp.public_serviceclient.service.PersonalClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class PersonalClientServiceImpl implements PersonalClientService {

    @Autowired
	private PersonalClientCrudRepository repository;
	
	public Flux<PersonalClient> findAll() {
        return repository.findAll();
    }

    public Mono<PersonalClient> findById(String id) {
        return repository.findById(id);
    }

    public Mono<PersonalClient> save(PersonalClient client) {
        return repository.save(client);
    }

    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }
	
}

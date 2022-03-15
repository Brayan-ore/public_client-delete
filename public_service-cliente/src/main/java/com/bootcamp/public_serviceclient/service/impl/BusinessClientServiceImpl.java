package com.bootcamp.public_serviceclient.service.impl;

import org.springframework.stereotype.Service;

import com.bootcamp.public_serviceclient.model.dao.BusinessClient;
import com.bootcamp.public_serviceclient.repository.BusinessClientCrudRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BusinessClientServiceImpl {
	
	
	private BusinessClientCrudRepository repository;
	
	public Flux<BusinessClient> findAll() {
        return repository.findAll();
    }

    public Mono<BusinessClient> findById(String id) {
        return repository.findById(id);
    }

    public Mono<BusinessClient> save(BusinessClient client) {
        return repository.save(client);
    }

    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }

}

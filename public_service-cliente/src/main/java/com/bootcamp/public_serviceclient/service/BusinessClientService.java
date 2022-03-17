package com.bootcamp.public_serviceclient.service;

import com.bootcamp.public_serviceclient.model.dao.BusinessClient;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface BusinessClientService {

	public Flux<BusinessClient> findAll();
    public Mono<BusinessClient> findById(String id);
    public Mono<BusinessClient> save(BusinessClient client);
    public Mono<Void> deleteById(String id);
	
}

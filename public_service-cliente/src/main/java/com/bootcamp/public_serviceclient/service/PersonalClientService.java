package com.bootcamp.public_serviceclient.service;

import com.bootcamp.public_serviceclient.model.dao.PersonalClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface PersonalClientService {
	
	public Flux<PersonalClient> findAll();
    public Mono<PersonalClient> findById(String id);
    public Mono<PersonalClient> save(PersonalClient client);
    public Mono<Void> deleteById(String id);
    
}

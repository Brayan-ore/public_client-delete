package com.bootcamp.public_serviceclient.repository;

import com.bootcamp.public_serviceclient.model.dao.PersonalClient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface PersonalClientCrudRepository extends ReactiveCrudRepository<PersonalClient, String> {

}

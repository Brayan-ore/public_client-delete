package com.bootcamp.public_serviceclient.repository;

import com.bootcamp.public_serviceclient.model.dao.BusinessClient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BusinessClientCrudRepository extends ReactiveCrudRepository<BusinessClient,String>{

}

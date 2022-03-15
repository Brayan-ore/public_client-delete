package com.bootcamp.public_serviceclient.expose;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.public_serviceclient.model.dao.BusinessClient;
import com.bootcamp.public_serviceclient.service.BusinessClientService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/business-clients")
@RequiredArgsConstructor
public class BusinessClientController {

	private BusinessClientService service;
	
	@GetMapping
    public Flux<BusinessClient> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<BusinessClient> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<BusinessClient> save(@RequestBody BusinessClient client) {
        return service.save(client);
    }

    @PutMapping
    public Mono<BusinessClient> put(@RequestBody BusinessClient client) {
        return service.save(client);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }
	
}

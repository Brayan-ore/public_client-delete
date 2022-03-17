package com.bootcamp.public_serviceclient.expose;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired //ADDED
	private BusinessClientService businessClientService;
	
	@GetMapping
    public Flux<BusinessClient> findAll() {
        return businessClientService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<BusinessClient> findById(@PathVariable String id) {
        return businessClientService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<BusinessClient> save(@RequestBody BusinessClient client) {
        return businessClientService.save(client);
    }

    @PutMapping
    public Mono<BusinessClient> put(@RequestBody BusinessClient client) {
        return businessClientService.save(client);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return businessClientService.deleteById(id);
    }
	
}

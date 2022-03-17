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

import com.bootcamp.public_serviceclient.model.dao.PersonalClient;
import com.bootcamp.public_serviceclient.service.PersonalClientService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personal-clients")
@RequiredArgsConstructor
public class PersonalClientController {

    @Autowired //ADDED
	private PersonalClientService personalClientService;
	
	@GetMapping
    public Flux<PersonalClient> findAll() {
        return personalClientService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<PersonalClient> findById(@PathVariable String id) {
        return personalClientService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<PersonalClient> save(@RequestBody PersonalClient client) {
        return personalClientService.save(client);
    }

    @PutMapping
    public Mono<PersonalClient> put(@RequestBody PersonalClient client) {
        return personalClientService.save(client);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return personalClientService.deleteById(id);
    }
	

}

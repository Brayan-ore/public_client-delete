package com.bootcamp.public_serviceclient.model.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "personal_client") //ADDED
public class PersonalClient {
	
	@Id
    private String id;
    private String dni;
    private String nombres;
    private String email;
    private String telefono;
    private String tipoCliente;
    private String tipoCuenta;
    private Boolean estado;

}

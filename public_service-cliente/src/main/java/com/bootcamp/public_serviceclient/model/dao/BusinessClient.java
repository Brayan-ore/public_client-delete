package com.bootcamp.public_serviceclient.model.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class BusinessClient {

	@Id
    private String id;
    private String ruc;
    private String razonSocial;
    private String nombresDueño;
    private String apellidosDueño;
    private String email;
    private String telefono;
    private String tipoCliente;
    private String tipoCuenta;
    private Boolean estado;
	
}

package com.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dao.DiagnosticsCentreRepo;
import com.ecommerce.dto.EndpointDTO;
import com.ecommerce.model.DiagnosticsCentre;
import com.ecommerce.model.Endpoints;
import com.ecommerce.service.EndpointServices;

@RestController
@RequestMapping(path="/endpoint")
public class EndpointController {
	
	@Autowired
	EndpointServices endpointservices;
	
	@Autowired
	DiagnosticsCentreRepo diagnosticsCentreRepo;
	
	@PostMapping(path="/addEndpoints")
	public ResponseEntity<Endpoints> addEndpoint(@RequestBody EndpointDTO endpointdto){
		
		Optional<DiagnosticsCentre> diagnosticCenter = null;
		Endpoints endpoint = new Endpoints();
		
		//Fetching the Dc value and assign
		diagnosticCenter = diagnosticsCentreRepo.findById(endpointdto.getDiagnosticcentre_id());
		endpoint.setName(endpointdto.getName());
		endpoint.setDiagnosticcentre(diagnosticCenter.get());
		
		Endpoints addedEndpoint = endpointservices.addEndpoint(endpoint);
		return new ResponseEntity<Endpoints>(addedEndpoint, HttpStatus.CREATED);
	}
	
	@GetMapping(path="/getEndpoints")
	public ResponseEntity<List<Endpoints>> getEndpoints(){
		List<Endpoints> endpoints = endpointservices.getEndpoint();
		return new ResponseEntity<List<Endpoints>>(endpoints, HttpStatus.OK);
	}
}

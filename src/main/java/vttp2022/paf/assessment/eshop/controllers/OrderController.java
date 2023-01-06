package vttp2022.paf.assessment.eshop.controllers;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import vttp2022.paf.assessment.eshop.models.Customer;
import vttp2022.paf.assessment.eshop.respositories.CustomerRepository;




public class OrderController {

	@Autowired 
CustomerRepository customerRepo;

	@PostMapping(path = "order")
	public ResponseEntity<String> getOrder (@RequestBody Map<String, Object> payload){
		String name = (String) payload.get("name");
		System.out.println(">>>>>>>>>>>>>>>" + name);

		Optional<Customer> customer = customerRepo.findCustomerByName(name);

		JsonObject error = Json.createObjectBuilder().add("error", "customer" +name+ "not found").build();

		String Order = UUID.randomUUID().toString().substring(0, 8);

		if(customer.equals(Optional.empty()))
			return ResponseEntity.status(HttpStatus.NOT_FOUND).contentType(MediaType.APPLICATION_JSON).body(error.toString()); {
		
				return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("name is found");

		
		
	}

	//TODO: Task 3

	}}

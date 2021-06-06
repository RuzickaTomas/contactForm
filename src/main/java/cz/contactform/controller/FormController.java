package cz.contactform.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.contactform.dto.ContactFormDto;
import cz.contactform.service.ContactFormService;

@RestController
@RequestMapping(value = "contactForm/v1")
public class FormController {
	
	@Autowired
	private ContactFormService service;
	
	@GetMapping(value = "/test")
	public String getText() {
		return "test";
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value =  "/create")
	public ResponseEntity<String> create(@RequestBody ContactFormDto data) {
		ContactFormDto result = service.create(data);
		if (Objects.nonNull(result)) {
			return ResponseEntity.ok("Form data saved");
		}
		return  ResponseEntity.badRequest().body("No data");
	}
}

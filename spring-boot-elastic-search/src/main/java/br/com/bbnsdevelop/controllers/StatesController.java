package br.com.bbnsdevelop.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.dto.StateDto;
import br.com.bbnsdevelop.services.StatesService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/states")
@AllArgsConstructor
public class StatesController {
	
	
	private final StatesService service;
	
	
	@GetMapping
	public ResponseEntity<List<StateDto>> getAll(){
		
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllStates());
		
	}

}

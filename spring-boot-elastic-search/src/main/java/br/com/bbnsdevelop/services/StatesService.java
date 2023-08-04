package br.com.bbnsdevelop.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.dto.StateDto;
import br.com.bbnsdevelop.repositories.StateRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class StatesService {
	
	private final StateRepository repository;
	private final ModelMapper modelMapper;

	public List<StateDto> getAllStates() {
		log.info("find all states");
		
		return repository.findAll().stream().map(s -> modelMapper.map(s, StateDto.class)).collect(Collectors.toList());
	}

}

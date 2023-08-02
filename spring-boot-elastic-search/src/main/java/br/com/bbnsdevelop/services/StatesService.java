package br.com.bbnsdevelop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.dto.StateDto;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StatesService {

	public List<StateDto> getAllStates() {
		StateDto state1 = new StateDto("south", "São Paulo");
		StateDto state2 = new StateDto("Central-west", "Goiais");
		StateDto state3 = new StateDto("north", "Tocantins");
		List<StateDto> list = List.of(state1, state2, state3);
		
		log.info("find all states: {}", list);
		return list;
	}

}

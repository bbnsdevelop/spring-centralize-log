package br.com.bbnsdevelop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateDto {
	
	private Long id;
	private String region;
	private String name;

}

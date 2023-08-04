package br.com.bbnsdevelop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_STATE")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class State {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 20)
	private String region;
	
	@Column(nullable = false, length = 20)
	private String name;

}

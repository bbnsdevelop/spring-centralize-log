package br.com.bbnsdevelop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}

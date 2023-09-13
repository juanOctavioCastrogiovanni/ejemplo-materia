package ar.utn.aceleradora.correlativasacceleradora.reposities;

import java.util.ArrayList;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.utn.aceleradora.correlativasacceleradora.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

	
}

package ar.utn.aceleradora.correlativasacceleradora.controllers;

import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.utn.aceleradora.correlativasacceleradora.model.Materia;
import ar.utn.aceleradora.correlativasacceleradora.reposities.MateriaRepository;

import java.util.Optional;

@Controller
public class MateriaController {
	
	@Autowired
	private MateriaRepository repoMat; 
	
	@GetMapping("/materia/{matId}")
	public ResponseEntity<Materia> index(Model model,
											   @PathVariable("matId") Long matId2) {
		
		Optional<Materia> mat = repoMat.findById(matId2);

		if (mat.isPresent()) {
			return ResponseEntity.ok(mat.get());
		}

		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/materia")
	public String listMaterias(Model model) {
		
		
		
		model.addAttribute("materias", repoMat.findAll());
		
		return "materias";
	}
	
	@PostMapping("/materia")
	public ResponseEntity<String> addMateria(Model model,
			Materia materia) {

		try {
			repoMat.save(materia);
			return ResponseEntity.created(null).body("Materia guardada");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Error al guardar la materia");
		}


		

	}
	
	@DeleteMapping("/materia/{matId}")
	public ResponseEntity<String> deleteMateria(Model model,
			@PathVariable("matId") Long matId2) {

		try {
			repoMat.deleteById(matId2);
			return ResponseEntity.ok("Materia eliminada");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Error al eliminar la materia");
		}

	}
	
	
}

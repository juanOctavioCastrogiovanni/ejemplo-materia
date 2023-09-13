package ar.utn.aceleradora.correlativasacceleradora;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ar.utn.aceleradora.correlativasacceleradora.model.Materia;
import ar.utn.aceleradora.correlativasacceleradora.reposities.MateriaRepository;

@SpringBootApplication
public class CorrelativasAcceleradoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorrelativasAcceleradoraApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(MateriaRepository repoMat) {
		
		return (args) -> {
			Materia analisis1 = new Materia("Análisis 1", "87324");
			repoMat.save(analisis1);
			Materia algebra = new Materia("Algebra 1", "87324");
			repoMat.save(algebra);
			Materia materia = new Materia("Análisis 2", "87324");
			materia.addCorrelativa(analisis1);
			materia.addCorrelativa(algebra);
			repoMat.save(materia);
			repoMat.save(new Materia("Algo", "87324"));
			repoMat.save(new Materia("DDS", "87324"));
			repoMat.save(new Materia("SO", "87324"));
		};
	}

}

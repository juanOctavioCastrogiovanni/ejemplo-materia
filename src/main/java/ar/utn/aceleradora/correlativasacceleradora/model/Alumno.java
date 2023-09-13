package ar.utn.aceleradora.correlativasacceleradora.model;

import java.util.ArrayList;
import java.util.Collection;

public class Alumno {

	private String nombre;
	private String legajo;
	private Collection<Materia> matAp ;
	
		
	public Alumno() {
		super();
		this.matAp = new ArrayList<Materia>();
	}

	public Alumno(String nombre, String legajo) {
		
		this.nombre = nombre;
		this.legajo = legajo;
		this.matAp = new ArrayList<Materia>();
	}
	
	public String getNombre() {
		return nombre ;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public Collection<Materia> getMatAp() {
		return matAp;
	}
	public void setMatAp(Collection<Materia> matAp) {
		this.matAp = matAp;
	}
	
	
	
	
}

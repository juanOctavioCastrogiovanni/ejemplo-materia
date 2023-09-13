package ar.utn.aceleradora.correlativasacceleradora.model;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String codigo;

	@Transient
	private Collection<Materia> materiasReq;

	public Materia(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.materiasReq = new ArrayList<Materia>();
	}

	public Materia() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombreMat) {
		this.nombre = nombreMat;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Collection<Materia> getMateriasReq() {
		return materiasReq;
	}

	protected void setMateriasReq(Collection<Materia> materiasReq) {
		this.materiasReq = materiasReq;
	}


	public void addCorrelativa(Materia materia) {
		this.materiasReq.add(materia);

	}
}

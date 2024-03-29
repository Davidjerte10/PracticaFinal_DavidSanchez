package modelo;
// Generated 11 ene 2024 19:25:39 by Hibernate Tools 6.3.1.Final

import modelo.Actividades;
import modelo.Horarios;
import modelo.Monitores;


/**
 * Reservas generated by hbm2java
 */
public class Reservas implements java.io.Serializable {

	private Integer id;
	private Horarios horarios;
	private Monitores monitores;
	private Usuarios usuarios;
	private int idActividad;
	private Actividades actividades;

	public Reservas() {
	}

	public Reservas(Horarios horarios, Monitores monitores, Usuarios usuarios, int idActividad,
			Actividades actividades) {
		this.horarios = horarios;
		this.monitores = monitores;
		this.usuarios = usuarios;
		this.idActividad = idActividad;
		this.actividades = actividades;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Horarios getHorarios() {
		return this.horarios;
	}

	public void setHorarios(Horarios horarios) {
		this.horarios = horarios;
	}

	public Monitores getMonitores() {
		return this.monitores;
	}

	public void setMonitores(Monitores monitores) {
		this.monitores = monitores;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public int getIdActividad() {
		return this.idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public Actividades getActividades() {
		return this.actividades;
	}

	public void setActividades(Actividades actividades) {
		this.actividades = actividades;
	}

}

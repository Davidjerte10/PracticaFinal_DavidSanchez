package modelo;
// Generated 11 ene 2024 19:25:39 by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Monitores generated by hbm2java
 */
public class Monitores implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String apellidos;
	private String actividad;
	private Set reservases = new HashSet(0);

	public Monitores() {
	}

	public Monitores(String nombre, String apellidos, String actividad, Set reservases) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.actividad = actividad;
		this.reservases = reservases;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getActividad() {
		return this.actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public Set getReservases() {
		return this.reservases;
	}

	public void setReservases(Set reservases) {
		this.reservases = reservases;
	}

}

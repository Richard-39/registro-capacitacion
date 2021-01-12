package com.web.registroCapacitacion.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="asistente")
public class Asistente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_asistente")
	private Integer idAsistente;
	
	@ManyToMany(mappedBy = "asistentes")
	private List<Capacitacion> capacitaciones;
	
	private String run;
	private String nombre;
	private String apellido;
	private String cargo;
	
	@Override
	public String toString() {
		return "Asistente [idAsistente=" + idAsistente + ", run=" + run + ", nombre=" + nombre + ", apellido="
				+ apellido + ", cargo=" + cargo + "]";
	}
	
	

}

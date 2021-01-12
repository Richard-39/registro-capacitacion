package com.web.registroCapacitacion.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="expositor")
public class Expositor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_expositor")
	private Integer idExpositor;
	
	@ManyToMany(mappedBy = "expositores")
	private List<Capacitacion> capacitaciones;
	
	private String run;
	private String nombre;
	private String apellido;
	
	@Override
	public String toString() {
		return "Expositor [idExpositor=" + idExpositor + ", run=" + run + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
	
	

}

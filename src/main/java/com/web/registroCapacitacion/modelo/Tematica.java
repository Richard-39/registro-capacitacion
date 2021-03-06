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
@Table(name="tematica")
public class Tematica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tematica")
	private Integer idTematica;
	
	@ManyToMany(mappedBy = "tematicas")
	private List<Capacitacion> capacitaciones;
	
	private String nombre;
	private String descripcion;
	
	@Override
	public String toString() {
		return "Tematica [idTematica=" + idTematica + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}

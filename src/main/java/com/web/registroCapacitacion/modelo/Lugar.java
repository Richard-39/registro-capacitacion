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
@Table(name="lugar")
public class Lugar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_lugar")
	private Integer idLugar;
	
	@ManyToMany(mappedBy = "lugares")
	private List<Capacitacion> capacitaciones;
	
	private String nombre;
	private String direccion;
	
	@Override
	public String toString() {
		return "Lugar [idLugar=" + idLugar + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
}

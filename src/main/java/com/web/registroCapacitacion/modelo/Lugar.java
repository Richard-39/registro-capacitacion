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
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "capacitacion_lugar", joinColumns = @JoinColumn(name = "id_lugar"), inverseJoinColumns = @JoinColumn(name = "id_capacitacion"))
	private List<Capacitacion> capacitacionesLugares;
	
	
	private String nombre;
	private String direccion;
	
	
	@Override
	public String toString() {
		return "Lugar [idLugar=" + idLugar + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
	
}

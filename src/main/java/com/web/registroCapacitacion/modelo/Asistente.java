package com.web.registroCapacitacion.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
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
	
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name = "capacitacion_asistente", joinColumns = @JoinColumn(name = "id_asistente"), inverseJoinColumns = @JoinColumn(name = "id_capacitacion"))
	private List<Capacitacion> capacitacionesAsistentes;
	
	private String run;
	private String nombre;
	private String apellido;
	private String cargo;

}

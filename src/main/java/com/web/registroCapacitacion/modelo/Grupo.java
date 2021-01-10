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
@Table(name="grupo")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_grupo")
	private Integer idGrupo;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "capacitacion_grupo", joinColumns = @JoinColumn(name = "id_grupo"), inverseJoinColumns = @JoinColumn(name = "id_capacitacion"))
	private List<Capacitacion> capacitacionesGrupos;
	
	
	private String nombre;
	private String descripcion;

}

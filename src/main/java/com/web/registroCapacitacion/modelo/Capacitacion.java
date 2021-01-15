package com.web.registroCapacitacion.modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Capacitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_capacitacion;
	private String nombre;
	private Date fecha;
	private String hora;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	// Si no usamos subselect se generan muchas queries, de esta forma no se genera la excepcion. https://hibernate.atlassian.net/browse/HHH-1718
	@JoinTable(name = "capacitacion_asistente", joinColumns = @JoinColumn(name = "id_capacitacion"), inverseJoinColumns = @JoinColumn(name = "id_asistente"))
	private List<Asistente> asistentes;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "capacitacion_expositor", joinColumns = @JoinColumn(name = "id_capacitacion"), inverseJoinColumns = @JoinColumn(name = "id_expositor"))
	private List<Expositor> expositores;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "capacitacion_grupo", joinColumns = @JoinColumn(name = "id_capacitacion"), inverseJoinColumns = @JoinColumn(name = "id_grupo"))
	private List<Grupo> grupos;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "capacitacion_lugar", joinColumns = @JoinColumn(name = "id_capacitacion"), inverseJoinColumns = @JoinColumn(name = "id_lugar"))
	private List<Lugar> lugares;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "capacitacion_tematica", joinColumns = @JoinColumn(name = "id_capacitacion"), inverseJoinColumns = @JoinColumn(name = "id_tematica"))
	private List<Tematica> tematicas ;

	@Override
	public String toString() {
		return "Capacitacion [id_capacitacion=" + id_capacitacion + ", fecha=" + fecha + "]";
	}
	
}

package com.web.registroCapacitacion.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Capacitacion {

	@Id
	private Integer id_capacitacion;
	private Date fecha;
	
	@ManyToMany(mappedBy = "capacitacionesAsistentes")
	private List<Asistente> asistentes;
	
	@ManyToMany(mappedBy = "capacitacionesExpositores")
	private List<Expositor> expositores;
	
	@ManyToMany(mappedBy = "capacitacionesGrupos")
	private List<Grupo> grupos;
	
	@ManyToMany(mappedBy = "capacitacionesLugares")
	private List<Lugar> lugares;
	
	@ManyToMany(mappedBy = "capacitacionesTematicas")
	private List<Tematica> tematicas;
	
	
	
}

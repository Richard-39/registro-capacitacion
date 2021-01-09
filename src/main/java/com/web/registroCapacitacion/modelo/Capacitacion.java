package com.web.registroCapacitacion.modelo;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Capacitacion {

	private Integer id_capacitacion;
	private Date fecha;
	
	private List<Asistente> asistentes;
	private List<Expositor> expositores;
	private List<Grupo> grupos;
	private List<Lugar> lugares;
	private List<Tematica> tematicas;
	
}

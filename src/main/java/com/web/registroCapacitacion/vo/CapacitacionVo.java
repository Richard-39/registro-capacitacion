package com.web.registroCapacitacion.vo;

import java.util.List;

import com.web.registroCapacitacion.modelo.Capacitacion;

import lombok.Data;

@Data
public class CapacitacionVo {
	
	private List<Capacitacion> capacitaciones;
	private String mensaje;
	private String codigo;
	
	public CapacitacionVo(List<Capacitacion> capacitaciones, String mensaje, String codigo) {
		this.capacitaciones = capacitaciones;
		this.mensaje = mensaje;
		this.codigo = codigo;
	}
}

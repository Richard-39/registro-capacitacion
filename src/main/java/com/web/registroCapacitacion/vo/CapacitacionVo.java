package com.web.registroCapacitacion.vo;

import java.util.List;

import com.web.registroCapacitacion.modelo.Capacitacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapacitacionVo extends GenericVo{
	
	private List<Capacitacion> capacitaciones;

	public CapacitacionVo(List<Capacitacion> capacitaciones, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.capacitaciones = capacitaciones;
	}
}

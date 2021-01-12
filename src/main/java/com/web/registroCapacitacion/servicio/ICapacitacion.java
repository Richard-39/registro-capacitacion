package com.web.registroCapacitacion.servicio;

import com.web.registroCapacitacion.modelo.Capacitacion;
import com.web.registroCapacitacion.vo.CapacitacionVo;

public interface ICapacitacion {
	
	public CapacitacionVo findAll();
	public CapacitacionVo findById(Integer id);
	public CapacitacionVo save(Capacitacion capacitacion);
	public CapacitacionVo update(Capacitacion capacitacion);
	public CapacitacionVo delete(Integer id);	

}

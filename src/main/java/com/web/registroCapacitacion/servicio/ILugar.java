package com.web.registroCapacitacion.servicio;

import com.web.registroCapacitacion.modelo.Lugar;
import com.web.registroCapacitacion.vo.LugarVo;

public interface ILugar {
	
	public LugarVo findAll();
	public LugarVo findById(Integer id);
	public LugarVo save(Lugar lugar);
	public LugarVo update(Lugar lugar);
	public LugarVo delete(Integer id);	

}

package com.web.registroCapacitacion.servicio;

import com.web.registroCapacitacion.modelo.Tematica;
import com.web.registroCapacitacion.vo.TematicaVo;

public interface ITematica {

	public TematicaVo findAll();
	public TematicaVo findById(Integer id);
	public TematicaVo save(Tematica tematica);
	public TematicaVo update(Tematica tematica);
	public TematicaVo delete(Integer id);
	
}

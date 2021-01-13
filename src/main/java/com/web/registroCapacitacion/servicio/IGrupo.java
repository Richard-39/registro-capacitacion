package com.web.registroCapacitacion.servicio;

import com.web.registroCapacitacion.modelo.Grupo;
import com.web.registroCapacitacion.vo.GrupoVo;

public interface IGrupo {
	
	public GrupoVo findAll();
	public GrupoVo findById(Integer id);
	public GrupoVo save(Grupo grupo);
	public GrupoVo update(Grupo grupo);
	public GrupoVo delete(Integer id);	

}

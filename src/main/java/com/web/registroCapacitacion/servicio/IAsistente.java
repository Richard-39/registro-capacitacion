package com.web.registroCapacitacion.servicio;

import com.web.registroCapacitacion.modelo.Asistente;
import com.web.registroCapacitacion.vo.AsistenteVo;

public interface IAsistente {

	public AsistenteVo findAll();
	public AsistenteVo findById(Integer id);
	public AsistenteVo save(Asistente asistente);
	public AsistenteVo update(Asistente asistente);
	public AsistenteVo delete(Integer id);	
	
}

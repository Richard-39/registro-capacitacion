package com.web.registroCapacitacion.servicio;

import com.web.registroCapacitacion.modelo.Expositor;
import com.web.registroCapacitacion.vo.ExpositorVo;

public interface IExpositor {

	public ExpositorVo findAll();
	public ExpositorVo findById(Integer id);
	public ExpositorVo save(Expositor expositor);
	public ExpositorVo update(Expositor expositor);
	public ExpositorVo delete(Integer id);	
	
}

package com.web.registroCapacitacion.vo;

import java.util.List;
import com.web.registroCapacitacion.modelo.Expositor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpositorVo extends GenericVo{

	private List<Expositor> expositores;

	public ExpositorVo(List<Expositor> expositores, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.expositores = expositores;
	}
	
}

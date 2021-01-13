package com.web.registroCapacitacion.vo;

import java.util.List;

import com.web.registroCapacitacion.modelo.Tematica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TematicaVo extends GenericVo {

	private List<Tematica> tematicas;

	public TematicaVo(List<Tematica> tematicas, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.tematicas = tematicas;
	}
	
	
	
}

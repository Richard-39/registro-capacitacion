package com.web.registroCapacitacion.vo;

import java.util.List;

import com.web.registroCapacitacion.modelo.Grupo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrupoVo extends GenericVo{

	private List<Grupo> grupos;

	public GrupoVo(List<Grupo> grupos, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.grupos = grupos;
	}
	
}

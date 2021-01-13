package com.web.registroCapacitacion.vo;

import java.util.List;

import com.web.registroCapacitacion.modelo.Lugar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LugarVo extends GenericVo{

	public List<Lugar> lugares;

	public LugarVo(List<Lugar> lugares, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.lugares = lugares;
	}
	
}

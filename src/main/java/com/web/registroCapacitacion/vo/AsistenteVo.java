package com.web.registroCapacitacion.vo;

import java.util.List;

import com.web.registroCapacitacion.modelo.Asistente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsistenteVo extends GenericVo{

	private List<Asistente> asistentes;

	public AsistenteVo(List<Asistente> asistentes, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.asistentes = asistentes;	
	}	
}

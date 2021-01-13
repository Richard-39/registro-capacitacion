package com.web.registroCapacitacion.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.registroCapacitacion.dao.GrupoDao;
import com.web.registroCapacitacion.modelo.Grupo;
import com.web.registroCapacitacion.vo.GrupoVo;

@Service
public class GrupoServicioImp implements IGrupo {
	
	@Autowired
	GrupoDao grupoDao;
	
	private static final Logger log = LoggerFactory.getLogger(GrupoServicioImp.class);

	@Override
	public GrupoVo findAll() {
		GrupoVo grupoVo = new GrupoVo(new ArrayList<Grupo>(), "Ha ocurrido un error", "101");
		try {
			grupoVo.setGrupos(grupoDao.findAll());
			grupoVo.setMensaje(String.format("Se han encontrado %f grupos", grupoVo.getGrupos().size()));
			grupoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en GrupoServicioImp : findAll  + e");
		}
		return grupoVo;
	}

	@Override
	public GrupoVo findById(Integer id) {
		GrupoVo grupoVo = new GrupoVo(new ArrayList<Grupo>(), "Ha ocurrido un error", "102");
		try {
			grupoVo.getGrupos().add(grupoDao.findById(id).get());
			grupoVo.setMensaje("se ha encontrado el grupo");
			grupoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en GrupoServicioImp : findById  + e");
		}
		return grupoVo;
	}

	@Override
	public GrupoVo save(Grupo grupo) {
		GrupoVo grupoVo = new GrupoVo(new ArrayList<Grupo>(), "Ha ocurrido un error", "103");
		try {
			grupoVo.getGrupos().add(grupoDao.save(grupo));
			grupoVo.setMensaje("se ha gruardado el grupo");
			grupoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en GrupoServicioImp : save  + e");
		}
		return grupoVo;
	}

	@Override
	public GrupoVo update(Grupo grupo) {
		GrupoVo grupoVo = new GrupoVo(new ArrayList<Grupo>(), "Ha ocurrido un error", "104");
		try {
			grupoVo.getGrupos().add(grupoDao.save(grupo));
			grupoVo.setMensaje("se ha actualizado el grupo");
			grupoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en GrupoServicioImp : update  + e");
		}
		return grupoVo;
	}

	@Override
	public GrupoVo delete(Integer id) {
		GrupoVo grupoVo = new GrupoVo(new ArrayList<Grupo>(), "Ha ocurrido un error", "105");
		try {
			grupoVo.getGrupos().add(grupoDao.findById(id).get());
			grupoDao.deleteById(id);
			grupoVo.setMensaje("se ha eliminado el grupo");
			grupoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en GrupoServicioImp : delete  + e");
		}
		return grupoVo;
	}

}

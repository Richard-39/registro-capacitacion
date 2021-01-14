package com.web.registroCapacitacion.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.registroCapacitacion.dao.TematicaDao;
import com.web.registroCapacitacion.modelo.Tematica;
import com.web.registroCapacitacion.vo.TematicaVo;

@Service
public class TematicaServicioImp implements ITematica {

	@Autowired
	TematicaDao tematicaDao;
	
	private static final Logger log = LoggerFactory.getLogger(TematicaServicioImp.class);
	
	@Override
	public TematicaVo findAll() {
		TematicaVo tematicaVo = new TematicaVo(new ArrayList<Tematica>(), "Ha habido un error", "101");
		try {
			tematicaVo.setTematicas(tematicaDao.findAll());
			tematicaVo.setMensaje(String.format("Se han encontrado %d tematicas", tematicaVo.getTematicas().size()));
			tematicaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en TematicaServicioImp : findAll " + e);
		}
		return tematicaVo;
	}

	@Override
	public TematicaVo findById(Integer id) {
		TematicaVo tematicaVo = new TematicaVo(new ArrayList<Tematica>(), "Ha habido un error", "102");
		try {
			tematicaVo.getTematicas().add(tematicaDao.findById(id).get());
			tematicaVo.setMensaje("Se ha encontrado la temática");
			tematicaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en TematicaServicioImp : findById " + e);
		}
		return tematicaVo;
	}

	@Override
	public TematicaVo save(Tematica tematica) {
		TematicaVo tematicaVo = new TematicaVo(new ArrayList<Tematica>(), "Ha habido un error", "103");
		try {
			tematicaVo.getTematicas().add(tematicaDao.save(tematica));
			tematicaVo.setMensaje("Se ha guardado la temática");
			tematicaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en TematicaServicioImp : save " + e);
		}
		return tematicaVo;
	}

	@Override
	public TematicaVo update(Tematica tematica) {
		TematicaVo tematicaVo = new TematicaVo(new ArrayList<Tematica>(), "Ha habido un error", "104");
		try {
			tematicaVo.getTematicas().add(tematicaDao.save(tematica));
			tematicaVo.setMensaje("Se ha actualizado la temática");
			tematicaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en TematicaServicioImp : update " + e);
		}
		return tematicaVo;
	}

	@Override
	public TematicaVo delete(Integer id) {
		TematicaVo tematicaVo = new TematicaVo(new ArrayList<Tematica>(), "Ha habido un error", "105");
		try {
			tematicaVo.getTematicas().add(tematicaDao.findById(id).get());
			tematicaDao.deleteById(id);
			tematicaVo.setMensaje("Se ha actualizado la temática");
			tematicaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en TematicaServicioImp : delete " + e);
		}
		return tematicaVo;
	}

}

package com.web.registroCapacitacion.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.registroCapacitacion.dao.CapacitacionDao;
import com.web.registroCapacitacion.modelo.Capacitacion;
import com.web.registroCapacitacion.vo.CapacitacionVo;

@Service
public class CapacitacionServicioImp implements ICapacitacion {

	@Autowired
	CapacitacionDao capacitacionDao;
	
	private static final Logger log = LoggerFactory.getLogger(CapacitacionServicioImp.class);

	@Override
	public CapacitacionVo findAll() {
		CapacitacionVo capacitacionVo = new CapacitacionVo(new ArrayList<Capacitacion>(), "Ha habido un error", "101");
		try {
			capacitacionVo.setCapacitaciones(capacitacionDao.findAll());
			capacitacionVo.setMensaje(String.format("Se han encontrado %f capacitaciones.", capacitacionVo.getCapacitaciones().size()));
			capacitacionVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en CapacitacionServicioImp : findAll " + e);
		}
		return capacitacionVo;
	}

	@Override
	public CapacitacionVo findById(Integer id) {
		CapacitacionVo capacitacionVo = new CapacitacionVo(new ArrayList<Capacitacion>(), "Ha habido un error", "102");
		try {
			capacitacionVo.getCapacitaciones().add(capacitacionDao.findById(id).get());
			capacitacionVo.setMensaje("Se ha encontrado la capacitacion.");
			capacitacionVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en CapacitacionServicioImp : findById " + e);
		}
		return capacitacionVo;
	}

	@Override
	public CapacitacionVo save(Capacitacion capacitacion) {
		CapacitacionVo capacitacionVo = new CapacitacionVo(new ArrayList<Capacitacion>(), "Ha habido un error", "103");
		try {
			capacitacionVo.getCapacitaciones().add(capacitacionDao.save(capacitacion));
			capacitacionVo.setMensaje("Se ha guardado correctamnte");
			capacitacionVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en CapacitacionServicioImp : save " + e);
		}
		return capacitacionVo;
	}

	@Override
	public CapacitacionVo update(Capacitacion capacitacion) {
		CapacitacionVo capacitacionVo = new CapacitacionVo(new ArrayList<Capacitacion>(), "Ha habido un error", "104");
		try {
			capacitacionVo.getCapacitaciones().add(capacitacionDao.save(capacitacion));
			capacitacionVo.setMensaje("Se ha actualizado correctamente");
			capacitacionVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en CapacitacionServicioImp : findAll " + e);
		}
		return capacitacionVo;
	}

	@Override
	public CapacitacionVo delete(Integer id) {
		CapacitacionVo capacitacionVo = new CapacitacionVo(new ArrayList<Capacitacion>(), "Ha habido un error", "105");
		try {
			capacitacionVo.getCapacitaciones().add(capacitacionDao.findById(id).get());
			capacitacionDao.deleteById(id);
			capacitacionVo.setMensaje("Se ha eliminado correctamente");
			capacitacionVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en CapacitacionServicioImp : delete " + e);
		}
		return capacitacionVo;
	}

}

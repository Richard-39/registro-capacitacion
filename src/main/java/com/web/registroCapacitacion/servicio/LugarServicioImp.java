package com.web.registroCapacitacion.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.registroCapacitacion.dao.LugarDao;
import com.web.registroCapacitacion.modelo.Lugar;
import com.web.registroCapacitacion.vo.LugarVo;

@Service
public class LugarServicioImp implements ILugar {

	@Autowired
	LugarDao lugarDao;
	
	private static final Logger log = LoggerFactory.getLogger(LugarServicioImp.class);
	
	@Override
	public LugarVo findAll() {
		LugarVo lugarVo = new LugarVo(new ArrayList<Lugar>(), "Ha habido un error", "101");
		try {
			lugarVo.setLugares(lugarDao.findAll());
			lugarVo.setMensaje(String.format("Se han encontrado %d lugares", lugarVo.getLugares().size()));
			lugarVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en LugarServicioImp : findAll " + e);
		}
		return lugarVo;
	}

	@Override
	public LugarVo findById(Integer id) {
		LugarVo lugarVo = new LugarVo(new ArrayList<Lugar>(), "Ha habido un error", "102");
		try {
			lugarVo.getLugares().add(lugarDao.findById(id).get());
			lugarVo.setMensaje("Se ha encontrado el lugar");
			lugarVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en LugarServicioImp : findById " + e);
		}
		return lugarVo;
	}

	@Override
	public LugarVo save(Lugar lugar) {
		LugarVo lugarVo = new LugarVo(new ArrayList<Lugar>(), "Ha habido un error", "103");
		try {
			lugarVo.getLugares().add(lugarDao.save(lugar));
			lugarVo.setMensaje("Se ha guardado el lugar");
			lugarVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en LugarServicioImp : save " + e);
		}
		return lugarVo;
	}

	@Override
	public LugarVo update(Lugar lugar) {
		LugarVo lugarVo = new LugarVo(new ArrayList<Lugar>(), "Ha habido un error", "104");
		try {
			lugarVo.getLugares().add(lugarDao.save(lugar));
			lugarVo.setMensaje("Se ha actualizado el lugar");
			lugarVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en LugarServicioImp : update " + e);
		}
		return lugarVo;
	}

	@Override
	public LugarVo delete(Integer id) {
		LugarVo lugarVo = new LugarVo(new ArrayList<Lugar>(), "Ha habido un error", "105");
		try {
			lugarVo.getLugares().add(lugarDao.findById(id).get());
			lugarDao.deleteById(id);
			lugarVo.setMensaje("Se ha eliminado el lugar");
			lugarVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en LugarServicioImp : delete " + e);
		}
		return lugarVo;
	}

}

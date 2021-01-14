package com.web.registroCapacitacion.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.registroCapacitacion.dao.AsistenteDao;
import com.web.registroCapacitacion.modelo.Asistente;
import com.web.registroCapacitacion.vo.AsistenteVo;

@Service
public class AsistenteServicioImp implements IAsistente{

	@Autowired
	AsistenteDao asistenteDao;
	
	private static final Logger log = LoggerFactory.getLogger(AsistenteServicioImp.class);
	
	@Override
	public AsistenteVo findAll() {
		AsistenteVo asistenteVo = new AsistenteVo(new ArrayList<Asistente>(), "Ha habido un error", "101");
		try {
			asistenteVo.setAsistentes(asistenteDao.findAll());
			asistenteVo.setMensaje(String.format("Se han encontrado %d asistente", asistenteVo.getAsistentes().size()));
			asistenteVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en AsistenteServicioImp: findAll " + e);
		}
		return asistenteVo;
	}

	@Override
	public AsistenteVo findById(Integer id) {
		AsistenteVo asistenteVo = new AsistenteVo(new ArrayList<Asistente>(), "Ha habido un error", "102");
		try {
			asistenteVo.getAsistentes().add(asistenteDao.findById(id).get());
			asistenteVo.setMensaje("Se ha encontrado el asistente");
			asistenteVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en AsistenteServicioImp: findById " + e);
		}
		return asistenteVo;
	}

	@Override
	public AsistenteVo save(Asistente asistente) {
		AsistenteVo asistenteVo = new AsistenteVo(new ArrayList<Asistente>(), "Ha habido un error", "103");
		try {
			asistenteVo.getAsistentes().add(asistenteDao.save(asistente));
			asistenteVo.setMensaje("Se ha guardado el asistente");
			asistenteVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en AsistenteServicioImp: save " + e);
		}
		return asistenteVo;
	}

	@Override
	public AsistenteVo update(Asistente asistente) {
		AsistenteVo asistenteVo = new AsistenteVo(new ArrayList<Asistente>(), "Ha habido un error", "104");
		try {
			asistenteVo.getAsistentes().add(asistenteDao.save(asistente));
			asistenteVo.setMensaje("Se ha actualizado el asistente");
			asistenteVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en AsistenteServicioImp: update " + e);
		}
		return asistenteVo;
	}

	@Override
	public AsistenteVo delete(Integer id) {
		AsistenteVo asistenteVo = new AsistenteVo(new ArrayList<Asistente>(), "Ha habido un error", "105");
		try {
			asistenteVo.getAsistentes().add(asistenteDao.findById(id).get());
			asistenteDao.deleteById(id);
			asistenteVo.setMensaje("Se ha eliminado el asistente");
			asistenteVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en AsistenteServicioImp: delete " + e);
		}
		return asistenteVo;
	}

}

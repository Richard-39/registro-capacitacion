package com.web.registroCapacitacion.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.registroCapacitacion.dao.ExpositorDao;
import com.web.registroCapacitacion.modelo.Expositor;
import com.web.registroCapacitacion.vo.ExpositorVo;

@Service
public class ExpositorServicioImp implements IExpositor {

	@Autowired
	ExpositorDao expositorDao;
	
	private static final Logger log = LoggerFactory.getLogger(ExpositorServicioImp.class);
	
	@Override
	public ExpositorVo findAll() {
		ExpositorVo expositorVo = new ExpositorVo(new ArrayList<Expositor>(), "Ha habido un error", "101");
		try {
			expositorVo.setExpositores(expositorDao.findAll());
			expositorVo.setMensaje(String.format("Se han encontrado %d expositores", expositorVo.getExpositores().size()));
			expositorVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en ExpositorServicioImp: findAll " + e);
		}
		return expositorVo;
	}

	@Override
	public ExpositorVo findById(Integer id) {
		ExpositorVo expositorVo = new ExpositorVo(new ArrayList<Expositor>(), "Ha habido un error", "102");
		try {
			expositorVo.getExpositores().add(expositorDao.findById(id).get());
			expositorVo.setMensaje("Se ha encontrado el expositor");
			expositorVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en ExpositorServicioImp: findById " + e);
		}
		return expositorVo;
	}

	@Override
	public ExpositorVo save(Expositor expositor) {
		ExpositorVo expositorVo = new ExpositorVo(new ArrayList<Expositor>(), "Ha habido un error", "103");
		try {
			expositorVo.getExpositores().add(expositorDao.save(expositor));
			expositorVo.setMensaje("Se ha guardado el expositor");
			expositorVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en ExpositorServicioImp: save " + e);
		}
		return expositorVo;
	}

	@Override
	public ExpositorVo update(Expositor expositor) {
		ExpositorVo expositorVo = new ExpositorVo(new ArrayList<Expositor>(), "Ha habido un error", "104");
		try {
			expositorVo.getExpositores().add(expositorDao.save(expositor));
			expositorVo.setMensaje("Se ha actualizado el expositor");
			expositorVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en ExpositorServicioImp: update " + e);
		}
		return expositorVo;
	}

	@Override
	public ExpositorVo delete(Integer id) {
		ExpositorVo expositorVo = new ExpositorVo(new ArrayList<Expositor>(), "Ha habido un error", "105");
		try {
			expositorVo.getExpositores().add(expositorDao.findById(id).get());
			expositorDao.deleteById(id);
			expositorVo.setMensaje("Se ha eliminado el expositor");
			expositorVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en ExpositorServicioImp: delete " + e);
		}
		return expositorVo;
	}

}

package com.web.registroCapacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.web.registroCapacitacion.dao.AsistenteDao;
import com.web.registroCapacitacion.dao.ExpositorDao;
import com.web.registroCapacitacion.dao.GrupoDao;
import com.web.registroCapacitacion.dao.LugarDao;
import com.web.registroCapacitacion.dao.TematicaDao;

@SpringBootApplication
public class RegistroCapacitacionApplication {

	public static void main(String[] args) {
	
		// SpringApplication.run(RegistroCapacitacionApplication.class, args);
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		AsistenteDao asistentedao = acac.getBean(AsistenteDao.class);
		ExpositorDao expositordao = acac.getBean(ExpositorDao.class);
		GrupoDao grupodao = acac.getBean(GrupoDao.class);
		LugarDao lugardao = acac.getBean(LugarDao.class);
		TematicaDao tematicadao = acac.getBean(TematicaDao.class);
		System.out.println(asistentedao.findAll());
		System.out.println(expositordao.findAll());
		System.out.println(grupodao.findAll());
		System.out.println(lugardao.findAll());
		System.out.println(tematicadao.findAll());
		
	}

}

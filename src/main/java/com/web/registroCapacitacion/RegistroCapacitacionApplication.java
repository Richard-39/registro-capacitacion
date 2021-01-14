package com.web.registroCapacitacion;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.ManyToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.web.registroCapacitacion.dao.AsistenteDao;
import com.web.registroCapacitacion.dao.CapacitacionDao;
import com.web.registroCapacitacion.dao.ExpositorDao;
import com.web.registroCapacitacion.dao.GrupoDao;
import com.web.registroCapacitacion.dao.LugarDao;
import com.web.registroCapacitacion.dao.TematicaDao;
import com.web.registroCapacitacion.modelo.Asistente;
import com.web.registroCapacitacion.modelo.Capacitacion;
import com.web.registroCapacitacion.modelo.Expositor;
import com.web.registroCapacitacion.modelo.Grupo;
import com.web.registroCapacitacion.modelo.Lugar;
import com.web.registroCapacitacion.modelo.Tematica;

@SpringBootApplication
public class RegistroCapacitacionApplication {

	public static void main(String[] args) {
	
		 SpringApplication.run(RegistroCapacitacionApplication.class, args);
		
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
//		AsistenteDao asistentedao = acac.getBean(AsistenteDao.class);
//		ExpositorDao expositordao = acac.getBean(ExpositorDao.class);
//		GrupoDao grupodao = acac.getBean(GrupoDao.class);
//		LugarDao lugardao = acac.getBean(LugarDao.class);
//		TematicaDao tematicadao = acac.getBean(TematicaDao.class);
//		CapacitacionDao capacitacionDao = acac.getBean(CapacitacionDao.class);
////		System.out.println(asistentedao.findAll());
////		System.out.println(expositordao.findAll());
////		System.out.println(grupodao.findAll());
////		System.out.println(lugardao.findAll());
////		System.out.println(tematicadao.findAll());
//		
//		// prueba save asistente dao
//		Asistente asistente1 = new Asistente();
//		asistente1.setIdAsistente(7);
//		asistente1.setRun("55666777-8");
//		asistente1.setNombre("Bob Esponja");
//		asistente1.setApellido("Pantalones Cortos");
//		asistente1.setCargo("Operario");
//
////		asistentedao.save(asistente1);
//		
//		Expositor expositor1 = new Expositor();
//		expositor1.setIdExpositor(1);
//		expositor1.setRun("12345678-9");
//		expositor1.setNombre("Fabian");
//		expositor1.setApellido("Abarza");
////		
//		Grupo grupo1 = new Grupo();
//		grupo1.setIdGrupo(1);
//		grupo1.setNombre("Supervisores");
////		
//		Lugar lugar1 = new Lugar();
//		lugar1.setIdLugar(1);
//		lugar1.setNombre("Cultivo norte");
////		
//		Tematica tematica1 = new Tematica();
//		tematica1.setIdTematica(1);
//		tematica1.setNombre("Cultivo norte");
//		
//		// prueba save capacitacion dao
//		
//		Capacitacion capacitacion = new Capacitacion();
////		
//		asistente1.setCapacitaciones(new ArrayList<Capacitacion>(Arrays.asList(capacitacion)));
//		expositor1.setCapacitaciones(new ArrayList<Capacitacion>(Arrays.asList(capacitacion)));
//		grupo1.setCapacitaciones(new ArrayList<Capacitacion>(Arrays.asList(capacitacion)));
//		lugar1.setCapacitaciones(new ArrayList<Capacitacion>(Arrays.asList(capacitacion)));
//		tematica1.setCapacitaciones(new ArrayList<Capacitacion>(Arrays.asList(capacitacion)));
////				
//		capacitacion.setFecha(new Date(0));
//		capacitacion.setAsistentes(new ArrayList<Asistente>(Arrays.asList(asistente1)));
//		capacitacion.setExpositores(new ArrayList<Expositor>(Arrays.asList(expositor1)));
//		capacitacion.setGrupos(new ArrayList<Grupo>(Arrays.asList(grupo1)));
//		capacitacion.setLugares(new ArrayList<Lugar>(Arrays.asList(lugar1)));
//		capacitacion.setTematicas(new ArrayList<Tematica>(Arrays.asList(tematica1)));
////		
//		capacitacionDao.save(capacitacion);
		
		
//		Capacitacion capacitacion2 = capacitacionDao.findById(14).get();
//		asistente1.setCapacitaciones(new ArrayList<Capacitacion>(Arrays.asList(capacitacion2)));
//		capacitacion2.setAsistentes(new ArrayList<Asistente>(Arrays.asList(asistente1)));
//		capacitacionDao.save(capacitacion2);
		
//		asistentedao.deleteById(9);
//		capacitacionDao.deleteById(12);
	}

}

package com.web.registroCapacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.web.registroCapacitacion.dao.AsistenteDao;

@SpringBootApplication
public class RegistroCapacitacionApplication {

	public static void main(String[] args) {
	
		// SpringApplication.run(RegistroCapacitacionApplication.class, args);
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		AsistenteDao asistentedao = acac.getBean(AsistenteDao.class);
		System.out.println(asistentedao.findAll());
		
	}

}

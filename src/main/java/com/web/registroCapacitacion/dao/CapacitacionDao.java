package com.web.registroCapacitacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.registroCapacitacion.modelo.Capacitacion;

public interface CapacitacionDao extends JpaRepository<Capacitacion, Integer>{

}

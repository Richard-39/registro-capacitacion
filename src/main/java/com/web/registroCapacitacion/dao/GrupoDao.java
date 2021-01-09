package com.web.registroCapacitacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.registroCapacitacion.modelo.Grupo;

public interface GrupoDao extends JpaRepository<Grupo, Integer> {

}

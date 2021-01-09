package com.web.registroCapacitacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="lugar")
public class Lugar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_lugar")
	private Integer idLugar;
	private String nombre;
	private String direccion;
	
}

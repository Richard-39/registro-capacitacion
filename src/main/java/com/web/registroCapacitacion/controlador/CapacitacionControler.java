package com.web.registroCapacitacion.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.registroCapacitacion.modelo.Capacitacion;
import com.web.registroCapacitacion.servicio.ICapacitacion;
import com.web.registroCapacitacion.servicio.IExpositor;
import com.web.registroCapacitacion.servicio.IGrupo;
import com.web.registroCapacitacion.servicio.ILugar;
import com.web.registroCapacitacion.servicio.ITematica;

@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionControler {

	@Autowired
	ICapacitacion capacitacionServicio;
	
	@Autowired
	ITematica tematicaServicio;
	
	@Autowired
	IExpositor expositorServicio;
	
	@Autowired
	IGrupo grupoServicio;
	
	@Autowired
	ILugar lugarServicio;
		
	@GetMapping({"/", ""})
	public String capacitaciones(Model model) {
		
		model.addAttribute("capacitacionVo", capacitacionServicio.findAll());
		
		model.addAttribute("temativaVo", tematicaServicio.findAll());
		model.addAttribute("expositorVo", expositorServicio.findAll());
		model.addAttribute("grupoVo", grupoServicio.findAll());
		model.addAttribute("lugarVo", lugarServicio.findAll());

		model.addAttribute("capacitacion", new Capacitacion());
		
		return "capacitaciones";
	}
	
	@GetMapping("/crear")
	public ModelAndView crear(
			Model model, 
			@ModelAttribute("capacitacion") Capacitacion capacitacion,
			@RequestParam(required = false) String hora,
			@RequestParam(required = false) String minutos
			){
		
		if (hora != null && minutos != null) capacitacion.setHora(hora.concat(":").concat(minutos));
		
		capacitacionServicio.save(capacitacion);
		
		System.out.println(capacitacion.getTematicas().get(0).getCapacitaciones());
		
		
		
		return new ModelAndView("redirect:/capacitaciones");
	}
	
}

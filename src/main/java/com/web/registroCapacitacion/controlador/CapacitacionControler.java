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
import com.web.registroCapacitacion.modelo.Tematica;
import com.web.registroCapacitacion.servicio.ICapacitacion;
import com.web.registroCapacitacion.servicio.ITematica;
import com.web.registroCapacitacion.vo.CapacitacionVo;

@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionControler {

	@Autowired
	ICapacitacion capacitacionServicio;
	
	@Autowired
	ITematica tematicaServicio;
	
	@GetMapping({"/", ""})
	public String capacitaciones(Model model) {
		
		model.addAttribute("capacitacionVo", capacitacionServicio.findAll());
		model.addAttribute("temativaVo", tematicaServicio.findAll());
		model.addAttribute("capacitacion", new Capacitacion());
		
		
		return "capacitaciones";
	}
	
	@GetMapping("/crear")
	public ModelAndView crear(Model model, @ModelAttribute Capacitacion capacitacion) {
				
		System.out.println(capacitacion.getTematicas());

		return new ModelAndView("redirect:/capacitaciones");
	}
	
}

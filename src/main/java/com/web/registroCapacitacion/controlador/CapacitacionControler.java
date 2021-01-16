package com.web.registroCapacitacion.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.web.registroCapacitacion.modelo.Capacitacion;
import com.web.registroCapacitacion.servicio.IAsistente;
import com.web.registroCapacitacion.servicio.ICapacitacion;
import com.web.registroCapacitacion.servicio.IExpositor;
import com.web.registroCapacitacion.servicio.IGrupo;
import com.web.registroCapacitacion.servicio.ILugar;
import com.web.registroCapacitacion.servicio.ITematica;

@Controller
@RequestMapping("/capacitaciones")
@SessionAttributes("capacitacionACompletar")
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
	
	@Autowired
	IAsistente asistenteServicio;
		
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
		
		
		return new ModelAndView("redirect:/capacitaciones");
	}
	
	@GetMapping("/ver")
	public String ver(Model model, @RequestParam Integer id) {
		
		model.addAttribute("capacitacionVo", capacitacionServicio.findById(id));
		
		return "verCapacitacion";
	}
	
	
	@GetMapping("/preInscribir")
	public String preInscribir(Model model, @RequestParam Integer id) {
		
		model.addAttribute("asistenteVo", asistenteServicio.findAll());
		model.addAttribute("capacitacionACompletar", capacitacionServicio.findById(id).getCapacitaciones().get(0));
		return "inscribirAsistente";
	}
	
	@GetMapping("/inscribir")
	public ModelAndView inscribir(@ModelAttribute("capacitacionACompletar") Capacitacion capacitacion, RedirectAttributes redirectAttr, SessionStatus status) {
		
		capacitacionServicio.update(capacitacion);
		
		// lo añade como get por la url
		redirectAttr.addAttribute("id", capacitacion.getId_capacitacion());
		status.setComplete();
		return new ModelAndView("redirect:/capacitaciones/preInscribir");
	}
}

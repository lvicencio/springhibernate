package com.sitio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sitio.entity.Contacto;
import com.sitio.entity.Empleado;
import com.sitio.service.ContactoService;
import com.sitio.service.EmpleadoService;

@Controller
@SessionAttributes("empleado")
public class ContactoController {

	@Autowired
	private EmpleadoService empleadoService;
	@Autowired
	private ContactoService contactoService;
	
	
	@RequestMapping("/contactos")
	public String getContactos(@RequestParam("empleadoId") Integer empleadoId, 
			Model model) {
		
		Empleado empleado = findById(empleadoId);
		model.addAttribute("empleado", empleado);
		model.addAttribute("contacto", new Contacto());
				
		return "contactos";
	}
	
	@RequestMapping("/guardarContacto")
	public String guardarEmpleado(Model model,
			@ModelAttribute("contacto") Contacto contacto,
			@ModelAttribute("empleado") Empleado empleado,
			RedirectAttributes ra) {
		
		contactoService.save(empleado, contacto);
		ra.addFlashAttribute("resultado", "Agregado Contacto");
		return "redirect:/contactos?empleadoId=" + empleado.getId();
	}
	
	
	private Empleado findById(Integer empleadoId) {
		Empleado empleado = empleadoService.getEmpleadoById(empleadoId);
		
		return empleado;
	}
}

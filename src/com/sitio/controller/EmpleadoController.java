package com.sitio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sitio.entity.Empleado;
import com.sitio.service.EmpleadoService;


@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@RequestMapping(value = "/vistaempleado")
	public String agregarEmpleado(Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		
		return "vistaempleado";
	}
	
	@RequestMapping(value="/guardarEmpleado")
	public String guardarEmpleado(@ModelAttribute("empleado")@Valid Empleado empleado,
			BindingResult result,
			Model model) {
		
		if (result.hasErrors()) {
			return "vistaempleado";
		}
		
		empleadoService.saveEmpleado(empleado);
		
		//envia y carga el listado de empleados (Model model)
		List<Empleado> listaDeEmpleados = empleadoService.listadoEmpleado();
		model.addAttribute("losEmpleados", listaDeEmpleados);
		//fin  carga
		return "ListadoEmpleado";
	}
	
	
	@RequestMapping(value = "/ListadoEmpleado")
	public String listaEmpleados(Model model) {
		
		List<Empleado> listaDeEmpleados = empleadoService.listadoEmpleado();
		model.addAttribute("losEmpleados", listaDeEmpleados);
		return "ListadoEmpleado";
	}
	
	@RequestMapping(value= "/UpdateFormulario")
	public String UpdateFormulario(@RequestParam("empleadoId") Integer empleadoId,
			Model model) {
		Empleado empleado = findById(empleadoId);
		
		model.addAttribute("empleado", empleado);
		return "vistaempleado";
		
	}
	
	@RequestMapping(value= "/eliminarEmpleado")
	public String eliminarEmpleado(@RequestParam("empleadoId") Integer empleadoId) {
		Empleado empleadoEliminar = findById(empleadoId);
		empleadoService.eliminarEmpleado(empleadoEliminar);
		
		
		return "redirect:/ListadoEmpleado";
		
		
	}
	
	
	
	private Empleado findById(Integer empleadoId) {
		Empleado empleado = empleadoService.getEmpleadoById(empleadoId);
		
		return empleado;
	
	}
	
	
	
	
}

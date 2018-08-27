package com.sitio.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sitio.entity.User;
import com.sitio.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String verLoginForm() {
	
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String verificarLogin(@RequestParam String username, 
			@RequestParam String password,
			HttpSession session, Model model) {			
	
				
		User user = userService.loginUser(username, password);
		if (user == null) {
			model.addAttribute("loginError", "Error al autentificar, intente de nuevo");
			return "login";
		}
		session.setAttribute("loggedInUser", user);
		return "redirect:/ListadoEmpleado";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.removeAttribute("loggedInUser");
		return "login";
	}
}

package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.ExercicioService;
import br.com.PersonalSpringMVC.negocio.Exercicio;

@Controller
public class ExercicioController {

	@Autowired
	private ExercicioService service;
	
	@RequestMapping(value = "/exercicios", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("exercicios", service.obterLista());
		
		return "exercicio/lista";
	}
	
	@RequestMapping(value = "/exercicio", method = RequestMethod.GET)
	public String showDetalhe() {
		return "exercicio/detalhe";
	}
	
	@RequestMapping(value = "/exercicio", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Exercicio exercicio
			) {
		
		service.incluir(exercicio);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/exercicio/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public ExercicioService getService() {
		return service;
	}
	public void setService(ExercicioService service) {
		this.service = service;
	}
}
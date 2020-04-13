package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.ProfessorService;
import br.com.PersonalSpringMVC.negocio.Professor;


@Controller
public class ProfessorController {

	@Autowired
	private ProfessorService service;
	
	@RequestMapping(value = "/professores", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("professores", service.obterLista());
		
		return "professor/lista";
	}
	
	@RequestMapping(value = "/professor", method = RequestMethod.GET)
	public String showDetalhe() {
		return "professor/detalhe";
	}
	
	@RequestMapping(value = "/professor", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Professor professor
			) {
		
		service.incluir(professor);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/professor/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public ProfessorService getService() {
		return service;
	}
	public void setService(ProfessorService service) {
		this.service = service;
	}
}
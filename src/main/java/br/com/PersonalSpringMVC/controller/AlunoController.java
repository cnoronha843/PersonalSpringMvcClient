package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.AlunoService;
import br.com.PersonalSpringMVC.model.service.ExercicioService;
import br.com.PersonalSpringMVC.negocio.Aluno;

@Controller
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@Autowired
	private ExercicioService exercicioService;
	
	@RequestMapping(value = "/alunos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("alunos", service.obterLista());
		
		return "aluno/lista";
	}
	
	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public String showDetalhe(
				Model model
			) {
		model.addAttribute("exercicios", exercicioService.obterLista());
		
		return "aluno/detalhe";
	}
	
	@RequestMapping(value = "/aluno", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Aluno aluno
			) {
		
		service.incluir(aluno);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/aluno/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public AlunoService getService() {
		return service;
	}
	public void setService(AlunoService service) {
		this.service = service;
	}
}
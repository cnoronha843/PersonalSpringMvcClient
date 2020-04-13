package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.AnaerobicoService;
import br.com.PersonalSpringMVC.negocio.Anaerobico;

@Controller
public class AnaerobicoController {

	@Autowired
	private AnaerobicoService service;
	
	@RequestMapping(value = "/anaerobicos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("anaerobicos", service.obterLista());
		
		return "anaerobico/lista";
	}
	
	@RequestMapping(value = "/anaerobico", method = RequestMethod.GET)
	public String showDetalhe() {
		return "anaerobico/detalhe";
	}
	
	@RequestMapping(value = "/anaerobico", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Anaerobico anaerobico
			) {
		
		service.incluir(anaerobico);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/anaerobico/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public AnaerobicoService getService() {
		return service;
	}
	public void setService(AnaerobicoService service) {
		this.service = service;
	}
}
package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.AerobicoService;
import br.com.PersonalSpringMVC.negocio.Aerobico;

@Controller
public class AerobicoController {

	@Autowired
	private AerobicoService service;
	
	@RequestMapping(value = "/aerobicos", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("aerobicos", service.obterLista());
		
		return "aerobico/lista";
	}
	
	@RequestMapping(value = "/aerobico", method = RequestMethod.GET)
	public String showDetalhe() {
		return "aerobico/detalhe";
	}
	
	@RequestMapping(value = "/aerobico", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Aerobico aerobico
			) {
		
		service.incluir(aerobico);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/aerobico/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public AerobicoService getService() {
		return service;
	}
	public void setService(AerobicoService service) {
		this.service = service;
	}
}
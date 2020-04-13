package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.PersonalSpringMVC.negocio.Anaerobico;

@Service
public class AnaerobicoService {

	@Autowired
	private RestTemplate rest;
	
	public List<Anaerobico> obterLista(){
		return (List<Anaerobico>)rest.getForObject("http://localhost:8080/api/anaerobico", List.class);	
	}
	
	public void incluir(Anaerobico anaerobico) {
		rest.postForEntity("http://localhost:8080/api/anaerobico", anaerobico, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/anaerobico/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
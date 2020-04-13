package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.PersonalSpringMVC.negocio.Aerobico;

@Service
public class AerobicoService {

	@Autowired
	private RestTemplate rest;
	
	public List<Aerobico> obterLista(){
		return (List<Aerobico>)rest.getForObject("http://localhost:8080/api/aerobico", List.class);	
	}
	
	public void incluir(Aerobico aerobico) {
		rest.postForEntity("http://localhost:8080/api/aerobico", aerobico, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/aerobico/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.PersonalSpringMVC.negocio.Exercicio;

@Service
public class ExercicioService {

	@Autowired
	private RestTemplate rest;
	
	public List<Exercicio> obterLista(){
		return (List<Exercicio>)rest.getForObject("http://localhost:8080/api/exercicio", List.class);	
	}
	
	public void incluir(Exercicio exercicio) {
		rest.postForEntity("http://localhost:8080/api/exercicio", exercicio, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/exercicio/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
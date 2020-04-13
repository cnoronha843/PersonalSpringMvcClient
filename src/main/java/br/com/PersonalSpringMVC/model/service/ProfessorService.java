package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.PersonalSpringMVC.negocio.Professor;

@Service
public class ProfessorService {

	@Autowired
	private RestTemplate rest;
	
	public List<Professor> obterLista(){
		return (List<Professor>)rest.getForObject("http://localhost:8080/api/professor", List.class);	
	}
	
	public void incluir(Professor 	professor) {
		rest.postForEntity("http://localhost:8080/api/professor", professor, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/professor/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
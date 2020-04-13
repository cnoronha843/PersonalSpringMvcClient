package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.PersonalSpringMVC.negocio.Aluno;

@Service
public class AlunoService {

	@Autowired
	private RestTemplate rest;
	
	public List<Aluno> obterLista(){
		return (List<Aluno>)rest.getForObject("http://localhost:8080/api/aluno", List.class);	
	}
	
	public void incluir(Aluno aluno) {
		rest.postForEntity("http://localhost:8080/api/aluno", aluno, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/aluno/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
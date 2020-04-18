	package br.com.PersonalSpringMVC.negocio;

import java.util.List;




public class Aluno extends Usuario{
	
	private Integer id;
	private int idade;
	private float peso;
	
	private  Professor professor;
	
	
	private List <Exercicio> exercicios;
	

	public Aluno() {
		super();
	}

	public Aluno(Integer id, int idade, float peso, Professor professor, List<Exercicio> exercicios) {
		super();
		this.id = id;
		this.idade = idade;
		this.peso = peso;
		this.professor = professor;
		this.exercicios = exercicios;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

		
	
	
	
	

		
	


	
		
	

	
	

}

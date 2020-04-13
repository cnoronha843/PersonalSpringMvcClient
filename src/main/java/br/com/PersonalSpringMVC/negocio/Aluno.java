	package br.com.PersonalSpringMVC.negocio;

import java.util.List;



/*@Entity
@Table(name= "TAluno")*/
public class Aluno{
	/*
	 * @Id
	 * 
	 * @GeneratedValue
	 */
	private Integer id;
	private int idade;
	private float peso;
	private String nome;
	private String telefone;
	/*
	 * @OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval
	 * = true )
	 * 
	 * @JoinColumn(name = "idProfessor")
	 */
	private  Professor professor;
	
	/*
	 * @OneToMany( mappedBy = "emprestimo", fetch = FetchType.EAGER, cascade =
	 * CascadeType.ALL, orphanRemoval = true )
	 * 
	 * @JoinColumn(name = "idExercicio")
	 * 
	 * @JsonManagedReference
	 */
	private List <Exercicio> exercicios;

		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public Aluno() {
		
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
	
	

		
	


	
		
	

	
	

}

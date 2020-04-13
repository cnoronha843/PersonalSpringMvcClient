package br.com.PersonalSpringMVC.negocio;

/*@Entity
@Table(name= "TProfessor")*/
public class Professor {
	/*
	 * @Id
	 * 
	 * @GeneratedValue
	 */
	private Integer id;
	private String cref;
	private String nome;
	
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Professor() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCref() {
		return cref;
	}


	public void setCref(String cref) {
		this.cref = cref;
	}
	
	
	
	
	
	

		
	


	
		
	

	
	

}

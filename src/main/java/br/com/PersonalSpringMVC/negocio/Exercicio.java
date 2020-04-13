package br.com.PersonalSpringMVC.negocio;

/*@Entity
@Table(name = "TExercicio")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoExercicio")
@JsonSubTypes({
    @JsonSubTypes.Type(value=Aerobico.class, name = "Aerobico"),
    @JsonSubTypes.Type(value=Anaerobico.class, name = "Anaerobico")
    
})*/
public abstract class Exercicio {
	/*
	 * @Id
	 * 
	 * @GeneratedValue
	 */
	private Integer id;
	private String nomeDoExercicio;
	private int tempoRecuperacao;
	private int quantidadeBlocos;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "idAluno")
	 * 
	 * @JsonBackReference
	 */
	private Aluno aluno;
	
	

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Exercicio(String nomeDoExercicio, int tempoRecuperacao, int quantidadeBlocos) {
		super();
		this.nomeDoExercicio = nomeDoExercicio;
		this.tempoRecuperacao = tempoRecuperacao;
		this.quantidadeBlocos = quantidadeBlocos;
	}
	
	public String getNomeDoExercicio() {
		return nomeDoExercicio;
	}

	public void setNomeDoExercicio(String nomeDoExercicio) {
		this.nomeDoExercicio = nomeDoExercicio;
	}

	public int getTempoRecuperacao() {
		return tempoRecuperacao;
	}

	public void setTempoRecuperacao(int tempoRecuperacao) {
		this.tempoRecuperacao = tempoRecuperacao;
	}

	public int getQuantidadeBlocos() {
		return quantidadeBlocos;
	}

	public void setQuantidadeBlocos(int quantidadeBlocos) {
		this.quantidadeBlocos = quantidadeBlocos;
	}


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Exercicio: %s",
				this.getNomeDoExercicio());
	}

	
}

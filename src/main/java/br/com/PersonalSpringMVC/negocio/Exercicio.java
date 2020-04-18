package br.com.PersonalSpringMVC.negocio;

public abstract class Exercicio {
	
	private Integer id;
	private String nomeDoExercicio;
	private int tempoRecuperacao;
	private int quantidadeBlocos;
	private String tipoExercicio;

	

	public Exercicio() {
	
	}


	public Exercicio(String nomeDoExercicio, int tempoRecuperacao, int quantidadeBlocos) {
		super();
		this.nomeDoExercicio = nomeDoExercicio;
		this.tempoRecuperacao = tempoRecuperacao;
		this.quantidadeBlocos = quantidadeBlocos;
	}
	
	
	public String getTipoExercicio() {
		return tipoExercicio;
	}


	public void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
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

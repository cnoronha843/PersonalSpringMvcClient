package br.com.PersonalSpringMVC.negocio;

public class Anaerobico extends Exercicio {
	
	private int qtdeRepeticao;
	private int peso;
	private String aparelho;

	
	
	public Anaerobico(String nomeDoExercicio, int tempoRecuperacao, int quantidadeBlocos, int qtdeRepeticao, int peso,
			String aparelho) {
		super(nomeDoExercicio, tempoRecuperacao, quantidadeBlocos);
		this.qtdeRepeticao = qtdeRepeticao;
		this.peso = peso;
		this.aparelho = aparelho;
	}
	public int getQtdeRepeticao() {
		return qtdeRepeticao;
	}
	public void setQtdeRepeticao(int qtdeRepeticao) {
		this.qtdeRepeticao = qtdeRepeticao;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getAparelho() {
		return aparelho;
	}
	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	
	
}

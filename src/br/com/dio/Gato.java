package br.com.dio;

public class Gato {
	
	public String nome;
	public String cor;
	public Integer idade;
	
	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
}

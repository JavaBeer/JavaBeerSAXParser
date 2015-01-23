package br.com.javabeer.saxparser.entity;

public class Cao {
	private int id;
	private String raca;
	private String porte;
	private int idade;
	private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Cao [id=" + id + ", raca=" + raca + ", porte=" + porte
				+ ", idade=" + idade + ", nome=" + nome + "]";
	}
	
}

package entites;

public class Pessoas {
	private int idade;
	private Double Peso;
	private Double Altura;
	
	
	
	
	public Pessoas(int idade, Double peso, Double altura) {
		this.idade = idade;
		Peso = peso;
		Altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return Peso;
	}
	public void setPeso(Double peso) {
		Peso = peso;
	}
	public Double getAltura() {
		return Altura;
	}
	public void setAltura(Double altura) {
		Altura = altura;
	}
	
	
	
}

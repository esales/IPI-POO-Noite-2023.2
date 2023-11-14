public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	
	public Carro(String marca,
				String modelo,
				int ano,
				String cor,
				double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String toString() {
		return this.marca + " - " + this.modelo + " - " + this.cor;
	}
	
	
	
}
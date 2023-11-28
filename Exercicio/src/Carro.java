public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	private Motor motor;
	
	public Carro() {
		super();
	}
	
	public Carro(String marca) {
		super();
		this.marca = marca;
	}
	
	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public Carro(String marca, String modelo, int ano, String cor, double preco, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", preco=" + preco
				+ ", motor=" + motor + "]";
	}

	
}
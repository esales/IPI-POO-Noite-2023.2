
public class Principal {

	public static void main(String[] args) {
		Motor m1 = new Motor("1.6 turbo", 304);
		Motor m2 = new Motor("2.0 DI DOHC VTEC Turbo", 297);
		
		Carro c1 = new Carro("Toyota", "Corolla", 2020, "Prata", 35000, m1);
		Carro c2 = new Carro("Honda", "Civic", 2018, "Vermelho", 30000, m2);
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
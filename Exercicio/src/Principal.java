
public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro("VW", "Gol", 2023, "Azul", 80000);
		
		System.out.println( c1.getMarca() );
		
		c1.setMarca("Volkswagen");
		
		System.out.println( c1.getMarca() );
		
		System.out.println(c1);

	}
}
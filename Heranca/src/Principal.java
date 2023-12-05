
public class Principal {

	public static void main(String[] args) {
		
		VeiculoTerrestre vt = new VeiculoTerrestre();
		
		vt.setMarca("Honda");
		
		System.out.println( vt.getMarca() );
		
		
		Veiculo veiculo1 = new Veiculo();
		
		VeiculoTerrestre veiculo2 = new VeiculoTerrestre();
		
		Veiculo veiculo3 = new VeiculoTerrestre();
		
		//VeiculoTerrestre veiculo4 = new Veiculo();
		
		System.out.println(veiculo3 instanceof VeiculoTerrestre);
		
		System.out.println(veiculo3 instanceof Veiculo);
		
		
		

	}

}

package exercicio01;

public class Principal {

	public static void main(String[] args) {
		Docente docente1 = new Docente();
		Discente discente1 = new Discente();
		TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo();
		
		docente1.setNome("Teste");
		docente1.setIdade(50);
		docente1.setAreaAtuacao("Computação");
		
		discente1.setCurso("IPI");
		discente1.setNome("Jakson");
		discente1.setIdade(46);
		
		tecnico1.setCargo("Técnico de TI");
		tecnico1.setNome("Teste02");
		tecnico1.setIdade(30);
		
		System.out.println(docente1 instanceof Pessoa);
		System.out.println(docente1 instanceof Docente);
	}
}
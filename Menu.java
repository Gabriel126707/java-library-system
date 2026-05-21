package my.java.project1;

public class Menu {
	
	private int op;
	
	public void mostrarMenu() {
		
		System.out.print("1 - Adicionar livro\n"
				+ "2 - Listar livros\n"
				+ "3 - Emprestar livro\n"
				+ "4 - Devolver livro\n"
				+ "5 - Remover livro\n"
				+ "6 - Sair\n"
				+ "Digite a opção >>> ");
	}
	
	public int getOpcao() {
		op = Main.scanner.nextInt();
		Main.scanner.nextLine();
		return op;
	}
	

	
}

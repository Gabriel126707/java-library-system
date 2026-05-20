package my.java.project1;
import java.util.Scanner;

public class Menu {
	
	private final Scanner scanner = new Scanner(System.in);
	private int op;
	
	public void mostrarMenu() {
		
		System.out.print("1 - Adicionar livro\n"
				+ "2 - Listar livros\n"
				+ "3 - Emprestar livro\n"
				+ "4 - Devolver livro\n"
				+ "5 - Sair\n"
				+ "Digite a opção >>> ");
	}
	
	public int getOpcao() {
		op = scanner.nextInt();
		scanner.nextLine();
		return op;
	}
	
}

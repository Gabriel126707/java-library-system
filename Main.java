package my.java.project1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static final Scanner scanner =	new Scanner(System.in);
	
	public static void main(String[] args) {
				
		Menu menu = new Menu();
		
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User("Gabriel"));
		users.add(new User("Joaquim"));
		
		int op = 0;
		int livroEscolhido;
		int usuarioEscolhido;
		
		while(op != 6) {
	
			menu.mostrarMenu();
			op = menu.getOpcao();
			
			switch (op) {
			
			
			case 1:
				// Adicionar Livro
				String titulo;
				String autor;
				
				System.out.print("Digite o titulo do livro: ");
				titulo = Main.scanner.nextLine();
				
				System.out.print("Digite o nome do autor do livro: ");
				autor = Main.scanner.nextLine();
				
				books.add(new Book(titulo, autor));
				

				break;
				
			case 2:
				// Listar Livros
				
				if(books.size() == 0) {
					System.out.println("\nNão possui livros cadastrados!");
				}
				else {
					System.out.println("\n>>>LISTAGEM DOS LIVROS<<<");
					for(Book b: books) {
						b.mostrarInfo();
						System.out.println("");
					}
				}
				
				System.out.println("");
				
				
				break;
				
			case 3:
				// Emprestar Livro
				// Definindo o Usuário
				System.out.println("\n===LISTA DE USUÁRIOS===");
				for (int i = 0; i < users.size(); i++) {
					System.out.println(i + " - " + users.get(i).getName());
				}System.out.print("Escolha o usuário: ");
				usuarioEscolhido = scanner.nextInt();
				
				// Definindo o Livro
				System.out.println("\n===LISTA DE LIVROS===");
				for (int i = 0; i < books.size(); i++) {
					System.out.println(i + " - " + books.get(i).getTitulo());
				}System.out.print("Escolha o livro: ");
				livroEscolhido = scanner.nextInt();
				
				users.get(usuarioEscolhido).pegarEmprestado(books.get(livroEscolhido));
			
				break;
				
			case 4:
				// Devolver Livro
				System.out.println("\n===LISTA DE USUÁRIOS===");
				for (int i = 0; i < users.size(); i++) {
					System.out.println(i + " - " + users.get(i).getName());
				}System.out.print("Escolha o usuário: ");
				usuarioEscolhido = scanner.nextInt();
				
				// Definindo o Livro
				System.out.println("\n===LISTA DE LIVROS===");
				
				for (int i = 0; i < books.size(); i++) {
					if (books.get(i).getDisponivel() == false) {
						System.out.println(i + " - " + books.get(i).getTitulo());
					}
					
				}System.out.print("Escolha o livro: ");
				livroEscolhido = scanner.nextInt();
				
				users.get(usuarioEscolhido).devolverBook(books.get(livroEscolhido));
				
								
				
				break;
				
			case 5:
				// Remover Livro
				System.out.println("\n===LISTA DE LIVROS===");
				for (int i = 0; i < books.size(); i++) {
					System.out.println(i + " - " + books.get(i).getTitulo());
				}System.out.print("Escolha o livro: ");
				livroEscolhido = scanner.nextInt();
				
				books.remove(livroEscolhido);
				
				
				
			}
			
			
		
		}
		
		System.out.println("Saindo...");


	}

}

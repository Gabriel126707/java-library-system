package my.java.project1;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
				
		Menu menu = new Menu();
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User("Usuario1"));
		users.add(new User("Usuario2"));
		
		
		int op = 0;
		
		while(op != 5) {
			
			menu.mostrarMenu();
			op = menu.getOpcao();
			
			switch (op) {
			case 1:
				
				books.add(new Book("Titulo 1", "Autor 1"));
				books.add(new Book("Titulo 2", "Autor 2"));
				System.out.println("");
				break;
				
			case 2:
				
				for(Book b: books) {
					b.mostrarInfo();
					System.out.println("");
				}
				break;
				
			case 3:
				
				users.get(0).pegarEmprestado(books.get(0));
				users.get(1).pegarEmprestado(books.get(1));
				
				break;
				
			case 4:
				
				users.get(0).devolverBook(books.get(0));
				users.get(1).devolverBook(books.get(1));
				
				break;
				
			}
			
			
		
		}
		
		System.out.println("Saindo...");


	}

}

package my.java.project1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<User> users = new ArrayList<User>();
		
		
		books.add(new Book("Use a Cabeça Java", "Sierra"));
		books.add(new Book("SQL","Thomas Nield"));
		
		users.add(new User("Gabriel"));
		users.add(new User("José"));
		
		Book book1 = books.get(0);
		Book book2 = books.get(1);
		
		User user1 = users.get(0);
		User user2 = users.get(1);
		
		user1.pegarEmprestado(book2);
		user2.pegarEmprestado(book1);
		System.out.println();
		
		user1.devolverBook(book2);
		user2.devolverBook(book1);
		System.out.println();
				
		for (Book b: books) {
			b.mostrarInfo();
			System.out.println();
			
		}


	}

}

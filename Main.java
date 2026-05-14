package my.java.project4;

public class Main {

	public static void main(String[] args) {
		
		//Books
		Book book1 = new Book("Use A Cabeça Java 3ª Edição","Sierra");
		Book book2 = new Book("Introdução à Linguagem SQL","Thomas Nield");
		
		// Users
		User user1 = new User("Gabriel");
		User user2 = new User("Joaquim");
		
		//Pegando um livro emprestado
		user1.pegarEmprestado(book1);
		user2.pegarEmprestado(book2);
		
		//Devolvendo o livro
		user1.devolverBook(book1);
		


	}

}

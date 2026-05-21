package my.java.project1;

public class User {
	
	
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void pegarEmprestado(Book book) {
		book.emprestar(this);
	}
	
	public void devolverBook(Book book) {
		book.devolver(this);
	}	
		
	
}

package my.java.project1;

public class Book {
	
	private String titulo;
	private String autor;
	private User usuarioAtual;
	private boolean disponivel;
	
	// Constructor
	public Book(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
	}
	
	// Getter
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public boolean getDisponivel() {
		return disponivel;
	}
	
	
	// Methods
	public void emprestar(User user) {
		
		if (disponivel) {
			
			this.disponivel = false;
			this.usuarioAtual = user;
			
			 System.out.println(
			            "Livro emprestado para: " +
			            user.getName());
		}
		else {

	        System.out.println(
	            "Livro indisponível"
	        );
		}
	}
	
	public void devolver(User user) {
		
		if(usuarioAtual == user && !disponivel) {

	        System.out.println(
	            usuarioAtual.getName() +
	            " devolveu o livro " + "(" +
	            titulo + ")"
	        );

	        disponivel = true;
	        usuarioAtual = null;

	    } else {

	        System.out.println(
	        	"Esse usuário não pegou esse livro!"
	        );
	    }
	}
	
	public void mostrarInfo() {

	    System.out.println(
	        "Título: " + titulo +
	        "\nAutor: " + autor +
	        "\nDisponível: " + disponivel
	    );

	    if(usuarioAtual != null) {

	        System.out.println(
	            "Emprestado para: " +
	            usuarioAtual.getName()
	        );
	    }
	}

}


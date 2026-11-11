package exercice5;

public class Book {
	private String isbn;
	private String title;
	private String author;

//   Constructeur en utilisant source 
	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	// Accesseurs (GETTERS ) utilisant source
	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// Affichage utilisant toString
	@Override
	public String toString() {
		return "[Livre] ISBN: " + isbn + " | Titre: " + title + " | Auteur: " + author;
	}
}

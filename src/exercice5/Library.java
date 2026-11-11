package exercice5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
	// 1. Inventaire global par List
	private List<Book> books = new ArrayList<>();

	// 2. Catégories uniques par Set
	private Set<String> categories = new HashSet<>();

	// 3. Index rapide par ISBN (Map)
	private Map<String, Book> isbnIndex = new HashMap<>();

	// 4. Gestion des emprunts : Livre -> Nom de l'emprunteur (Map)
	private Map<Book, String> loans = new HashMap<>();

	// Méthodes d'ajout
	public void addBook(Book book) {
		books.add(book);
	}

	public void addCategory(String category) {
		categories.add(category);
	}

	public void addBookIndexed(Book book) {
		books.add(book);
		isbnIndex.put(book.getIsbn(), book);
	}

	// Méthodes de recherche
	public List<Book> getBooks() {
		return books;
	}

	public Book findByIsbn(String isbn) {
		return isbnIndex.get(isbn);
	}

	// Gestion des prêts
	public boolean borrowBook(Book book, String borrower) {
		// Si le livre n'est pas déjà dans la map donc pas emprunté
		if (!loans.containsKey(book)) {
			loans.put(book, borrower);
			return true;
		}
		// Le livre est déjà emprunté
		return false;
	}

	public void returnBook(Book book) {
		loans.remove(book);
	}

	// Bonus : Afficher qui a emprunté quoi (pratique pour les tests)
	public void printLoans() {
		System.out.println("Livres actuellement empruntés");
		for (Map.Entry<Book, String> entry : loans.entrySet()) {
			System.out.println(entry.getKey().getTitle() + " est emprunté par " + entry.getValue());
		}
	}
}

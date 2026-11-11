package exercice5;

public class Main {
	public static void main(String[] args) {

		System.out.println("SYSTÈME DE GESTION DE BIBLIOTHÈQUE");

		Library maLibrairie = new Library();

		// 1. Création des livres (Tes mangas !)
		Book manga1 = new Book("978-111", "GOD OF FURY", "Rina Kent");
		Book manga2 = new Book("978-222", "GOD OF MALICE", "Rina Kent");
		Book manga3 = new Book("978-333", "VENOM", "Marvel");

		// 2. Ajout dans la bibliothèque (avec indexation)
		maLibrairie.addBookIndexed(manga1);
		maLibrairie.addBookIndexed(manga2);
		maLibrairie.addBookIndexed(manga3);

		// 3. Ajout de catégories (Set)
		maLibrairie.addCategory("Romance");
		maLibrairie.addCategory("Action");
		maLibrairie.addCategory("Romance");

		System.out.println("\n Test [1] : Recherche par ISBN ");
		Book livreTrouve = maLibrairie.findByIsbn("978-222");
		System.out.println("Livre trouvé : " + livreTrouve);

		System.out.println("\nTest [2] : Emprunt de livre ");
		boolean emprunt1 = maLibrairie.borrowBook(manga1, "Jennie");
		System.out.println("Emprunt de 'GOD OF FURY' par Jennie : " + (emprunt1 ? "Succès" : "Échec"));

		// On essaie de l'emprunter une 2ème fois
		boolean emprunt2 = maLibrairie.borrowBook(manga1, "Marcus");
		System.out.println("Emprunt de 'GOD OF FURY' par Marcus : " + (emprunt2 ? "Succès" : "Échec (Déjà pris)"));

		// On emprunte un autre livre
		maLibrairie.borrowBook(manga3, "Preston");

		// Affichage de l'état des emprunts
		maLibrairie.printLoans();

		System.out.println("\nTest [3] : Restitution d'un livre ");
		maLibrairie.returnBook(manga1);
		System.out.println("Maryame a rendu 'GOD OF FURY'.");

		// Maintenant que le livre est rendu, on peut le réemprunter
		boolean emprunt3 = maLibrairie.borrowBook(manga1, "Nico");
		System.out.println("Nico emprunte 'GOD OF FURY' : " + (emprunt3 ? "Succès" : "Échec"));

		// Affichage final
		maLibrairie.printLoans();
	}
}

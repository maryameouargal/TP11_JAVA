package exercice1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
	public static void main(String[] args) {

		System.out.println(" GESTION DU LIVRES");

		// 1. Initialisation de la liste
		List<String> livreList = new ArrayList<>();

		livreList.add("GOD OF FURY ");
		livreList.add("GOD OF MALICE ");
		livreList.add("VENOM");

		// 2. Affichage de la liste
		System.out.println("\n Inventaire initial ");
		for (String item : livreList) {
			System.out.println("* " + item);
		}

		// 3. Suppression d'un livre
		System.out.println("\n Suppression de VENOM");
		livreList.remove("VENOM");

		// 4. Vérification de la présence d'un livre
		boolean hasFury = livreList.contains("GOD OF FURY");
		System.out.println("Est-ce que le livre de  'GOD OF FURY' est toujours là ? " + hasFury);

		// 5. Affichage de la taille finale
		System.out.println("Nombre de livres restants : " + livreList.size());

		// Affichage de la liste finale pour prouver la suppression
		System.out.println("\n Inventaire final");
		System.out.println(livreList);
	}
}
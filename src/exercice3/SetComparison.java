package exercice3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
	public static void main(String[] args) {

		System.out.println(" COMPARAISON DES TYPES DE SET (ANIMAUX) ");

		// Liste d'animaux
		Set<String> hashSet = new HashSet<>(Arrays.asList("Tigre", "Lion", "Éléphant"));
		Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Tigre", "Lion", "Éléphant"));
		Set<String> treeSet = new TreeSet<>(Arrays.asList("Tigre", "Lion", "Éléphant"));

		// Affichage des résultats
		System.out.println("1. le resultat en utilisant  HashSet (désordonné)       : " + hashSet);
		System.out.println("2. le resultat en utilisant LinkedHashSet (insertion)  : " + linkedHashSet);
		System.out.println("3. le resultat en utilisant TreeSet (alphabétique)     : " + treeSet);
	}
}

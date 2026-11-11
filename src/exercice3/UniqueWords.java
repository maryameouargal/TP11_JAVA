package exercice3;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
	public static void main(String[] args) {

		System.out.println("ANALYSE DE MOTS UNIQUES (LÉGUMES)");

		// Phrase avec des doublons 
		String phrase = "carotte oignon carotte tomate oignon poivron carotte";
		String[] mots = phrase.split(" ");

		// Le HashSet élimine automatiquement les doublons
		Set<String> motsUniques = new HashSet<>();

		for (String mot : mots) {
			motsUniques.add(mot);
		}

		System.out.println("Phrase de départ : " + phrase);
		System.out.println("Mots uniques trouvés : " + motsUniques);
		System.out.println("Nombre de mots uniques : " + motsUniques.size());
	}
}
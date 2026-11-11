package exercice4;

import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
	public static void main(String[] args) {

		System.out.println("DICTIONNAIRE BILINGUE (NOURRITURE)");

		// 1. Création du dictionnaire
		Map<String, String> foodDictionary = new HashMap<>();

		// 2. Ajout de mots
		foodDictionary.put("carrot", "carotte");
		foodDictionary.put("onion", "oignon");
		foodDictionary.put("tomato", "tomate");
		foodDictionary.put("apple", "pomme");

		// 3. Test de recherche (get)
		System.out.println("\n Test de recherche");
		System.out.println("Traduction de 'onion' : " + foodDictionary.get("onion"));
		System.out.println("Traduction de 'apple' : " + foodDictionary.get("apple"));

		// 4. Exploration des vues (entrySet)
		System.out.println("\n Dictionnaire complet");
		for (Map.Entry<String, String> entry : foodDictionary.entrySet()) {
			System.out.println("Mot : " + entry.getKey() + " | Traduction : " + entry.getValue());
		}
	}
}
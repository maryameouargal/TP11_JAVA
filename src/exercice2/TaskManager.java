package exercice2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	public static void main(String[] args) {

		System.out.println("GESTIONNAIRE DE TÂCHES");

		// 1. Initialisation de la liste
		List<Task> devTasks = new ArrayList<>();

		// Ajout de tâches avec tes propres exemples
		devTasks.add(new Task("Corriger le ficher d'exercice"));
		devTasks.add(new Task("Écrire la documentation"));
		devTasks.add(new Task("Faire la revue de le fichier "));

		// 2. Marquer la première tâche comme terminée
		devTasks.get(0).setCompleted(true);
		devTasks.get(1).setCompleted(true);

		// 3. Affichage de toutes les tâches
		System.out.println("\n État des tâches");
		for (Task t : devTasks) {
			System.out.println(t);
		}
	}
}
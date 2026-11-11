package exercice2;

public class Task {
	private String title;
	private boolean completed;

	// Constructeur utilisant source
	public Task(String title) {
		this.title = title;
		this.completed = false;
	}

	// Accesseurs (GETTERS ) utilisant source
	public String getTitle() {
		return title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	// Affichage utilisant toString
	@Override
	public String toString() {
		return "[" + (completed ? "X" : " ") + "] " + title;
	}
}

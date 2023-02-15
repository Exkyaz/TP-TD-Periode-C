import java.util.ArrayList;

/**
 * Représente une tour du problème des tours de Hanoï.
 */
public class Tour {
	/** Nombre maximal de disques qu'une tour peut supporter. */
	private static final int MAX = 100;
	/** Disques supportés par la tour (chacun étant désigné par son diamètre). */
	private ArrayList<Integer> disques;
	/** Nombre de disques supportés par la tour. */
	private int nb;

	
	/**
	 * Construit une tour vide de tout disque.
	 */
	public Tour() {
		this(0);
	}

	public Tour(int nbDisques) {
		disques = new ArrayList<>();
		nb = nbDisques;
		for (int i = 0; i < nb; i++) {
			disques.add(nb - i);
		}
	}

	/**
	 * Retourne le nombre de disques étant sur la tour.
	 */
	public int nbDisques() {
		return nb;
	}


	public ArrayList<Integer> getDisques() {
		return disques;
	}

	/**
	 * Retourne une chaîne indiquant le diamètre des disques présents sur la
	 * tour (de la base au sommet).
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < nb; ++i) {
			if (i != 0)
				sb.append(", ");
			sb.append(disques.get(i));
		}
		return sb.toString() + "]";
	}

	public int remove() {
		assert !this.estVide();
		return disques.remove(disques.size() - 1);

	}

	private boolean estVide() {
		return disques.size() == 0;

	}


	public void add(int disqueAAjouter) {
		this.disques.add(disqueAAjouter);
	}

	public boolean estPleine() {
		return disques.size() == MAX;
	}


	public boolean verifieMouvement(int disqueSommet) {
		return !this.estPleine()
				&& disqueSommet < this.disques.get(this.disques.size() - 1);
	}

	public Integer getDernierDisque() {
		return this.disques.get(this.disques.size() - 1);
	}


}

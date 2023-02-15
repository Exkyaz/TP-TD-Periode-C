public class Appli {
	/**
	 * Déplace le disque étant au sommet d'une tour vers une autre.
	 * 
	 * @param de
	 *            La tour d'où est retiré le disque étant au sommet.
	 * @param vers
	 *            La tour sur laquelle le disque est déposé.
	 */
	private static void bouger(Tour de, Tour vers) {
		int disqueSommet = de.remove();
		if (vers.verifieMouvement(disqueSommet)) {
			vers.add(disqueSommet);
		}
	}

	/**
	 * Déplace plusieurs disques étant au sommet d'une tour vers une autre en
	 * employant une troisième tour intermédiaire.
	 * 
	 * @param de
	 *            La tour de départ.
	 * @param nb
	 *            Le nombre de disques devant être déplacés de son sommet.
	 * @param vers
	 *            La tour destination.
	 * @param via
	 *            La tour servant d'intermédiaire dans les dépacements.
	 * @return Le nombre de déplacements de disques effectués.
	 */
	private static int déplacer(Tour de, int nb, Tour vers, Tour via) {
		assert (de.nbDisques() >= nb);
		if (nb == 0)
			return 0;
		int nbdep1 = déplacer(de, nb - 1, via, vers);
		bouger(de, vers);
		int nbdep2 = déplacer(via, nb - 1, vers, de);
		return nbdep1 + 1 + nbdep2;
	}

	/** Programme illustrant le problème des tours de Hanoï. */
	public static void main(String[] args) {
		final int TAILLE = 3, N = 20;
		Tour[] tours = new Tour[TAILLE];

		// A compléter
		// Initialiser le tableau de façon à ce que tours[0] contienne 
		// tous les disques de taille N, N-1, ..., 1 et que les autres 
		// soient vides de disque
		for (int i = 0; i < TAILLE; i++) {
			tours[i] = new Tour(i == 0 ? N : 0);
		}
		
		for (Tour t : tours)
			System.out.println(t.toString());

		int nbdep = déplacer(tours[0], N, tours[2], tours[1]);
		System.out.println("nombre de déplacements : " + nbdep);
		
		for (Tour t : tours)
			System.out.println(t.toString());
	}
}

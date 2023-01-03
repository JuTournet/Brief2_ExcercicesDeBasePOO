package Brief_ExcercicesDeBasePOO;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	List<Livre> maBiblio = new ArrayList<>();

	/**
	 * Ajoute un livre à la bibliothèque
	 * @param titre
	 * @param name
	 * @param firstname
	 * @param category
	 * @param isbn
	 */
	public void addLivre(String titre, String name, String firstname, String category, String isbn) {
		Livre unLivre = new Livre(titre, name, firstname, category, isbn);
		maBiblio.add(unLivre);
	}

	/**
	 * Supprime le livre indiqué en param
	 * @param titre
	 */
	public void removeLivre(String titre) {
		for (Livre unLivre : maBiblio) {
			if (unLivre.getTitle() == titre) {
				maBiblio.remove(unLivre);
				break;
			}
		}
	}

	/**
	 * Affiche les informations du livre spécifié
	 * @param titre
	 */
	public void bookInfo(String titre) {
		for (Livre unLivre : maBiblio) {
			if (unLivre.getTitle() == titre) {
				System.out.println("Titre: " + unLivre.getTitle());
				System.out.println("Auteur: " + unLivre.getAuthorName() + " " + unLivre.getAuthorFirstName());
				System.out.println("Catégorie: " + unLivre.getCategory());
				System.out.println("ISBN: " + unLivre.getISBN());
				System.out.println("Code: " + unLivre.getCode());
			}
		}
	}
}

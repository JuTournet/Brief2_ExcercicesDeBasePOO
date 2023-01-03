package Brief_ExcercicesDeBasePOO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {

	/**
	 * Affiche le nombre de chaque lettre dans la chaine saisie
	 */
	public static void numLettre() {
		try {
			// On récupère la string a analyser
			System.out.println("Entrée: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			char[] ch = str.toCharArray();
			Map<String, Integer> hm = new HashMap<String, Integer>();

			// On assigne chaque caractères de la string dans la hashmap
			for (char i : ch) {
				String id = "" + i;
				// On recupère la valeur pour la clé id
				Integer j = hm.get(id);
				// On ajoute +1 à la valeur si la clé existe déjà dans la map
				hm.put(id, (j == null) ? 1 : j + 1);
			}

			// parcours la map pour afficher la key et la valeur
			for (Map.Entry<String, Integer> val : hm.entrySet()) {
				System.out.println("Element " + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times");
			}
		} catch (IOException e) {
			System.out.println("IO exception raised");
		}
	}
}

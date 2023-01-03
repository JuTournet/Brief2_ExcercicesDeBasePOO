package Brief_ExcercicesDeBasePOO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	/**
	 * Affiche une version minuscule et majuscule de la chaine saisie
	 */
	public static void minMaj () {
		try {
			System.out.println("Entrée: ");
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("Minuscule " + str.toLowerCase());
			System.out.println("Majuscule " + str.toUpperCase());
		}
		catch (IOException e) {
			System.out.println("IO exception raised");
		}
	}
}

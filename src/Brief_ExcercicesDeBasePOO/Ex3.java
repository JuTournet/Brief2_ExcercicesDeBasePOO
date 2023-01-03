package Brief_ExcercicesDeBasePOO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	/**
	 * Remplace 1 caractère sur 2 par une *
	 */
	public static void replace1in2() {
		try {
			System.out.println("Entrée: ");
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			char[] ch = str.toCharArray();
			// On incrèmente par 2
			for (int i=0; i<ch.length; i+=2) {
				ch[i] = '*';
			}
			String strBis = new String(ch);
			System.out.println(strBis);
		}
		catch (IOException e) {
			System.out.println("IO exception raised");
		}
	}
}

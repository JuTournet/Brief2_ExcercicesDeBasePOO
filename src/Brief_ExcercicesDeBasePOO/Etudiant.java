package Brief_ExcercicesDeBasePOO;

public class Etudiant {

	private String Name = "Smith";
	private String Firstname = "John";
	private int NoteMath = 10;
	private int NoteEnglish = 11;
	private int NotePhysique = 9;
	
	/**
	 * Affiche la moyenne des notes de l'étudiant
	 */
	public void moyenne() {
		System.out.println((NoteMath+NoteEnglish+NotePhysique)/3);
	}
	
	/**
	 * Affiche les initiales de l'étudiant
	 */
	public void initiale() {
		char[] nm = this.Name.toCharArray();
		char[] fnm = this.Firstname.toCharArray();
		char[] ini = {nm[0], fnm[0]};
		String str = new String(ini);
		System.out.println(str);
	}
	
	/**
	 * Affiche le trigramme de l'étudiant
	 */
	public void trigramme() {
		char[] nm = this.Name.toCharArray();
		char[] fnm = this.Firstname.toCharArray();
		char[] ini = {fnm[0], nm[0], nm[nm.length-1]};
		String str = new String(ini);
		System.out.println(str);
	}
}

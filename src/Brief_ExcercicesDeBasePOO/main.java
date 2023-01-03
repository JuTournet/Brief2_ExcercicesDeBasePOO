package Brief_ExcercicesDeBasePOO;

public class main {

	public static void main(String[] args) {

		System.out.println("Excercice 1");
		Ex1.numLettre();
		System.out.println("Excercice 2");
		Ex2.minMaj();
		System.out.println("Excercice 3");
		Ex3.replace1in2();
		
		/* Excercice 4 */
		System.out.println("Excercice 4");
		Bibliotheque maBiblio = new Bibliotheque();
		maBiblio.addLivre("Oui oui", "Non", "Maybe", "Surprenant", "1382942");
		maBiblio.bookInfo("Oui oui");	
		
		/* Excercice 5 */
		System.out.println("Excercice 5");
		Triangle unTriangle = new Triangle();
		unTriangle.perimetre();
		unTriangle.aire();
		unTriangle.moveTriangleX(5);
		unTriangle.reduce(3);
		
		
		/* Excercie 6 */
		System.out.println("Excercice 6");
		 System.out.println(Ex6.addition(2, 3));
		 System.out.println(Ex6.soustraction(2, 3));
		 System.out.println(Ex6.multiplication(2, 3));
		 System.out.println(Ex6.puissance(2, 3));
		 System.out.println(Ex6.division(2, 3));
		 System.out.println(Ex6.divisionEuclidienne(2, 3));	 
		
		/* Excercice 7 */
		System.out.println("Excercice 7");
		Etudiant johnSmith = new Etudiant();
		johnSmith.moyenne();
		johnSmith.initiale();
		johnSmith.trigramme();
		
		/* Excercice 8 */
		System.out.println("Excercice 8");
		Voiture uneTwingo = new Voiture();
		uneTwingo.showInfo();
		Voiture une500 = new Voiture("500", "Fiat", 80);
		une500.showInfo();
		
		
	}

}

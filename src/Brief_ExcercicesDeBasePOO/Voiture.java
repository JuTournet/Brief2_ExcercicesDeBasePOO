package Brief_ExcercicesDeBasePOO;

public class Voiture {

	private String Model = "Twingo";
	private String Marque = "Peugot";
	private int PW = 60;
	
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}

	public int getPW() {
		return PW;
	}

	public void setPW(int pW) {
		PW = pW;
	}

	/**
	 * Constructeur par default
	 */
	public Voiture() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur paramètré
	 * @param model
	 * @param marque
	 * @param pW
	 */
	public Voiture(String model, String marque, int pW) {
		super();
		Model = model;
		Marque = marque;
		PW = pW;
	}
	
	/**
	 * Affiche les info de la voiture
	 */
	public void showInfo() {
		System.out.println(Model);
		System.out.println(Marque);
		System.out.println(PW + " Chevaux");
	}
	
}

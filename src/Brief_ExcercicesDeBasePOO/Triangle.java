package Brief_ExcercicesDeBasePOO;

public class Triangle {

	private double c1 = 3;
	private double c2 = 4;
	private double c3 = 5;
	private int p1 = 1;
	private int p2 = 2;
	private int p3 = 6;
	
	/**
	 * Calculer le périmètre
	 */
	public void perimetre() {
		double p = c1 + c2+ c3;
		System.out.println("Périmètre: " + p);
	}
	
	/**
	 * Calculer l'aire
	 */
	public void aire() {
		double a = (Math.sqrt((c1+c2+c3)*(c2+c3-c1)*(c1-c2+c3)*(c1+c2-c3)))/4;
		System.out.println("Aire: " + a);
	}
	
	/**
	 * Déplacer les coordonnées en x du triangle
	 */
	public void moveTriangleX(int move) {
		System.out.println("Old coordinates: " + p1 + " " + p2 + " " + p3);
		p1 = p1 + move;
		p2 = p2 + move;
		p3 = p3 + move;
		System.out.println("New coordinates: " + p1 + " " + p2 + " " + p3);
	}
	
	/**
	 * Reduce the triangle by the value
	 * @param value
	 */
	public void reduce(int value) {
		System.out.println("Old size: " + c1 + " " + c2 + " " + c3);
		c1 = c1/value;
		c2 = c2/value;
		c3 = c3/value;
		System.out.println("New size: " + c1 + " " + c2 + " " + c3);
	}
}

package Brief_ExcercicesDeBasePOO;

public class Triangle {

	Point a = new Point(2, 4);
	Point b = new Point(3, 4);
	Point c = new Point(5, 6);
	private double ab = getDistance(a,b);
	private double ac = getDistance(a,c);
	private double bc = getDistance(b,c);
	
	
	/**
	 * Constructor
	 */
	public Triangle() {
		
	}
	
	/**
	 * Constructor with param
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public Triangle(Point num1, Point num2, Point num3) {
		a = num1;
		b = num2;
		c = num3;
		ab = getDistance(a,b);
		ac = getDistance(a,c);
		bc = getDistance(b,c);
	}
	
	/**
	 * Calculer le périmètre
	 */
	public void perimetre() {
		double perim = ab + ac+ bc;
		System.out.println("Périmètre: " + perim);
	}
	
	/**
	 * Calculer l'aire
	 */
	public void aire() {
		double aire = (Math.sqrt((ab+ac+bc)*(ac+bc-ab)*(ab-ac+bc)*(ab+ac-bc)))/4;
		System.out.println("Aire: " + aire);
	}
	
	/**
	 * Déplacer les coordonnées en x du triangle
	 */
	public void moveTriangle(double moveX, double moveY) {
		System.out.println("Old coordinates: Pa(" + a.getX() + "," + a.getY() + ") Pb(" + b.getX() + "," + b.getY() + ") Pc(" + c.getX() + "," + c.getY() + ")");
		a.setX(a.getX()+moveX);
		a.setY(a.getY()+moveY);
		b.setX(a.getX()+moveX);
		b.setY(a.getY()+moveY);
		c.setX(a.getX()+moveX);
		c.setY(a.getY()+moveY);
		System.out.println("New coordinates: Pa(" + a.getX() + "," + a.getY() + ") Pb(" + b.getX() + "," + b.getY() + ") Pc(" + c.getX() + "," + c.getY() + ")");
	}
	
	/**
	 * Reduce the triangle by the value
	 * @param value
	 */
	public void reduce(int value) {
		System.out.println("Old size: " + ab + " " + ac + " " + bc);
		ab = ab/value;
		ac = ac/value;
		bc = bc/value;
		System.out.println("New size: " + ab + " " + ac + " " + bc);
	}
	
	private double getDistance(Point first, Point second) {
		return Math.sqrt(Math.pow(first.getX()-second.getX(), 2) + Math.pow(first.getY()-second.getY(), 2));
	}
}

import java.lang.Math;
	public class Pythagorean {
	    public double calculateHypotenuse(int legA, int legB) {
	   		double legC = (legA*legA + legB*legB);
	   		double squareRoot = Math.sqrt(legC);
	   		return squareRoot;
	    }
	}

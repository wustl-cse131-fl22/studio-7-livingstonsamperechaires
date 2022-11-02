package studio7;

public class Die {

	private int sides;
	
	public Die (int n) {
		sides = n;
		
		
	}
	public int numberSides() {
		int numSides = (int)((Math.random()*sides)+1);
		return numSides;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die x = new Die (6);
		int sideLanded = x.numberSides();
		System.out.println(sideLanded);
	}

}

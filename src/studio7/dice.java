package studio7;

public class dice {
	private int value;
	
	public dice(int sides) {
		value = (int) (Math.random()*(sides) +1 );
	}
	

	public static void main(String[] args) {
		dice sixSidedDice = new dice(6);
		System.out.println("output " + sixSidedDice.value);

		
		
	}

}

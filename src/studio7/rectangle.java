package studio7;

public class rectangle {
	private boolean square;
	private int length;
	private int width;
	private int perimeter;
	private int area;
	
	public rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		int perimeter = 2 * (length + width);
		area = length * width;
		boolean square = false;
		if (length==width) {
			square = true;
		}
		
		//return area;
	}
	
	public boolean compareArea(rectangle two) {
		if (this.area > two.area) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
	int randomLength = (int) (Math.random()*11 +10);
	int randomWidth = (int) (Math.random()*11 +10);
	int randomArea = randomLength * randomWidth;
	rectangle rectangle1 = new rectangle(randomLength, randomWidth);
	int randomLength2 = (int) (Math.random()*11 +10);
	int randomWidth2 = (int) (Math.random()*11 +10);
	int randomArea2 = randomLength2 * randomWidth2;
	rectangle rectangle2 = new rectangle(randomLength2, randomWidth2);
	
	/*if (rectangle2.area > rectangle1.area) {
		System.out.println("Rectangle 2 is bigger than 1!");
	}
	else {
		System.out.println("Rectangle 1 is bigger than 2!");
	}
	if (rectangle1.square) {
		System.out.println("Rectangle 1 is a square!");
	} */
	System.out.println(randomArea);
	System.out.println(randomArea2);
	if (rectangle1.compareArea(rectangle2)) {
		System.out.println("Rectangle 1 is bigger than 2!"); 
	}
	else {
		System.out.println("Rectangle 1 is NOT bigger than 2!");
	}

	}

}

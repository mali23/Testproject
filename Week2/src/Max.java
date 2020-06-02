import java.util.Scanner;

public class Max {
private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public Max() {
		
	}
	public Max(int x) {
		
	}
	public static int inputMethod() {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int x = input1.nextInt();
		input1.close();
		return x;
		
	}
	
	public double maximum(double num1, double num2) {//formal parameter
		
		min(2, num2);
		if(num1 > num2)
			return num1;
		else
			return num2;
		
	}
	
	private static double min(int num1, double num2) {
		
		if(num1 > num2)
			return num2;
		else
			return num1;
		
	}
	
	
	
	
	
}

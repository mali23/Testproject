import java.text.Format;
import java.util.Scanner;

public class ComputeArea {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Compute Area Program");
		
		System.out.print("Please input the radius of the circle: ");
		double radi = input.nextDouble();
	
		double area;
		
		final int variable = 1;
		
	    area = radi * radi* Math.PI;
	    System.out.println("The area of the circle is : " + area + variable);
	    // double  --- @double 
	        
	}
}

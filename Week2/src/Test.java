import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		Max.inputMethod();
		System.out.println(Max.inputMethod());
		System.out.print("Enter the value for number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter the value for number 2: ");
		double num2 = input.nextDouble();
		double x = 5;
		
		Max obj = new Max(); //no-argument constructor
		
		obj.setX(5);
		double answer = obj.maximum(num1, num2);
		
		
		
		System.out.print("The maximum of two numbers is: " + answer);*/
		//Max.inputMethod();
//		System.out.println(Max.inputMethod());
//		System.out.println("closing");
		
		double[] mylist = new double[10];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter " + mylist.length + " values: ");
		for(int i = 0; i<mylist.length; i++)
			mylist[i] = input.nextDouble();
		
		for(int i = 0; i<=mylist.length; i++)
			mylist[i] = Math.random() * 100;
		
	}
	
}

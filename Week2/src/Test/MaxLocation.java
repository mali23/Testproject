package Test;
/**********************************************
Workshop # 1
Last Name:Qanawati
First Name:Roni
ID:019901131
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:2020-05-27
**********************************************/
import java.util.Scanner;

public class MaxLocation {

	private int numOfRows; 		//Modifiers private more suitable for classes due to data encapsulation
	private int numOfCols;		//Modifiers private more suitable for classes due to data encapsulation
	private double arrayOfInt[][];		//Modifiers private more suitable for classes due to data encapsulation
	
	 Scanner userInput = new Scanner(System.in);	//any particular reason for making Scanner to be static
	
	public MaxLocation captureInput(MaxLocation Obj)
	{
		System.out.print("Enter the number of rows: ");	
		Obj.numOfRows = userInput.nextInt();
		
		System.out.print("Enter the number of columns: ");
		Obj.numOfCols = userInput.nextInt();
		
		Obj.arrayOfInt = new double[Obj.numOfRows][Obj.numOfCols];
		
		return Obj;
	}
	
	public MaxLocation fillArray(MaxLocation Obj)
	{
		System.out.println("Lets fill the 2-D array which has " + Obj.numOfRows + " and " + Obj.numOfCols + "/n");
		
		for(int i=0;i<Obj.numOfRows;i++)
		{
			System.out.println("Row " + (i + 1) + " ");
			
			for(int j=0;j<Obj.numOfCols;j++)
			{
				System.out.print("Column " + (j + 1) + ": ");
				Obj.arrayOfInt[i][j] = userInput.nextDouble();
			}
		}
		
		return Obj; 
	}
	
	public static double[] Maximum(MaxLocation Obj) 
	{
		double[] largestNum = new double[3];
		
		for(int i = 0; i < Obj.arrayOfInt.length; i++)
		{
            for(int j = 0; j < Obj.arrayOfInt[i].length; j++)
            {
                if(Obj.arrayOfInt[i][j] > largestNum[0])
                {
                	largestNum[0] = Obj.arrayOfInt[i][j];
                	largestNum[1] = i + 1;
                	largestNum[2] = j + 1;
                }
            }
        }
		
		return largestNum;
	}
	

	

}

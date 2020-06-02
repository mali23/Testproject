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


public class MainEntry 
{
	public static void main(String[] args) 
	{
		MaxLocation obj = new MaxLocation();
		
		obj.captureInput(obj);
		
		obj.fillArray(obj);
		
		//[max num], [row of max num] , [col of max num]
		double[] Calculated = MaxLocation.Maximum(obj);
				
		int Row = (int) Calculated[1];
		int Col = (int) Calculated[2];
		
		
		System.out.println("The location of the largest element is " + Calculated[0] + " at Row: " + Row +", Column: " + Col + "");
	}
	
	
}

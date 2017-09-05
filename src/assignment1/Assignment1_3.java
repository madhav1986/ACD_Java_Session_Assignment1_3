package assignment1;
import java.util.Scanner;

/*
This Class will help you to master the following concepts:
Variable declaration and assignment of value
Operators & logic building
 */
public class Assignment1_3 
{

	public static void main(String[] args) 
	{
		//declaring all the variables 
		byte bite=0; 
		byte bite1=0; 
		
		boolean bulean = true;
		boolean bulean1 = false;
		
		Scanner input=new Scanner(System.in); // Scanner to take input from the user.
		System.out.println("Enter First Byte variable");
		bite=input.nextByte(); //initializing the first byte variable
		
		System.out.println("Enter Second Byte variable");
		bite1=input.nextByte(); //initializing the second byte variable
		
		//applying the logic as stated in the assignment.
		
		System.out.println(bite & bite1);
		
		System.out.println("Enter First Boolean variable");
		bulean=input.nextBoolean();
		
		System.out.println("Enter Second Boolean variable");
		bulean1=input.nextBoolean();
		System.out.println(bulean && bulean1);
		input.close();
	}

}

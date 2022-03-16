package Pack1;

import java.util.Scanner;

public class GreaterOfThree 

{

	int a,b,c;
	
	void input()
	{
		Scanner s3 = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		a=s3.nextInt();
		
		b=s3.nextInt();
		
		c=s3.nextInt();
		
		s3.close();
		
	}
	
	void checkAndDisplay()
	
	{
		if((a>b) && (a>c))
		{
		  System.out.println("Largest number is "+a);
		}
			
		else if ((b>a)&&(b>c))
		  {
			System.out.println("Largest number is "+b);
		  }
		
		else 
			{
			System.out.println("Largest number is "+c);
			}
			
	}
	
	public static void main(String[] args) 
	
	{
		GreaterOfThree g3= new GreaterOfThree();
		
		g3.input();
		
		g3.checkAndDisplay();

	}

}

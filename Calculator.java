package Pack1;

public class Calculator

{
	int x,y;
	
	void add()
	{
		x=20;
		y=30;
		System.out.println("Sum=" + (x+y));
	}

	void subtract()
	{
		x=100;
		y=60;
		System.out.println("Difference="+ (x-y));
	}
	
	public static void main(String[] args)
	
	{
		Calculator obj = new Calculator();
		obj.add();
		obj.subtract();
	}

}

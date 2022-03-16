package Pack1;

import java.util.Scanner;

public class Product

{
	
	String product_name;
	int price;
	float discount;
	
	void productDetails()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Product Name: ");
		
		product_name=s.next();
		
		System.out.println("Enter Price of the product: ");
		
		price = s.nextInt();
		
		s.close();
		
	}
	
	float discCal()
	{
		if(price>2000)
		{
			discount= 0.1f*price;
		}
		
		else
		{
			discount=0.07f*price;
		}
		return discount;
	}

	public static void main(String[] args)

	{
		float disc;
		
		Product p = new Product();
		
		p.productDetails();
		
		disc=p.discCal();
		
		System.out.println("The discount offered on the product is Rs." + disc);
		
	}

}

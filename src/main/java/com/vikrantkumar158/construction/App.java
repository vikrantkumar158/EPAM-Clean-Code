package com.vikrantkumar158.construction;

import java.util.Scanner;

public class App 
{
	static 
	{
		int type;
		double area;

		Scanner scan=new Scanner(System.in);
		System.out.format("%s","Enter value For Construction type : \n");
		System.out.format("%s","1. Standard Type\n");
		System.out.format("%s","2. Above Standard Type\n");
		System.out.format("%s","3. High Standard Type\n");
		System.out.format("%s","4. High Standard Type + Automation \n");
		System.out.format("%s","\nEnter your choice : ");
		type=scan.nextInt();
		System.out.format("%s","Enter House Area : ");
		area=scan.nextDouble();
		scan.close();
		
		Construction c=new Construction();
		c.setConstructionData(type, area);
		c.calculateTotalCost();
		c.displayResult();
	}
  	public static void main(String[] args) 
  	{
	
  	}
}
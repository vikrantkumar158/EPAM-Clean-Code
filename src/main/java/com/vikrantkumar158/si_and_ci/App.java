package com.vikrantkumar158.si_and_ci;

public class App 
{
	static 
	{
		SimpleInterest si=new SimpleInterest();
		si.setData(1000,10,2);
		si.calculateSI();
		si.displayResult();
		CompoundInterest ci=new CompoundInterest();
		ci.setData(1000,10,2);
		ci.calculateCI();
		ci.displayResult();
	}
    public static void main( String[] args )
    {
    	
    }
}
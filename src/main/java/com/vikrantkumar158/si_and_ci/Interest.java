package com.vikrantkumar158.si_and_ci;

import java.io.*;

public abstract class Interest
{
	public double principle;
	public static double rate;
	public double timePeriod;
	public static PrintStream myout;

	public Interest()
	{
		Interest.myout= new PrintStream(new FileOutputStream(FileDescriptor.out));
	}

	public static void setRate(double rate)
	{
		Interest.rate=rate;
	}

	public abstract void setData(double principle,double rate,double timePeriod);

	public abstract void displayResult();
}
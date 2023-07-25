package Package_2;

import Package_2.Class_2;

public class Class_2 
{
	public Class_2() 
	{
		this(77,88,99);
		System.out.println("Default Constructor");
	}
	public Class_2(int a) 
	{
		this(11,22,33,44);
		System.out.println("One Parameterized Constructor");
	}
	public Class_2(int a,int b) 
	{
		this();
		System.out.println("Two Parameterized Constructor");
	}
	public Class_2(int a,int b,int c) 
	{
		System.out.println("Three Parameterized Constructor");
	}
	public Class_2(int a,int b,int c,int d) 
	{
		this(55,66);
		System.out.println("Four Parameterized Constructor");
	}

	public static void main(String[] args) 
	{
		Class_2 obj = new Class_2(11);

	}

}

package org.Practice;

public class ObjectEx_1 {
	public int a = 10, b=20;


	public static void main(String[] args)
	{
		System.out.println("********Program Start***********");

		ObjectEx_1 obj = new ObjectEx_1();
		obj.test1();
		System.out.println("The value of a is = " + obj.a);
		System.out.println("The value of b is = " + obj.b);

		System.out.println("********Program Ends***********");

	}



	public void test1()
	{
		int sum = a + b;
		System.out.println("Output of Sum = " + sum);
	}
}

package org.Practice;

public class Hello {
	public static void main(String[] args)

	{
		System.out.println("Hello");

//Interview question
		String str = "";

		for(int i=2; i<7; i++)
		{
			if(i==3)
				continue;

			if(i==5)
				break;

			str = str +i ;

		}

		System.out.println(str);
	}
}

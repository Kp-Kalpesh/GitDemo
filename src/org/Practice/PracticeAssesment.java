package org.Practice;

public class PracticeAssesment {

	public static void main(String[] args)
	{
		PracticeAssesment.method();
	}


	public static boolean method() {

		boolean flag = true;

//		String ars[] = {"abc", "bdf", "gdf", "hdg"};
		int ar[] = {1,3,5,7,9};

		for(int i=0; i<ar.length; i++)
		{

			if(i%2 != 0)
			{
				System.out.println(ar[i]);
				flag = true;
				//				  return flag;
			}	


		}
		System.out.println(flag);

		return flag;


	}

}



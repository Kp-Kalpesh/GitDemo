package org.Practice;

import java.io.File;
import java.util.Scanner;

public class ScannerEx_1 {
	public static void main(String[] args)
	{
		System.out.println("***** Program Start******");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String : ");

		String str = scn.next();
		
		System.out.println("Str = "+str);
		
		System.out.println("***** Program Ends******");
		
		 // Take screenshot
//        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File destFile = new File("screenshot.png");
//        FileUtils.copyFile(srcFile, destFile);
//        
        
        

	}

}

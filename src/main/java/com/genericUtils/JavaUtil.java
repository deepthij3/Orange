package com.genericUtils;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil {
	private JavaUtil()
	{
		
	}
	public static JavaUtil objForJavaUtil()
	{
		JavaUtil js=new JavaUtil();
		return js;
		
	}
	
	public int generateRandomNuber()
	{
		Random r= new Random();
		return r.nextInt(1000);
	}
	


}

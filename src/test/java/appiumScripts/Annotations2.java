package appiumScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 {
	
	//@BeforeTest //AfterTest
	
	
	// beforeclass //afterclass
	
	
	@BeforeClass
	public void setup()
	{
		System.out.println("my setup code");
	}

	@BeforeMethod
	public void login()
	{
		System.out.println("my login code");
	}
	
	@Test(priority='1')
	public void homepage()
	{
		System.out.println("my homepage code");
	}
	
	@Test(priority='2')
	public void createemail()
	{
		System.out.println("my create code");
	}
	@Test(priority='3')
	public void deleteemail()
	{
		System.out.println("my delete code");
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("my logout code");
	}

	@AfterClass
	public void lockdevice()
	{
		System.out.println("my lockdevice code");
	}
	
	
	
	
	
}

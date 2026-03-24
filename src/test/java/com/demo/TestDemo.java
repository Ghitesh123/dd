package com.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {

	
	@Test
	public void testGoogle() {
		
		WebDriver driver=new ChromeDriver();
		
		System.out.print("Hellow");
		driver.get("https://www.google.com");
System.out.println("hi hitesh how are you");	

driver.close();
	}
}

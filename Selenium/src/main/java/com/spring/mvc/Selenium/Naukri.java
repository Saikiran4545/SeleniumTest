package com.spring.mvc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Karuna Kadam\\Downloads\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(5000);
		driver.findElement(By.id("usernameField")).sendKeys("saikiran4572@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Shivansh@4545");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//button[normalize-space()='SKIP AND
		// CONTINUE']")).click();
		driver.findElement(By.xpath("//input[@id='qsb-keyskill-sugg']")).sendKeys("java");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[normalize-space()='Java']")).click();
		driver.findElement(By.xpath("//input[@id='qsb-location-sugg']")).sendKeys("Pune");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='Sbtn'][normalize-space()='Pune']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}

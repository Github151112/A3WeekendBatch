package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//identify the email text field
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("amansingh@gmail.com");
		
		//identify the password text field
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		passwordTextField.sendKeys("hdsvchgdsvc");
		
		//click on login button
		WebElement loginButton = driver.findElement(By.className("_6lth"));
		loginButton.click();
		
	}

}

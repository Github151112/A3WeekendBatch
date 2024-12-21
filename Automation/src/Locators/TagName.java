package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		//to launch the application
		driver.get("https://demowebshop.tricentis.com/");
		//identify the web element by tag name
		WebElement element = driver.findElement(By.tagName("input"));
		element.sendKeys("books");
		
	}

}

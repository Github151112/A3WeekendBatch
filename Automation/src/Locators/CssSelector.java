package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement cna = driver.findElement(By.cssSelector("a[data-testid^='o']"));
		cna.click();
		
		WebElement fn = driver.findElement(By.cssSelector("input[aria-label*='ir']"));
		fn.sendKeys("Aman");
	}

}

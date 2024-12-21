package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
//		/*
//		 * 	WebElement search = driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("books");
//		search.clear();
//		search.sendKeys("computer");
//		 * 
//		 */
//		
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
//		System.out.println(logo.getCssValue("color"));
//		System.out.println(logo.getCssValue("font-size"));
//		System.out.println(logo.getCssValue("margin"));
//		
//		System.out.println(logo.getAttribute("src"));
//		System.out.println(logo.getAttribute("alt"));
//		
//		System.out.println(logo.getTagName());
//		
//		System.out.println(logo.getSize());
//		
//		System.out.println(logo.getLocation());
//		
//		Rectangle r = logo.getRect();
//		
//		System.out.println(r.getX());
//		System.out.println(r.getY());
//		System.out.println(r.getHeight());
//		System.out.println(r.getWidth());
		
		WebElement checkbox = driver.findElement(By.id("RememberMe"));
		checkbox.click();
		if(checkbox.isSelected())
			System.out.println("checkbox is already selected");
		else
			checkbox.click();
		
		
		
		
	}

}

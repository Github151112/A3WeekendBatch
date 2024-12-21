package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		WebElement cases = driver
				.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/..//span[@style='color:#aaa']"));
		System.out.println(cases.getText());
	}

}

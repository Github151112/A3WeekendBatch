package Assignmenty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBlinkit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		Thread.sleep(2000);
		WebElement sl = driver.findElement(By.name("select-locality"));
		sl.sendKeys("Noida");
		Thread.sleep(2000);
		sl.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Noida, Uttar Pradesh, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("milk");
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath(
				"//div[text()='Amul Taaza Toned Fresh Milk']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']"));
		add.click();
		
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
		}
	}

}

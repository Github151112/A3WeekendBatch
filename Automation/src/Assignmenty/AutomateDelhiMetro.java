package Assignmenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDelhiMetro {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://delhimetrorail.com/");
		// click on crosss button
		WebElement crossButton = driver.findElement(By.id("buttonDismiss1"));
		crossButton.click();
		Thread.sleep(2000);
		// click on from dropdown
		WebElement from = driver.findElement(By.id("FromStation"));
		from.click();
		Thread.sleep(2000);
		// select line 1
		WebElement lin1 = driver.findElement(By.xpath("//div[text()='RITHALA']"));
		lin1.click();
		Thread.sleep(2000);
		// select mohan nagar
		WebElement mh = driver.findElement(By.xpath("//font[text()='MOHAN NAGAR']"));
		mh.click();
		Thread.sleep(2000);
		// click on to
		WebElement to = driver.findElement(By.id("ToStation"));
		to.click();
		Thread.sleep(2000);
		WebElement ne = driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']"));
		ne.click();
		Thread.sleep(2000);
		WebElement dw = driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 9']"));
		dw.click();
		Thread.sleep(2000);
		WebElement sButton = driver.findElement(By.xpath("//button[text()='Show Route & Fare']"));
		sButton.click();
		Thread.sleep(2000);
		WebElement crossButton1 = driver.findElement(By.id("buttonDismiss1"));
		crossButton1.click();
		
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.xpath("//li[text()='+']")).click();
			Thread.sleep(1000);
		}
		
		
		
		
	}

}

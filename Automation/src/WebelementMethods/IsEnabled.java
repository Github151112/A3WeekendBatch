package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		if (emailTextField.isEnabled())
			emailTextField.sendKeys("54541548484");
		else
			System.out.println("Text field is disabled");
	}

}

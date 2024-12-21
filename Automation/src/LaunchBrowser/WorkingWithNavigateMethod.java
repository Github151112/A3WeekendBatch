package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.swiggy.com");
		Thread.sleep(2000);
		// to go back
		driver.navigate().back();
		Thread.sleep(2000);
		// to go forward
		driver.navigate().forward();
		Thread.sleep(2000);
		// to refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		// close
		driver.quit();

	}

}

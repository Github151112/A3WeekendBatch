package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) {
		
		//to launch the browseer
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the application
		driver.get("https://www.selenium.dev/downloads/");
		//capture the title of the web page
		String actual_title = driver.getTitle();
		String expectedTitle = "Downloads |Selenium";
		
		if(actual_title.equals(expectedTitle))
			System.out.println("Download page is displayed");
		else
			System.out.println("Download page is not displayed");
		
		
		String actual_url = driver.getCurrentUrl();
		String expectedUrl = "https://www.selenium.dev/downloads/";
		
		if(actual_url.equals(expectedUrl))
			System.out.println("download page is displayed");
		else
			System.out.println("Download page is not displayed");
		
		
		System.out.println(driver.getPageSource());
		
		
	}

}

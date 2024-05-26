package infyni.cucumber2024may.base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void launchApplication(String browser) throws Exception {

		if (browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("Browser is invalid");
		}

		driver.get("https://studio.cucumber.io/users/sign_in");
		driver.manage().window().maximize();

	}

	public static void implicitWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}
	
	
	public static void closeBrowser() {
		driver.close();
	}
	
	
}

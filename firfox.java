package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firfox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\reena1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}

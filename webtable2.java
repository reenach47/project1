package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		String ok = driver.findElement(By.xpath("//div/table/tbody/tr[3]/td[1]']")).getText();
		System.out.println(ok);
		}

}

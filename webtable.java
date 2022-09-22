package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/EI13147/Downloads/WebTable.html");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).click();
		
		String string = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println(string);
	}
}


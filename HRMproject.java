package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMproject {
	WebDriver driver = new ChromeDriver();
	void login() {  
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		//System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();}
	    //Thread.sleep(1000);



    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
	HRMproject obj=new HRMproject();
	obj.login();
	obj.search("Admin");
	obj.search("Admin","sana");}
        
	    
	    //driver.findElement(By.xpath("//nav//div[2]//u1//1i[1]//a")).click();}
	
	void search(String userName) throws InterruptedException {
		driver.findElement(By.xpath("//a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        }
	void search(String userrole,String empName) {
		driver.findElement(By.xpath("//div[2]/div/div[2]/div/div")).sendKeys(userrole);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	//public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		//HRMproject obj=new HRMproject();
		//obj.login();
		//obj.search("Admin");
		//obj.search("Admin","sana");
		
	}

		
		
        
     



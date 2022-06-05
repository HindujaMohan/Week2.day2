package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogiDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("Email:")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("Password:")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[text()= 'Login']")).click();
		driver.findElement(By.linkText("Log Out")).click();
		System.out.println("Title of Web Page is :"+driver.getTitle());
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}

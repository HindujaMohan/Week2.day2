package week2.day2;

import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Hinduja");
		driver.findElement(By.name("lastname")).sendKeys("Mohan");
		driver.findElement(By.name("reg_email__")).sendKeys("hindhu.mj@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("12345678@Hi");
		
		Select dd0=new Select(driver.findElement(By.id("day")));
		dd0.selectByValue("11");
		
		Select dd1=new Select(driver.findElement(By.id("month")));
		dd1.selectByValue("8");
		
		Select dd2=new Select(driver.findElement(By.id("year")));
		dd2.selectByValue("2000");

		driver.findElement(By.xpath("//button[text()= 'Sign Up' ]")).click();

	}

}

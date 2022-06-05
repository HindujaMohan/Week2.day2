package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	public static void main(String[] args) {
		//setup chromeDriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		//identify WebElement 
		WebElement eleUserName = driver .findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hindhuja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(ele);
		dd.selectByVisibleText("Conference");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pooja");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("3yrs Experience in ML data operations at Amazon");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hindhu.mohan@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select wb = new Select(state);
		wb.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
			
	}

}

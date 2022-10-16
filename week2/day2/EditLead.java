package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.manage().window().maximize();
		//Login Credentials
		WebElement Name = driver.findElement(By.id("username"));
		Name.sendKeys("Demosalesmanager");
		WebElement Pswd = driver.findElement(By.id("password"));
		Pswd.sendKeys("crmsfa");
		//Login
		WebElement Login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		Login.click();
		//Click CRMSFA 
		WebElement CRMLink =driver.findElement(By.xpath("//div[@for='crmsfa']"));
		CRMLink.click();
		//Click Leads
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		//Click Findleads
		WebElement FindLeads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		FindLeads.click();
		//Enter Firstname
		Thread.sleep(2000);
		WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"ext-gen248\"]"));
		Firstname.sendKeys("Ramya");
		//Find the Leads
		WebElement FindingLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		FindingLeads.click();
		//Click the First Lead
		Thread.sleep(2000);
		WebElement Firstone = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click()", Firstone);
		//Firstone.click();
		//Verifying the title of the page
		System.out.println("Title is"+ driver.getTitle());
		if (driver.getTitle().contains("View"))
		{
			System.out.println("Verified");
		}else
			System.out.println("Title is incorrect");
		//Edit the Lead
		WebElement Editlead = driver.findElement(By.xpath("//a[text()='Edit']"));
		Editlead.click();
		WebElement updatecompname = driver.findElement(By.id("updateLeadForm_companyName"));
		updatecompname.clear();
		updatecompname.sendKeys("AAR Corp");
		//Click Update
		WebElement Update = driver.findElement(By.name("submitButton"));
		Update.click();
		//Confirm
		String confirmcompname =driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(confirmcompname.contains("AAR")){
			System.out.println("Company name is updated");
					}
		else 
			System.out.println("Companyname is not updated");
		//Close 
		driver.close();
		}
}

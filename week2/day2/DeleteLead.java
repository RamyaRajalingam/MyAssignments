package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("Demosalesmanager");
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
		//Click the Phone Tab
		WebElement Phone = driver.findElement(By.xpath("//li[@id='ext-gen240__ext-gen254']"));
		Phone.click();
		WebElement Phno = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		Phno.sendKeys("1234567");
		//Find the Leads
		WebElement FindingLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		FindingLeads.click();
		// Click First LEad
		Thread.sleep(2000);
		WebElement Firstlead=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String Leadid=Firstlead.getText();
		System.out.println(" LeadId " +Leadid);
		Thread.sleep(2000);
		Firstlead.click();
		//driver.executeScript("arguments[0].click()", Firstlead);
		//Delete the Lead
		WebElement Deletelead = driver.findElement(By.xpath("//a[text()='Delete']"));
		Deletelead.click();
		//Click Findleads
		WebElement FindLeadss = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		FindLeadss.click();
		//Enter the captured lead ID
		WebElement CapturedID = driver.findElement(By.xpath("//input[@id='ext-gen246']"));
		CapturedID.sendKeys(Leadid);
		//Find the Leads
		WebElement FindingLeadss = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		FindingLeadss.click();
		//Verify the message
		String VerifyMsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		Thread.sleep(2000);
		if(VerifyMsg.contains("record")) {
			System.out.println("Verification Done Successfully");
		}
		else
		{
			System.out.println("Not Verified");
		}
		driver.close();
	}
}

package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment1 {
	//Create Lead	
		public static void main(String[] args) {
			WebDriverManager.edgedriver().setup();
			EdgeDriver obj2=new  EdgeDriver();
			obj2.get("http://leaftaps.com/opentaps/control/main");
			obj2.manage().window().maximize();
		//Credentials
		WebElement elementname=obj2.findElement(By.id("username"));
		elementname.sendKeys("Demosalesmanager");
		WebElement elementpassword=obj2.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		WebElement login=obj2.findElement(By.className("decorativeSubmit"));
		login.click();
		//Entering into the page
		WebElement CRMSFA=obj2.findElement(By.linkText("CRM/SFA"));
		CRMSFA.click();
		WebElement Leads=obj2.findElement(By.linkText("Leads"));
		Leads.click();
		//Create Lead
		WebElement createlead=obj2.findElement(By.linkText("Create Lead"));
		createlead.click();
		//Entering the details
		WebElement Companyname=obj2.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("ABC Corp");
		WebElement Firstname=obj2.findElement(By.id("createLeadForm_firstName"));
		Firstname.sendKeys("Ramya");
		WebElement Lastname=obj2.findElement(By.id("createLeadForm_lastName"));
		Lastname.sendKeys("Rajalingam");
		WebElement Localname=obj2.findElement(By.id("createLeadForm_firstNameLocal"));
		Localname.sendKeys("RamyaRaj");
		WebElement Deptname=obj2.findElement(By.id("createLeadForm_departmentName"));
		Deptname.sendKeys("IT");
		WebElement Description=obj2.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("PersonRecord");
		WebElement Email = obj2.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("ramya.r@gmail.com");
		//Submit button
		WebElement LeadForm=obj2.findElement(By.className("smallSubmit"));
		LeadForm.click();
		//Title
		String Title=obj2.getTitle();
		System.out.println(Title);
		//obj2.close();	
			
		}}

	

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Implicit Timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Accepting Cookies
		WebElement Cookies = driver.findElement(By.xpath("//button [@title='Only allow essential cookies']"));
		Cookies.click();
		//Create Account
		WebElement Account= driver.findElement(By.linkText("Create New Account"));
		Account.click();
		//Entering the Personal Information in Textbox
		WebElement name = driver.findElement(By.xpath("//input [@name='firstname']"));
		name.sendKeys("Ramya");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("Rajalingam");
		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("ramyaajaykumar2010@gmail.com");
		WebElement Reentermail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		Reentermail.sendKeys("ramyaajaykumar2010@gmail.com");
		WebElement Password = driver.findElement(By.id("password_step_input"));
		Password.sendKeys("Abcd@1234");
		//Selecting from Dropdown (Creating obj for select class-VisibleText)
		WebElement dayelement = driver.findElement(By.id("day"));
		Select dayele=new Select(dayelement);
		dayele.selectByVisibleText("26");
		//Selecting Month from Dropdown-selectby value
		WebElement monthelement = driver.findElement(By.id("month"));
		Select month=new Select(monthelement);
		month.selectByValue("9");
		//Selecting Year -
		WebElement Year = driver.findElement(By.id("year"));
		Select Birthyear=new Select(Year);
		Birthyear.selectByValue("1985");
		//Selecting the Radio Button
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Female']"));
		Gender.click();
		WebElement Signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		Signup.click();
		
		
		
		
		
		
		
		
		
		
	}

}

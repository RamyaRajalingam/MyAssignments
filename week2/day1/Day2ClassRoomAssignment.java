package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2ClassRoomAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Obj=new  ChromeDriver();
		Obj.get("https://www.facebook.com/");
		Obj.manage().window().maximize();
		Obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Account= Obj.findElement(By.linkText("Create New Account"));
		Account.click();
		
	Obj.findElement(By.name("firstname")).sendKeys("Ramya");
	Obj.findElement(By.name("lastname")).sendKeys("Raja");
		
	}
	
//WebElement elementname=obj2.findElement(By.id("username"));

}

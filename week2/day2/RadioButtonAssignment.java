package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Favourite Browser
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		//Unselectable
			driver.findElement(By.xpath("//label[text()='Chennai']")).click();
				
		//Find the default select radio button			
			if(driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).isSelected())
				{
				System.out.println("Default-Chrome is autoselected");
				}
			else if (driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).isSelected())
				{
				System.out.println("Default-Firefox selected");
				}
			else if(driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label")).isSelected())
				{
				System.out.println("Default-Safari Selected");
				}
			else if(driver.findElement(By.xpath("//label[@for='j_idt87:console2:3']")).isSelected())
			{
				System.out.println("Default-Edge Selected");
			}
			else
				{
				System.out.println("None is selected in default");		
				}
		//Select the age group
			if(driver.findElement(By.xpath("//label[text()='1-20 Years']")).isSelected())
			{
				System.out.println("1-20 yrs age selected already");
				
			}
			else if(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected())
			{
				System.out.println("21-40 yrs age selected already");
				
			}
			else if (driver.findElement(By.xpath("//label[text()='41-60 Years']")).isSelected())
			{
				System.out.println("41-60 yrs age selected already");
				
			}
		
			else 
			{
				WebElement SelectAge = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
				Thread.sleep(2000);
				SelectAge.click();
				System.out.println("Selected the age using script");
			}
	}}



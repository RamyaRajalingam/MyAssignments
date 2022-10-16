package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class SelectFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj=new ChromeDriver();		
		obj.get("https://www.leafground.com/select.xhtml");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Select Tool from Dropdown
		WebElement tool = obj.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tvalue=new Select(tool);
		tvalue.selectByIndex(1);
		//Selecting Country
		WebElement Country = obj.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']"));
		Country.click();
		obj.findElement(By.xpath("//li[text()='India']")).click();
		//Cities
		WebElement Cities = obj.findElement(By.xpath("//*[@id=\"j_idt87:city\"]/div[3]/span"));
		Thread.sleep(2000);
		Cities.click();
		String City1 =obj.findElement(By.xpath("//li[text()='Bengaluru']")).getText();
		String City2=obj.findElement(By.xpath("//li[text()='Chennai']")).getText();
		String City3=obj.findElement(By.xpath("//li[text()='Delhi']")).getText();
		if( City1.contains("Beng") && City2.contains("Chen") && City3.contains("Del"))
		{
		System.out.println("Verified");
		}
		//Course Selection
		WebElement CourseDropDown = obj.findElement(By.xpath("//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')])[2]"));
		CourseDropDown.click();
		WebElement Course = obj.findElement(By.xpath("//li[text()='Selenium WebDriver']"));
		Course.click();
		//Language Selection
		obj.findElement(By.xpath("//*[@id=\"j_idt87:lang\"]/div[3]/span")).click();
		WebElement Lang = obj.findElement(By.xpath("//*[@id=\"j_idt87:lang_2\"]"));
		Lang.click();
		//Select Two
		obj.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		WebElement Selecttwo = obj.findElement(By.xpath("//li[text()='Tamil']"));
		Selecttwo.click();
			}

}

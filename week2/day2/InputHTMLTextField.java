package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputHTMLTextField {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Type Name
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
		name.sendKeys("RamyaRa");
		//City
		WebElement city = driver.findElement(By.xpath("//input[@value='Chennai']"));
		city.sendKeys("Salem");
		//Verify Text Box is disabled
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled());
		//Clear the Typed Text
		WebElement Clear = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
		Clear.clear();
		//Retrieve the text
		WebElement Retrieve = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String Txt =driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).getAttribute("value");
		Retrieve.toString().concat(Txt);
		//Enter Email
		WebElement Email = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		Email.sendKeys("ramyar@gmail.com");
		Thread.sleep(2000);
		Email.sendKeys(Keys.TAB);
		//Text Area
		WebElement TextArea = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
		TextArea.sendKeys("Good");
		Thread.sleep(2000);
		//Text Editor
		WebElement Editor = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		Editor.sendKeys("Climate is Cool");
		//Error Message
		WebElement Errormsg = driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']"));
		Errormsg.sendKeys(Keys.ENTER);
		String Msg= driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		if(Msg.contains("Age")) {
			System.out.println("Error Message Verified");
		}
		else
			System.out.println("Not Verified");
		//Click and Confirm label Position
		WebElement Position= driver.findElement(By.xpath("//input[@name='j_idt106:float-input']"));
		Position.click();
		Point Location=Position.getLocation();
		System.out.println("Position X Y - Coordinates" +Location);
		//Type name and Choose third option
		WebElement TypeTxt = driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']"));
		TypeTxt.sendKeys("RamyaRa");
		
	}

}

package SmithaTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BO {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ipphaptest02/BOE/BI");
		
		Thread.sleep(1000);
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe[name='servletBridgeIframe']"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(iframe);
		
		//To click on System text box
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:CMS']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:CMS']")).sendKeys("IPPHAPTEST02:6400");
		
		//To click on Username text box		
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:USERNAME']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:USERNAME']")).sendKeys("ss043599");
		
		//To click on Password textbox
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:PASSWORD']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:PASSWORD']")).sendKeys("Cerner");
		driver.findElement(By.xpath("//div[@class='logonButton']/input[@id='_id0:logon:logonButton']")).click();
	}

}

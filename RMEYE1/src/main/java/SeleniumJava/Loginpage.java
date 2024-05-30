package SeleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.140.121/login");
		String txtcolor=driver.findElement(By.xpath("//div[@class='loginContent']/h2")).getCssValue("color");
		String c=Color.fromString(txtcolor).asHex();
	    System.out.println("Color is :" + txtcolor);
	    System.out.println("Hex code for color:" + c);
	   
	    System.out.println(driver.findElement(By.className("copyWrite-text")).getText());
	    //driver.findElement(By.className("copywrite-text")).getText();
	    Assert.assertEquals(driver.findElement(By.className("copyWrite-text")).getText(),"© 2023 Rugged Monitoring, inc. All rights reserved. | Privacy" );
	    
	    
	      
		driver.findElement(By.className("inputField")).sendKeys("smangali@ruggedmonitoring.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("test");
		driver.findElement(By.className("FromBtn")).click();
		Thread.sleep(5000);
		
//		driver.get("http://192.168.140.121/monitor/transformer/allAssetModel2?id=17");
//		System.out.println(driver.findElement(By.xpath("//tbody/tr[4]/td[contains(@class,'cdk-column-age')]/span")).getText());
//		Assert.assertEquals(driver.findElement(By.xpath("//tbody/tr[4]/td[contains(@class,'cdk-column-age')]/span")).getText(),"10.42" );
		Thread.sleep(4000);
	
		driver.quit();
		System.out.println(driver);
	}

}

package SeleniumJava;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.140.121/login");
		
		driver.findElement(By.className("inputField")).sendKeys("smangali@ruggedmonitoring.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("test");
		driver.findElement(By.className("FromBtn")).click();
		Thread.sleep(2000);
		
		driver.get("http://192.168.140.121/admin");
		driver.findElement(By.xpath("//cdk-accordion/cdk-accordion-item[7]/div/div[@class='navLink']")).click();
		driver.findElement(By.xpath("//div/div/div/button[@mattooltip='Click to Add New User']")).click();
	
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[2]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[2]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[2]/mat-label")).getText(), "First Name");
		driver.findElement(By.xpath("//div/input[@placeholder='Enter First Name']")).sendKeys("Mangali");
		
		//Assert.assertEquals(driver.findElement(By.xpath("//div/input[@placeholder='Enter First Name']")).sendKeys("Mangali"), "Mangali");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[3]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[3]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[3]/mat-label")).getText(), "Last Name");
		driver.findElement(By.xpath("//div/input[@placeholder='Enter Last Name']")).sendKeys("Saikumar");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[4]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[4]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[4]/mat-label")).getText(), "Email");
		driver.findElement(By.xpath("//div/input[@placeholder='Enter Email']")).sendKeys("sai9691@gmail.com");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[5]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[5]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[5]/mat-label")).getText(), "Phone Number");
		driver.findElement(By.xpath("//mat-select[@formcontrolname='country']/div/div[2]")).click();
		driver.findElement(By.xpath("//mat-option/span[text()=' India  ']")).click();
		driver.findElement(By.xpath("//div/input[@placeholder='Enter Phone Number']")).sendKeys("8184931077");
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[6]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[6]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[6]/mat-label")).getText(), "System Role");
		driver.findElement(By.xpath("//mat-select[@formcontrolname='rolesId']/div/div[2]")).click();
		driver.findElement(By.xpath("//mat-option/span[text()=' Administrator ']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[7]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[7]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[7]/mat-label")).getText(), "Function");
		driver.findElement(By.xpath("//mat-select[@formcontrolname='functionId']/div/div[2]")).click();
		driver.findElement(By.xpath("//mat-option/span[text()=' Enterprise ']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[8]/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[8]/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[8]/mat-label")).getText(), "Job Role");
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobRoleId']/div/div[2]")).click();
		driver.findElement(By.xpath("//mat-option/span[text()=' Enterprise User ']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[9]/mat-label")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[9]/mat-label")).getText(), "Company");

		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[10]/div/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[10]/div/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[10]/div/mat-label")).getText(), "Manufacturing Site");
		driver.findElement(By.xpath("//mat-label[text()='Manufacturing Site']/following-sibling::*")).click();
		driver.findElement(By.xpath("//mat-option/span[text()=' All ']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[11]/div/mat-label")).getText());
		driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[11]/div/mat-label")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='singal-ColLayout']/div[11]/div/mat-label")).getText(), "Process/Plant Area");
		driver.findElement(By.xpath("//mat-label[text()='Process/Plant Area']/following-sibling::*")).click();
		
		driver.findElement(By.xpath("//mat-option[1]")).click();
		driver.findElement(By.xpath("//label[text()='Inactive']")).click();
		driver.findElement(By.xpath("//mat-label/following-sibling::a")).click();
		driver.findElement(By.xpath("//mat-card-actions/div/button[2]")).click();
		Thread.sleep(5000);
		driver.quit();
		System.out.println(driver);
		//mat-label[text()='Status']/following-sibling::*/div/input[@id=1]
	}

}

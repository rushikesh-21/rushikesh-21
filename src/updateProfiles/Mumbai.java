package updateProfiles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mumbai {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(6000);
		
		//usernameField
		driver.findElement(By.id("usernameField")).sendKeys("rushikesh.sadavarte2000@gmail.com ");
		
		//passwordfield
		driver.findElement(By.id("passwordField")).sendKeys("Rushikesh@2105");
		
		//loginButton
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
	
		driver.findElement(By.className("nI-gNb-icon-img")).click();
		Thread.sleep(2000);
		
		//updateProfile button
		driver.findElement(By.xpath("//a[@class=\"nI-gNb-info__sub-link\"]")).click();
		Thread.sleep(3000);
		
		//resumesection
		//delete button
		driver.findElement(By.xpath("//i[text()=\"deleteOneTheme\"]")).click();
		

		WebElement deletebutton=driver.findElement(By.xpath("(//button[text()='Delete'])[2]"));
		deletebutton.click();
		
		Thread.sleep(3000);
	
		//upload resume 
		driver.findElement(By.cssSelector("input#attachCV")).sendKeys("D:\\desktop files\\MY RESUMES\\MUMBAI\\Rushikesh K Sadavarte Resume.pdf");
		Thread.sleep(4000);
		
		//scrolling
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//edit
		driver.findElement(By.xpath("(//span[text()='editOneTheme'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[text()=\"editOneTheme\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		System.out.println("Profile Updated Successfully");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

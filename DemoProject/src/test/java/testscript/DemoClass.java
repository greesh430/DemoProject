package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoClass extends Base{
	
	@Test(priority=1)
	
	public void Login() {
		String username="admin";
		String password="admin";	
		
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		WebElement signinButton=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signinButton.click();
		
	}
	
	@Test
	public void incorrectUserCorrectPassword() {
		
		String username="abc";
		String password="admin";
		
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		WebElement signinButton=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signinButton.click();		
		
	}
	
	@Test
	public void correctUserIncorrectPassword() {
		
		String username="admin";
		String password="abc";		
		
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		WebElement signinButton=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signinButton.click();
		
	}
	
	@Test
	public void incorrectUserIncorrectPassword() {
		
		String username="abc";
		String password="abc";
		
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		WebElement signinButton=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signinButton.click();
	}

}

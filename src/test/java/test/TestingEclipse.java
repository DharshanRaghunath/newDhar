package test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingEclipse {
public static void main(String[] args) {
	// set up the browser
	WebDriverManager.chromedriver().setup();
	// instantiate the browser 
	WebDriver driver = new ChromeDriver();
	// pass the main url
	driver.get("http://localhost:8888/");
	// finding the username textfield and pass the input
	driver.findElement(By.name("user_name")).sendKeys("admin");
	// finding the password textfield and pass the input
	driver.findElement(By.name("user_password")).sendKeys("admin");
	// finding the sign in button and clicking on it
	driver.findElement(By.id("submitButton")).click();
	
}
}

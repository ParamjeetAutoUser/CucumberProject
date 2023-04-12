package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on Login Page");
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeoptions);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step2: Enter username and password");
		driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	   
	}

	@When("user clciks on login button")
	public void user_clciks_on_login_button() {
		System.out.println("Step3: click on Login button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();   
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step4: User lands on Home page");
	    driver.close();
	}

	
}

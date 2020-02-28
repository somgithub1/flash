package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
//	WebDriver driver;
//for opening Browser
	public static WebDriver startBrowser () {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101/");
		
		
	return driver;
		
}}

package com.shikhai.shikhaiApp.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");

	}

	public static WebDriver driver = new ChromeDriver();

	@Test
	public void DriverTest() {
		System.out.println("Driver Executed");
	}

	private DriverManager() {

	}

}

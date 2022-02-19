package com.shikhai.shikhaiApp.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.shikhai.shikhaiApp.Utils.DriverManager;
import com.shikhai.shikhaiApp.Utils.LocatorUtils;
import com.shikhai.shikhaiApp.Utils.UrlTextUtils;

public class JoinAsModerator {

	private WebDriver driver = null;

	@Test
	public void ModeratorJoin() {
		driver = DriverManager.driver;
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
	    driver = new ChromeDriver(options);
	    
		driver.get(UrlTextUtils.URL.JoinAsModerator_URL);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement microphone = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(LocatorUtils.ModeratorView.Join_Microphone)));
		microphone.click();		       
		WebElement echoUP = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(LocatorUtils.ModeratorView.Echo_ThumsUP)));
		echoUP.click();

		System.out.println("Moderator Has Started Session");
	}
}

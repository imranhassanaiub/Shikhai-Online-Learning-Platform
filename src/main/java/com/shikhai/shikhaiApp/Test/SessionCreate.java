package com.shikhai.shikhaiApp.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.shikhai.shikhaiApp.Utils.DriverManager;
import com.shikhai.shikhaiApp.Utils.GenerateCheckSum;
import com.shikhai.shikhaiApp.Utils.UrlTextUtils;


public class SessionCreate {

	private WebDriver driver =null;
	
	@Test
	public void sessionCreate()
	{
		driver = DriverManager.driver;
		String QuerycheckSum=GenerateCheckSum.getCheckSumParameterForQuery("create", UrlTextUtils.TEXT.CreateParams, UrlTextUtils.TEXT.APISalt);
		driver.get(UrlTextUtils.URL.SessionCreate_URL+UrlTextUtils.TEXT.CreateParams+QuerycheckSum);
	}
}

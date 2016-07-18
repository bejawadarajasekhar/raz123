package com.raz.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.concurrent.*;
public class TestZimbra {
  @Test
  public void testingZimbra() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://mapi.miraclesoft.com");
	  driver.findElement(By.id("username")).sendKeys("rrandhi@miraclesoft.com");
	 
	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	  driver.findElement(By.id("password")).sendKeys("Jana.5428");
	  
	 
	  driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
	//  driver.findElement(By.id("zb__NEW_MENU_title")).click();
driver.findElement(By.xpath(".//*[@id='zb__App__Mail_title']")).click();
driver.findElement(By.xpath(".//*[@id='zb__NEW_MENU_dropdown']/div")).click();
driver.findElement(By.xpath(".//*[@id='zb__NEW_MENU_NEW_MESSAGE_title']")).click();

//driver.findElement(By.xpath(".//*[@id='zb__App__Options_title']")).click();
//driver.findElement(By.className("ZWidgetTitle")).click();
//Select dropdown = new Select(driver.findElement(By.id("zb__NEW_MENU_dropdown")));
//dropdown.selectByVisibleText("Message");
	// driver.close();
//driver.quit();
	 
  }

}

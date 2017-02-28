package com.org.automation;
import java.lang.reflect.Array;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class players_page {
	

	public void waitforwhile(long time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void check(WebDriver driver1,int j)
	{
		
       start obj1=new start();
	   String[][] arr=obj1.initialize("values_players",9);
		
	List<WebElement> elements=driver1.findElements(By.className("fc-player-statsspace-fo-filtered"));
		
		int i=0;
			
		for(WebElement elem:elements)
			{
				
				String str=elem.getAttribute("textContent");
				
				if(str.equals(arr[j][i]))
				{
					System.out.println("correct");
					
			    }
				else
					System.out.println("not correct");
				
				i++;
         	}
	}
	
	
	
	
	
	public void players(WebDriver driver) {
			
			
			WebElement list2=driver.findElement(By.id("fc-insights-tab-pla"));
			list2.click();
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("fc-player-statsspace-fo-filtered")));
		
			players_page obj=new players_page();
					
		String[] names=new String[]{"Chris Gayle","Virender Sehwag","sachin tendulkar","donald bradman"};
					for(int i=0;i<names.length;i++)
					{
						
						WebElement list3=driver.findElement(By.className("fc-graph-search-input"));
						list3.clear();
						list3.sendKeys(names[i]);
				WebDriverWait wait3 = new WebDriverWait(driver, 20);
				wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("fc-graph-search-results")));
					
					WebElement result= driver.findElement(By.className("fc-graph-search-result"));
					obj.waitforwhile(3000);
					result.click();
					obj.waitforwhile(3000);
					obj.check(driver,i);
					}
					obj.waitforwhile(10000);
   
    System.out.println("Successfully opened the website www.Store.Demoqa.com");

	
	
    // Close the driver
    driver.quit();

}
	}
	





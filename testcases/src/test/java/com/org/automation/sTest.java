package com.org.automation;



import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class sTest {
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/abhujeeth/Downloads/chromedriver");
		driver =new ChromeDriver();
	
    
	    driver.get("http://analytics05.cricket.net/cricinfo/player_insight/");
	
			WebElement list2=driver.findElement(By.id("fc-record-format"));
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("fc-record-format")));
			
					sTest obj=new sTest();
					obj.clicking(list2,driver);
					driver.navigate().refresh();
					
					players_page obj1=new players_page();
					obj1.players(driver);
			
			
		      
					try {
							Thread.sleep(100000);
						} 
					catch (InterruptedException e) {
		
						e.printStackTrace();
					}
   
    System.out.println("Successfully opened the website www.Store.Demoqa.com");

	
	
    // Close the driver
    driver.quit();

}
	
	
	public void waiting(WebDriver driver2,String class_name)
	{

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver2)    
			    .withTimeout(5, TimeUnit.SECONDS);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(class_name)));
	}
	
	
	public String repeat(WebElement obj,String temp,WebDriver driver)
	{
		
		
		
		String check1 = null;
		for(int i=0;i<5;i++)
		{
			if(obj.isDisplayed())
			{
	check1=obj.getAttribute("textContent");
			
		if(!check1.equals(temp))
			{
			
			return check1;
			}
		else
		{
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
			}
		return temp;
	}
	int count1=0;int check_count=0;
	HashMap<String,String> hm1=new HashMap<String,String>();String check ;
	
	public void check_all_menus(WebDriver driver1,String str,String format)
	{
			int m=0;int previous=6;int count=0;String submenu;String temp_check = null;
			
    		List<WebElement> list5=driver1.findElements(By.className(str));//takes all the values like team,batting
    		
    		for(WebElement elem:list5)//team,batting
    		{
    			count++;
    			
    			
    			if(count==9)
    			{
    				
    				break;
    			}
    				
    			String record_format=list5.get(count-1).getAttribute("textContent");
    			
    			//click on team ,batting,etc
    			elem.click();
    			
        		List<WebElement> list4=driver1.findElements(By.className("fc-select-list-value"));//takes values inside team,batting,etc like mostwins
        		
        		
        		int c=0;
        		for(WebElement option:list4)//iterates through most wins,highest score
        		{
        			List<WebElement> list6=driver1.findElements(By.className("fc-select-list-value"));//takes values inside team,batting,etc like mostwins
        			
        			for(WebElement option3:list6)
        			{
        				if(c<previous)
        			 {	
        				c++;
        				break;
        				}
        				else
        				{
        				
        				 submenu=list6.get(c).getAttribute("textContent");//mostwins,etc.	
        				 list6.get(c).click();//comes to the main data page of mostwins ,highest total where scores are displayed
        				
        				 try {
     						Thread.sleep(5000);
     					} catch (InterruptedException e) {
     						// TODO Auto-generated catch block
     						e.printStackTrace();
     					}
        				try
        				{
        					  
        				waiting(driver1,"rec-hor-bar-label");
        				//get the data from the page displayed
        				WebElement obj=driver1.findElement(By.className("rec-hor-bar-label"));
        				if(obj.isDisplayed())
        				{
        		           String check1=obj.getAttribute("textContent");
        			
        				
        			         if(check_count!=0)
        			     {
        				      if (check1.equals(temp_check))
        						{
        				    	    
        					         check1=repeat(obj,temp_check,driver1);
        						}//get the data from the page displayed
        			     }
        			
        			check=check1;
        			
        				
        				}
        				}
        				catch(Exception e)
        				{
        				
        					try
        					{
        					
        					WebElement list9=driver1.findElement(By.className("rec-hor-multi-bar-label"));
            				if(list9.isDisplayed())
            				{
            					String check2=list9.getAttribute("textContent");
            					if(check_count!=0)
                    			{
                    				if (check2.equals(temp_check))
                    					{
                    					
                    					check2=repeat(list9,temp_check,driver1);
                    					}
                    			}
            					
            					check=check2;
            					
            					
            				}
            			}
        					catch(Exception e1)
        					{
        					
        						try
        						{
        						
            					WebElement list8=driver1.findElement(By.className("rec-ver-multi-bar-label"));
                				if(list8.isDisplayed())
                				{
                					String check3=list8.getAttribute("textContent");
                					if(check_count!=0)
                        			{
                        				if (check3.equals(temp_check))
                        					{
                        					
                        					check3=repeat(list8,temp_check,driver1);
                        					}
                        			}
                					check=check3;
                					
                					
                					
                				
                		
                				}
        						}
                				catch(Exception e2)
        						{
                				
        						System.out.println(e1.getMessage());
        						}
        					}
        				}        				
        				
        				String key;
        				key=format+record_format+submenu;
        				System.out.println(key);
        				System.out.println("Expected Value="+ check);
        				temp_check=check;
        				check_count++;
        				temp obj=new temp();
        				
        				String ans=obj.hash_mapsubmenu(hm1,key,count1);
        				System.out.println(ans);
        				count1++;
        				if(ans.equals("null"))
        				{
        					System.out.println("Consider CORRECT---no data on the page");
        				}
        				else if(check.contains(","))
        				{
        					String front_check=check.substring(0, check.indexOf(','));
        					String back_check=check.substring(check.indexOf(',')+1);
        					String new_check=front_check+back_check;
        					if(new_check.equals(ans))
        					{
        						System.out.println("correct");
        					}
        					else
        						System.out.println("not correct");
        				}
        				
        				else
        				{
        					
        					if(check.equals(ans))
        				System.out.println("correct");
        				else 
        					System.out.println("not correct");
        				}	
        	         
        				c++;
        				list6.clear();
        				
        				if(c!=list6.size())
        				elem.click();
        				
        				break;
        				}
        				
        			
        				
        				
        			}	
        			
    		
        		}
        		previous=list4.size();
        		
    		}
	}
	
	

	public void clicking(WebElement obj,WebDriver driver1)
	{
			int k=0;
			obj.click();
    		WebDriverWait wait = new WebDriverWait(driver1, 30);
    		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("fc-select-list-value")));
    		List<WebElement> list1=driver1.findElements(By.className("fc-select-list-value"));
    		
    		try{
    			
			
    		for(WebElement option:list1)
    		{	
    			//takes odis,ipl,etc
    			List<WebElement> list2=driver1.findElements(By.className("fc-select-list-value"));
    			for(WebElement option3:list2)
    			{
    				
    				String str=list2.get(k).getText();
    				list2.get(k).click();
    
    				temp.start_now(driver1,str);
    				check_all_menus(driver1,"fc-player-performance-filter",str);
    		         k++;
    				list2.clear();
    			
    				driver1.navigate().refresh();
    			
    				
    				WebDriverWait wait2 = new WebDriverWait(driver1, 30);
    	    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fc-record-format")));
    				WebElement list3=driver1.findElement(By.id("fc-record-format"));
    				
    				
    				list3.click();
    				
    				break;
    			}
    		}
    			
    		
	}
    				catch(StaleElementReferenceException e) {
    		              e.toString();
    		        System.out.println("Trying to recover from a stale element :" + e.getMessage());
    			} 
    		
    		
    		
    		
	
	}	
    		


	
	
	}
	




	



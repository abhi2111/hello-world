package com.org.automation;

import java.util.ArrayList;
import java.util.HashMap;
//http://stackoverflow.com/questions/18225997/stale-element-reference-element-is-not-attached-to-the-page-document
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class temp {
	
	int count=0;
	
	public String hash_mapsubmenu(HashMap<String, String> hm1,String find,int count)
	{
		String keys,found;
		
		if(count==0)
		{
		
		String[] arr =new String[]{"ODIs","World Cup","T20Is","WT20s","T20s","IPL"};
		String[] menus=new String[]{"TEAM","BATTING","BOWLING","ALL-ROUND","PARTNERSHIPS","FIELDING","WICKETKEEPING","OTHER RECORDS"};
		String[] teams=new String[]{"Most Wins","Tied Matches","Highest Total","Lowest Total","Highest Match Aggregates","Lowest Match Aggregates",
				"Largest Wins (Runs)","Largest Wins (Wickets)","Largest Wins (Balls Remaining)","Smallest Wins (Runs)","Smallest Wins (Wickets)","Smallest Wins (Balls Remaining)",
				"Most Consecutive Wins","Most Consecutive Losses","Consecutive Matches Without Losses","Consecutive Matches Without Wins"};
		
		String[] Batting=new String[]{"Most Runs (Innings)","Most Runs (Career)","Highest Average","Highest Strike Rate (Innings)",
				"Highest Strike Rate (Career)","Most Centuries","Most Fifty-plus Scores","Most Ducks","Fastest 100s","Slowest 100s","Fastest 50s","Slowest 50s","Most Boundaries","Most Boundary Runs",
				"Highest SR - 100+ inns","Highest SR - 50+ inns"};
		
		String[] Bowling=new String[]{"Most Wickets (Innings)","Most Wickets (Career)","Best Economy (Innings)","Worst Economy (Innings)","Best Economy (Career)","Worst Economy (Career)","Best Average (Career)","Worst Average (Career)","Best Strike Rate",
				"Worst Strike Rate","Most 5-fors","Hat-tricks","Most Runs Conceded","Least Runs Conceded","Most Maidens (Innings)","Most Boundaries Conceded","Most Boundary Runs Conceded"};
		String[] allround=new String[]{"100 and 5-for","50 and 5-for","100 and 4-dis","50 and 3-for","30 and 5-for"};
		String[] partnerships=new String[]{"Top Partnership Runs","Top Partnerships","Most Century Stands","Most Fifty-plus Stands"};
		String[] fielding=new String[]{"Most Catches (Career)","Most Catches (Match)"};
		String[] wicketkeeping=new String[]{"Most Dismissals (Career)","Most Dismissals (Match)"};
		String[] other_records=new String[]{"Most Matches Played","Most Matches As Captain","Most Matches As Umpire","Most World Cup Appearances",
				"Most Awards (Man of the Series)","Most Awards (Man of the Match)","Most Awards (Purple Caps)","Most Awards (Orange Caps)"
				};


	start obj=new start();						
		

String[][] values_team=obj.initialize("values_team",16);

String[][] values_batting=obj.initialize("values_batting",16);

String[][] values_bowling=obj.initialize("values_bowling",17);
String[][] values_allrounder=obj.initialize("values_allrounder",5);

String[][] values_partnerships=obj.initialize("values_partnerships",4);
String[][] values_fieldings=obj.initialize("values_fieldings",2);
String[][] values_wicketkeeping=obj.initialize("values_wicketkeeping",2);
String[][] values_other_records=obj.initialize("values_other_records",8);
	



	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<teams.length;k++)
			{
				keys=arr[i]+menus[j]+teams[k];
				
				hm1.put(keys,values_team[i][k]);
			}
		}
	}
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<Batting.length;k++)
			{
				keys=arr[i]+menus[j]+Batting[k];
				hm1.put(keys,values_batting[i][k]);
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<Bowling.length;k++)
			{
				keys=arr[i]+menus[j]+Bowling[k];
				hm1.put(keys,values_bowling[i][k]);
			}
		}
	}
	
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<allround.length;k++)
			{
				keys=arr[i]+menus[j]+allround[k];
				hm1.put(keys,values_allrounder[i][k]);
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<partnerships.length;k++)
			{
				keys=arr[i]+menus[j]+partnerships[k];
				hm1.put(keys,values_partnerships[i][k]);
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<fielding.length;k++)
			{
				keys=arr[i]+menus[j]+fielding[k];
				hm1.put(keys,values_fieldings[i][k]);
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<wicketkeeping.length;k++)
			{
				keys=arr[i]+menus[j]+wicketkeeping[k];
				hm1.put(keys,values_wicketkeeping[i][k]);
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<menus.length;j++)
		{
			for(int k=0;k<other_records.length;k++)
			{
				keys=arr[i]+menus[j]+other_records[k];
				hm1.put(keys,values_other_records[i][k]);
			}
		}
	}
	
	found=(hm1.get(find)).toString();
	
	
	return found;
	
	}
	else
		{found=(hm1.get(find)).toString();
	
	return found;
		}	
	
	}
	
	
	
	public String hashmap_impl(String find)
	{
		
		String str,key,found;
		HashMap<String,String> hm=new HashMap<String,String>();
		if(count==0)
		{
		String[] arr =new String[]{"ODIs","World Cup","T20Is","WT20s","T20s","IPL"};
		int[] index=new int[]{1,2,3,4,5,6,7,8};
		
		start obj1=new start();
		
		String[][] values=obj1.initialize("values_firstpage",8);
			
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<index.length;j++)
			{
				str=String.valueOf(j+1);
				key=arr[i]+str;
				hm.put(key, values[i][j]);
				
			}
		}
		found=(hm.get(find)).toString();
		
		count++;
		
		return found;
		}
		else
			found=(hm.get(find)).toString();
		//count++
		return found;
				
	}
	
		
	
	public void clicking(String format,int count,String str)
	{
		
		String convert=String.valueOf(count);
		String key=format+convert;
		System.out.println(key);
		String ans=hashmap_impl(key);
		System.out.println("ans="+ans);
		System.out.println("str="+str);
		if(ans.equals(str))
		{
			System.out.println("correct");
		}
		else 
			System.out.println("not correct");
	}

	
	public static void start_now(WebDriver driver,String format) {
	
		int count=0;
		
		List<WebElement> list2=driver.findElements(By.className("fc-records-home-tile-stat"));
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("fc-records-home-tile-stat")));
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//fake code to delay
			for(int i=0;i<100000000;i++)
			{
				//System.out.print("");
			}
			for (WebElement options : list2) 
				{
				
				  String str3= options.getAttribute("textContent");
				 
				if(str3.trim().length()==0)	
				{
					
					for(int i=0;i<3;i++)
					{
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(options.isDisplayed())
							break;
					}
					for(int j=0;j<3;j++)
					{
						
					str3=options.getAttribute("textContent");
					if(str3.trim().length()!=0)
						break;
					}
				}
				
					count++;
					temp obj=new temp();
				
					obj.clicking(format,count,str3);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					
					js.executeScript("document.getElementById('fc-records-home-tile').style.display='block';eClear(eGet('fc-record-chart'))");
				

		    }
	}
}
				
			
			
			
			
	
    
	
			
	

			
	
	




	



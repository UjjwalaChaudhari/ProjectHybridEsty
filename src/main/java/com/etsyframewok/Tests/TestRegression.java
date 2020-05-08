package com.etsyframewok.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Pages.HomePage;
import com.etsyframework.Pages.Signinpage;

public class TestRegression extends Base {
	
	@Test(enabled=false)
	public void Tc_02() 
		{
		
		Signinpage sign=PageFactory.initElements(Constants.driver,Signinpage.class);
		sign.clicksignin();
		sign.enteremailorphone("chaudhari.ujjvala@gmail.com");
		sign.enterpasswordTb("Abc@123");
		sign.Login();
		//Keyword.refreshPage();
		Keyword.scrollByDown();
		//Keyword.scrollByup();
		Assert.assertTrue(Constants.driver.getTitle().equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
	    System.out.println("Assert Passed-- "+Constants.driver.getTitle());
	    }

		@Test(enabled=true)
		public void Tc_03() throws InterruptedException 
		   {
			HomePage home=PageFactory.initElements(Constants.driver,HomePage.class);
			//Keyword.refreshPage();
			home.Homepage_jewaller();
			//Assert.assertTrue(Constants.driver.getTitle().equals("Purse Inserts | Etsy IN"));
		    //System.out.println("Assert Passed-- "+Constants.driver.getTitle());
		    home.Homepage_Free_delivery_Click();
		    home.Homepage_bag_Click();
		   //Keyword.scrollByDownpage();
		   //Thread.sleep(1000);
		   //Keyword.scrollByuppage();
		   home.scravesandwraps();
		   home.scravesandwraps_scraves();
		   }
		
		
}

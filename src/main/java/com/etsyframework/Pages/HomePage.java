package com.etsyframework.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;

public class HomePage {
		
	@FindBy(xpath="//span[@id='catnav-primary-link-10855']")
	private WebElement jewallary;
	
	//Free  delivery
	@FindBy(how=How.XPATH,using="//label[contains(text(),'FREE delivery')]")
	private WebElement freedeliveryclick;
	
	//Bag
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/div[3]/div[2]/div[2]/ul[2]/li[1]")
	private WebElement assoceries;
	
	
	//*[@id="content"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[2]/li[2]/div
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/div[3]/div[2]/div[2]/ul[2]/li[1]")
	private WebElement scraves;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/div[3]/div[2]/div[2]/ul[2]/li[1]")
	private WebElement scraves1;
	//--------------------------------------------
	@FindBy(css="#logo")
	public WebElement etsylogo;
	
	@FindBy(css="#desktop-category-nav>div>div>ul>li>a")
	public List<WebElement> homenavbar;
	//-----------------------------------------------
	
	//Homepage Jewellery And Accessories
	public void Homepage_jewaller() 
	{
		jewallary.click();
	}
	
	public void Homepage_Free_delivery_Click()
	{
		freedeliveryclick.click();
	}
	
	public void Homepage_bag_Click() 
	{
		assoceries.click();
	}
	
	public void scravesandwraps() 
	{
		scraves.click();
	}
	
	public void scravesandwraps_scraves()
	{
		scraves1.click();
	}
}

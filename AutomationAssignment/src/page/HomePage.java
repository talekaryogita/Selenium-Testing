package page;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/img[1]")
	List<WebElement> slider;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	List<WebElement> arrival;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival1;
	@FindBy(xpath="//button[contains(text(),'Add to basket')]")
	WebElement basket;
	@FindBy(xpath="//a[contains(text(),'Description')]")
	WebElement description;
	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	WebElement review;
	
	public HomePage()
	{
		init();
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickShop()
	{
		shop.click();
	}
	
	public void clickHome()
	{
		home.click();
	}
	
	public void checkSlider()
	{

	    System.out.println("Number of elements:" +slider.size());
	}
	
	public void checkArrival() {
		System.out.println("Number of elements:" +arrival.size());
		
	}
	public void clickArrival() {
		arrival1.click();
	
		
		
	}
	public void addToBasket() {
		basket.click();
		
	}
	
	public void clickDescription() {
		description.click();
		
	}
	public void checkDescription() {
		Boolean content = description.getText().contains("Product Description");
		assertTrue(content);
		
	}
	public void checkReview() {
		review.click();
	}
}

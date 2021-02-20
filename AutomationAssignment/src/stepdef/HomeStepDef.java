package stepdef;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStepDef {
	HomePage home;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		home=new HomePage();
	   
	}

	@When("user click on Shop Menu")
	public void user_click_on_shop_menu() {
		home.clickShop();
	   
	}
	@When("user click on Home menu button")
	public void user_click_on_home_menu_button() {
		home.clickHome();
	   
	}
	@Then("user is on home page and Home page has Three Sliders only")
	public void user_is_on_home_page_and_home_page_has_three_sliders_only() {
         home.checkSlider();
	
	   
	}
	


	@Then("Home page must contains only three Arrivals")
	public void home_page_must_contains_only_three_arrivals() {
		home.checkArrival();
		
	    
	}

	@When("click the image in the Arrivals")
	public void click_the_image_in_the_arrivals() {
		home.clickArrival();
	   
	}
	
	@Then("it is navigating to next page where the user can add that book into his basket")
	public void it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket() {
	    home.addToBasket();
	}


	@When("on Description tab")
	public void on_description_tab() {
		home.clickDescription();
	}
	@Then("There should be a description regarding that book")
	public void there_should_be_a_description_regarding_that_book() {
		home.checkDescription();
		
	    
	}


	@When("clock on Reviews tab for the book you clicked on.")
	public void clock_on_reviews_tab_for_the_book_you_clicked_on() {
		home.checkReview();

	    
	}
	@Then("There should be a Reviews regarding that book")
	public void there_should_be_a_reviews_regarding_that_book() {
		
	 

	}

}



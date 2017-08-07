package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;


//this class represent the Top250 Page
public class Top250_Page extends BasePage{
    
  public Top250_Page(WebDriver driver, WebDriverWait wait){
    
        super (driver, wait);
        PageFactory.initElements(driver, this);
    }
    
  
    	// Mapping fields in the page to Object of type WebElement 
        @FindBy(how = How.CSS, using = ".lister-sort-by")
        private WebElement sortlist;

        @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[1]")
        private WebElement sort_by_Ranking;
         
        @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[2]")     
        private WebElement sort_by_IMDb_Rating;
        
        @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[3]")
        private WebElement sort_by_Release_Date;
        
        @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[4]")
        private WebElement sort_by_number_of_ratings;
             
        @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[5]")
        private WebElement sort_by_your_Ratings;
        
        @FindBy(how = How.CSS, using = ".lister-list")
        private WebElement movies_list;
        
        
        //following are the actions, tht we will perform on the elements above
         public void click_on_sort_by(){
         waiting_for_visibility_of_element("cssSelector", ".lister-sort-by");    
         click_on_element(sortlist);
         }

         public void sort_by_Ranking(){
         waiting_for_visibility_of_element("xpath", ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[1]");    
         click_on_element(sort_by_Ranking);
    }
         
         public void sort_by_IMDb_Rating(){
         waiting_for_visibility_of_element("xpath", ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[2]");    
         click_on_element(sort_by_IMDb_Rating);
    }
      
         public void sort_by_Release_Date(){
         waiting_for_visibility_of_element("xpath", ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[3]");    
         click_on_element(sort_by_Release_Date);
    }
         
         public void sort_by_number_of_ratings(){
         waiting_for_visibility_of_element("xpath", ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[4]");    
         click_on_element(sort_by_number_of_ratings);
    } 
         
         public void sort_by_your_Ratings(){
         waiting_for_visibility_of_element("xpath", ".//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select/option[5]");    
         click_on_element(sort_by_your_Ratings);
    } 
         
    public List<WebElement> check_if_movies_list_return_at_least_one_movie(){
      waiting_for_visibility_of_element("cssSelector", ".lister-list"); 
      List<WebElement> movies_in_the_list = child_webelements_getter(movies_list, "cssSelector", ".titleColumn>a");

      return movies_in_the_list;

    }
         
}

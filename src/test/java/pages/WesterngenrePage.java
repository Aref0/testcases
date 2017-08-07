
package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//this class represents the Westerngenre Page
public class WesterngenrePage extends BasePage {
    
     public WesterngenrePage(WebDriver driver, WebDriverWait wait){
    
        super (driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Popularity")
    private WebElement popularity;

    @FindBy(how = How.CSS, using = ".alpha")
    private WebElement alphabetical;
    
    @FindBy(how = How.CSS, using = ".user_rating")
    private WebElement IMDb_Rating;

    @FindBy(how = How.CSS, using = ".num_votes")
    private WebElement number_of_Votes;
    
    @FindBy(how = How.CSS, using = ".boxoffice_gross_us")
    private WebElement US_Box_Office;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/div/div[2]/a[6]")
    private WebElement runtime;
    
    @FindBy(how = How.CSS, using = ".year")
    private WebElement year;
    
    @FindBy(how = How.CSS, using = ".release_date")
    private WebElement release_Date;
    
    @FindBy(how = How.CSS, using = ".lister-list")
    private WebElement western_movies_list;
    
    
    //following are the actions, that we will perform on the elements above
    public void sort_by_popularity(){
    waiting_for_visibility_of_element("linkText", "Popularity");
    click_on_element(popularity);
    }

    public void sort_by_alphabetical(){
    waiting_for_visibility_of_element("cssSelector", ".alpha");
    click_on_element(alphabetical);
    }
    
    public void sort_by_IMDb_Rating(){
    waiting_for_visibility_of_element("cssSelector", ".user_rating");
    click_on_element(IMDb_Rating);
    }
    
    public void sort_by_number_of_Votes(){
    waiting_for_visibility_of_element("cssSelector", ".num_votes");
    click_on_element(number_of_Votes);
    }
    
    public void sort_by_US_Box_Office(){
    waiting_for_visibility_of_element("cssSelector", ".boxoffice_gross_us");
    click_on_element(US_Box_Office);
    }
    
    public void sort_by_runtime(){
    waiting_for_visibility_of_element("XPATH", ".//*[@id='main']/div/div/div[2]/a[6]");
    click_on_element(runtime);
    }
    public void sort_by_year(){
    waiting_for_visibility_of_element("cssSelector", ".year");
    click_on_element(year);
    }
    
    public void sort_by_release_Date(){
    waiting_for_visibility_of_element("cssSelector", ".release_date");
    click_on_element(release_Date);
    }
    
    public List<WebElement> check_if_western_movies_list_return_at_least_one_movie(){
    waiting_for_visibility_of_element("cssSelector", ".lister-list");    
    List<WebElement> western_movies_in_the_list = child_webelements_getter(western_movies_list, "cssSelector", ".lister-item.mode-advanced");

     return western_movies_in_the_list;  
    }

}
    
    


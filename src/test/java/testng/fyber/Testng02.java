/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testng.fyber;

import config.Configuration;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WesterngenrePage;
import utilities.Driver;
import utilities.Driver_wait;

/**
 *
 * @author aref
 */

public class Testng02 extends Base_test {
   
   protected WesterngenrePage western_genere_page;
    
   @BeforeClass
   public static void Begin(){
   //go to the "Western​genre page" under the url: 
   //http://www.imdb.com/search/title?genres=western&sort=user_rating,desc&title_type=feature&num_votes=25000,&pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2406822102&pf_rd_r=1DQ91TNSPA9MK0BG5NN6&pf_rd_s=right-6&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_gnr_21"
   Log.info("***************************************************");
   Log.info("@BeforeClass: navigte to Western​genre page");
   Driver.driver.navigate().to(Configuration.Western_genre_page.Url);
   
   //the following commented code will navigate to the ​
   //Western​genre page via the Top 250 page, to save time we will go directly to the Url of c
   //since this page has no dependencies on the previous page (eg: no action needs to be followed up from
   //the top 250 page to the new loaded page "Western​genre page") 
   
   //Driver.driver.navigate().to(Configuration.Url.url);
   //Driver.driver.findElement(By.xpath(".//*[@id='sidebar']/div[6]/span/ul/li[21]/a")).click();
   Log.info("***************************************************");
   }
   
    @BeforeMethod
    public void setUp() {
    Log.info("***************************************************");
    Log.info("@BeforeMethod: instantiate the Western​genre page");    
    western_genere_page = new WesterngenrePage(Driver.driver, Driver_wait.wait);
    Log.info("***************************************************");
    }
    
     @Test
     public void sort_using_popularity(){ 
     movies_list.clear();
     Log.info("***************************************************");
     Log.info("@Test: sort_using_popularity");    
     western_genere_page.sort_by_popularity();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
    
     @Test
     public void sort_using_alphabetical(){
     movies_list.clear();
     Log.info("***************************************************");
     Log.info("@Test: sort_using_alphabetical");     
     western_genere_page.sort_by_alphabetical();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
     @Test
     public void sort_using_IMDb_Rating(){ 
     movies_list.clear();
     Log.info("***************************************************");
     Log.info("@Test: sort_using_IMDb_Rating");
     western_genere_page.sort_by_IMDb_Rating();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
     @Test
     public void sort_using_number_of_Votes(){ 
     movies_list.clear();    
     Log.info("***************************************************");
     Log.info("@Test: sort_using_number_of_Votes");
     western_genere_page.sort_by_number_of_Votes();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
     @Test
     public void sort_using_US_Box_Office(){
     movies_list.clear();    
     Log.info("***************************************************");
     Log.info("@Test: sort_using_US_Box_Office");   
     western_genere_page.sort_by_US_Box_Office();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
     @Test
     public void sort_using_runtime(){
     movies_list.clear();    
     Log.info("***************************************************");
     Log.info("@Test: sort_using_runtime");    
     western_genere_page.sort_by_runtime();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
     @Test
     public void sort_using_year(){ 
     movies_list.clear();    
     Log.info("***************************************************");
     Log.info("@Test: sort_using_year");
     western_genere_page.sort_by_year();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }
     @Test
     public void sort_using_release_Date(){
     movies_list.clear();    
     Log.info("***************************************************");
     Log.info("@Test: sort_using_release_Date");
     //boolean western_movies_list;    
     western_genere_page.sort_by_release_Date();
     // western_movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     movies_list = western_genere_page.check_if_western_movies_list_return_at_least_one_movie();
     assertTrue(movies_list.size() >= 1);
     Log.info("the page returned movies list that contains more than"
        + " one western movie and first movie in the list is: " +  movies_list.get(0).getText());
     Log.info("***************************************************");
    }

}

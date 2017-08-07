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
import pages.Top250_Page;
import utilities.Driver;
import utilities.Driver_wait;

public class Testng01 extends Base_test {
   
   protected Top250_Page top250_page;
   
   @BeforeClass
   public static void begin(){
   Log.info("***************************************************");
   Log.info("@BeforeClass: navigte to Top250 Page");   
   Driver.driver.navigate().to(Configuration.Top_250_Page.Url);
   Log.info("***************************************************");
   }
   
    @BeforeMethod
    public void setUp() {
        
        Log.info("***************************************************");
        Log.info("@BeforeMethod: instantiating Top250_Page");
        Log.info("***************************************************");
        top250_page = new Top250_Page(Driver.driver, Driver_wait.wait);

         }
 

    @Test
    public void return_movies_using_Ranking_sorting() {
        movies_list.clear();
        Log.info("***************************************************");
        Log.info("@Test: return_movies_using_Ranking_sorting");
        top250_page.click_on_sort_by();
        top250_page.sort_by_Ranking();
        movies_list = top250_page.check_if_movies_list_return_at_least_one_movie();
        assertTrue(movies_list.size() >= 1);
        Log.info("the page returned movies list that contains more than"
                + " one movie and first movie in the list is: " +  movies_list.get(0).getText());
        Log.info("***************************************************");
        }   
    
     @Test
    public void return_movies_using_IMDb_Rating() {
        movies_list.clear();
        Log.info("***************************************************");
        Log.info("@Test: return_movies_using_IMDb_Rating");
        top250_page.click_on_sort_by();
        top250_page.sort_by_IMDb_Rating();
        movies_list = top250_page.check_if_movies_list_return_at_least_one_movie();
        assertTrue(movies_list.size() >= 1);
        Log.info("the page returned movies list that contains more than"
        + " one movie and first movie in the list is: " +  movies_list.get(0).getText());
        Log.info("***************************************************");
       
        }   

    @Test
    public void return_movies_using_Release_Date() {
        movies_list.clear();
        Log.info("***************************************************");
        Log.info("@Test: return_movies_using_Release_Date");
        top250_page.click_on_sort_by();
        top250_page.sort_by_Release_Date();
        movies_list = top250_page.check_if_movies_list_return_at_least_one_movie();
        assertTrue(movies_list.size() >= 1);
        Log.info("the page returned movies list that contains more than"
        + " one movie and first movie in the list is: " +  movies_list.get(0).getText());
        Log.info("***************************************************");
        
       
        }
    
      @Test
    public void return_movies_using_number_of_ratings() {
        movies_list.clear();
        Log.info("***************************************************");
        Log.info("@Test: return_movies_using_number_of_ratings");
        top250_page.click_on_sort_by();
        top250_page.sort_by_number_of_ratings();
        movies_list = top250_page.check_if_movies_list_return_at_least_one_movie();
        assertTrue(movies_list.size() >= 1);
        Log.info("the page returned movies list that contains more than"
        + " one movie and first movie in the list is: " +  movies_list.get(0).getText());
        Log.info("***************************************************");
        
       
        }
    
      @Test
    public void return_movies_using_your_Ratings() {
        movies_list.clear();
        Log.info("***************************************************");
        Log.info("@Test: return_movies_using_your_Ratings");
        top250_page.click_on_sort_by();
        top250_page.sort_by_your_Ratings();
        movies_list = top250_page.check_if_movies_list_return_at_least_one_movie();
        assertTrue(movies_list.size() >= 1);
        Log.info("the page returned movies list that contains more than"
        + " one movie and first movie in the list is: " +  movies_list.get(0).getText());
        Log.info("***************************************************");
        
       
        }
    
}


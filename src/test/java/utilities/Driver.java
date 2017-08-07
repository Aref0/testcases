
package utilities;

import config.Configuration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Driver {
    
    public static WebDriver driver = null;
    
    public static void Initialize(){
        
      if (driver == null){
          
       if (Configuration.Browser.browser.equalsIgnoreCase("Firefox")){

        // Setting up path to geckodriver, please set the path according to your environment
        //you can set the path in The "Configuration class"
        System.setProperty("webdriver.gecko.driver", Configuration.Set_path_to_geckodriver.geckodriver);
        FirefoxProfile profile = new FirefoxProfile(); 
        profile.setPreference("security.insecure_field_warning.contextual.enabled", false);
        profile.setPreference("security.insecure_password.ui.enabled", false);
        driver = new FirefoxDriver();
           
       }   
       
       else if (Configuration.Browser.browser.equalsIgnoreCase("Chrome")){
           
       System.setProperty("webdriver.chrome.driver", Configuration.Set_path_to_Chromedriver.Set_path_to_Chromedriver);

       driver = new ChromeDriver();

       }
         }
      
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      
      } 
  
        public static void quit(){
    
       driver.quit();
       driver = null;
       
        }
        
        public static void close(){
    
       driver.close();
       driver = null;
       
    }

    }
       
        
   
   
    
    



package utilities;

import config.Configuration;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Driver_wait {
    
    public static WebDriverWait wait;
    
    public static void Driver_wait_setup (){
    //setup Webriver Wait
    wait = new WebDriverWait(Driver.driver, Configuration.WebDriverWait.Waiting_Time);
    
    }
    
    
    
}

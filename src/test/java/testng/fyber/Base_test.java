/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testng.fyber;

import config.Configuration;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.BeforeSuite;
import utilities.Driver;
import utilities.Driver_wait;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;  
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import utilities.PlatformDetection;

/**
 *
 * @author aref
 */
public class Base_test {
    
  protected static Logger Log = Logger.getLogger(Base_test.class.getName());
  protected static List<WebElement> movies_list = new ArrayList<WebElement>();
  protected static PlatformDetection platform = new PlatformDetection();
  
   @BeforeSuite
   public static void test_suite_setup(){    
   if (Configuration.Platform.autoDetection){    
   Configuration.Set_path_to_geckodriver.geckodriver = platform.os_getter();
   }
   DOMConfigurator.configure("Logger.xml");
   Log.info("************************************");
   Log.info("@BeforeSuite: test_Suite_setup");
   Log.info("************************************");
   Driver.Initialize();
   Driver_wait.Driver_wait_setup();

   }
   
       
    @AfterSuite
    public static void tearDown() {
    Log.info("***************************************************");
    Log.info("@AfterSuite: teardown the test suite");
    Log.info("***************************************************");
    Driver.driver.quit();
    Driver.driver= null;
        
    }  
    
}


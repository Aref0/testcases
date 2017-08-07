/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import config.Configuration;
import org.apache.commons.lang3.SystemUtils;

/**
 *
 * @author aref
 */
public class PlatformDetection {

    public String os_getter() {
        // resolve OS
        if ("Firefox".equals(Configuration.Browser.browser) && SystemUtils.IS_OS_WINDOWS) {
           return "geckodriverWin.exe";
         
        }else if ("Firefox".equals(Configuration.Browser.browser) && SystemUtils.IS_OS_LINUX) {
           return "geckodriver";
           
        }else if ("Firefox".equals(Configuration.Browser.browser) && SystemUtils.IS_OS_MAC) {
           return "geckodriverMac";
            
        }else if ("Chrome".equals(Configuration.Browser.browser) && SystemUtils.IS_OS_WINDOWS) {
           return "chromedriverWin.exe";
           
        }else if ("Chrome".equals(Configuration.Browser.browser) && SystemUtils.IS_OS_LINUX) {
           return "chromedriver";
           
        }else if ("Chrome".equals(Configuration.Browser.browser) && SystemUtils.IS_OS_MAC) {
           return "chromedriverMac";
        }
          else {
            throw new IllegalArgumentException("Unknown operating system : " + SystemUtils.OS_NAME + 
                                     " ,please configure webdriiver manually in Configuration class");
        }
         
}
    
}

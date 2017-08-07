
package config;


public class Configuration {
    
    public static class Top_250_Page{
    
    public static String Url = "http://www.imdb.com/chart/top" ;
        
    }
    
    public static class Western_genre_page{
    
    public static String Url = "http://www.imdb.com/search/title?genres=western&sort=user_rating,desc&title_type=feature&num_votes=25000,&pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2406822102&pf_rd_r=1DQ91TNSPA9MK0BG5NN6&pf_rd_s=right-6&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_gnr_21" ;
        
    }
    
    public static class Browser{
    //what Browser do you want to use type "Chrome" or "Firefox"
    public static String browser = "Chrome" ;
        
    }
    
    public static class WebDriverWait{
    //set the wait time
    public static int Waiting_Time = 15 ;
        
    }
    
    public static class Set_path_to_geckodriver{
    
    public static String geckodriver = "geckodriver01";
        
    }
    
    public static class Set_path_to_Chromedriver{
    
    public static String Set_path_to_Chromedriver = "chromedriver";
        
    }
    
    //this will allow the test to choose the webdriver based on the OS, possible values are:
    //"true" to turn on environment auto detection
    //or "false" to turn off environment auto detection, and set the webdriver path manualy instead
    //if you want to use 64bit version of Chrome or firefox drivers then please do not set
    //auto detection to true, and set the path to the driver manually, since auto detection 
    //works only with 32bit drivers on Win, Linux, and Mac
    public static class Platform{
    
    public static boolean autoDetection = false;
        
    }
}

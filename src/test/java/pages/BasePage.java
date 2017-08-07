
package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// base page that contains all the basic and repeated actions
//that can be performed on any page, will be useful for creating
// new tests, with less code
public class BasePage {
    
    protected WebDriver driver;
    protected WebDriverWait wait;

    
    BasePage(WebDriver driver, WebDriverWait wait){
        //shared Objects between all the pages, that extends "BasePage class"
        this.driver = driver;
        this.wait = wait;
    }
    
        //following are the actions that we will perform on any element in any child class, that will extend "BasePage"
        //we just need to pass the object that we want to perform the action on, from the child class
        public String get_current_page_title(){
        String PageTitle = driver.getTitle();
        
        return PageTitle;
    }
    
         public void click_on_element(WebElement element){
         element.click();
    }
    
        public void set_element_text(WebElement element, String Text){
        element.clear();
        element.sendKeys(Text);
    }
       
        
        public Boolean is_element_visiable(WebElement element){
       
        return element.isDisplayed();
    } 
      
        public void waiting_for_visibility_of_element(String selector_type, String selector){
            
        switch (selector_type) {
            case "cssSelector": 
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector))); 
            break;
            }      
            case "xpath":  
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector))); 
            break;
            }   
            case "id":   
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selector)));  
            break;
            }
            case "className":    
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(selector)));
            break;
            }
            case "partialLinkText":
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(selector)));
            break;
            }
            case "linkText":
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(selector)));
            break;
            }
            case "name":
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(selector)));
            break;
            } 
            case "tagName":
            {wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(selector)));
            break;
            }  
        }
    }
      
         public String get_inner_HTML(WebElement element){
             
         if (element.isDisplayed()){
         String InnerHTML = element.getAttribute("innerHTML");
         return InnerHTML;
    }  
         return "Element is not visible";         
}
         
    //get child webelement of the given parent webelement 
    public List<WebElement> child_webelements_getter (WebElement parent_element, String selector_type, String sub_element_selector){
      List<WebElement> child_Elements = null;
        
        // using of switch with any data type other than "int" is only available with java 
        // versions above 1.7
        switch (selector_type) {
            
            case "cssSelector": 
            {child_Elements = parent_element.findElements(By.cssSelector(sub_element_selector));
            break;
            } 
            case "xpath":  
            { child_Elements = parent_element.findElements(By.xpath(sub_element_selector));
            break; 
            }
            case "id":   
            {child_Elements = parent_element.findElements(By.id(sub_element_selector)); 
            break;
            } 
            case "className":    
            { child_Elements = parent_element.findElements(By.className(sub_element_selector));
            break;
            }   
            case "partialLinkText":
            {  child_Elements = parent_element.findElements(By.partialLinkText(sub_element_selector));
            break;
            }
            case "linkText":
            {child_Elements = parent_element.findElements(By.linkText(sub_element_selector));
            break;
            }
            case "name":
            { child_Elements = parent_element.findElements(By.name(sub_element_selector));  
            break;
            }
            case "tagName":
            { child_Elements = parent_element.findElements(By.tagName(sub_element_selector));
            break;
            } 
        }
        
     //return all sub webelements under the given parent webelement
     return child_Elements;
}
    
    // Base methode for searching for text within any child element within the containing 
    //parent element
     public boolean get_text_within_child_elements(List<WebElement> parent_element, String search_for){
         
       boolean Found = false;
       //loop through each user and find the user you want
       for(WebElement item : parent_element){
          if (item.getText().contains(search_for)){
             // if element found set Found to "True"
             Found = true;
             break;
 }
       }  
      
    return Found; 
     } 
}
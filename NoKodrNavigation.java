package appitude;

import org.openqa.selenium.chrome.ChromeDriver;

public class NoKodrNavigation {

    public static void main(String[] args) {
        
        
       ChromeDriver driver=new ChromeDriver();
        
        driver.get("https://app-staging.nokodr.com/");

        driver.quit();
    }
}

package br.com.inmetrics.testetecnico.pageManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   public class driverObject {
	
	private static WebDriver driver;

	 public static WebDriver inicializaDriver() {
        if (driver == null) {
       //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://www.inmrobo.tk/accounts/login/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static WebDriver fechandoDriver() {
        if (driver != null) {
            driver.close();
        }
        return driver = null;
    }

 

   
            
    

}

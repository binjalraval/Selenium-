package Seleniumhomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

    public static void main(String[] args) throws InterruptedException {;

        System.setProperty("webdriver.gecko.driver","/Users/binjalraval/Downloads/Firefoxdriver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bbc.co.uk/");

    }
}

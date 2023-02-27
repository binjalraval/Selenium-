package Seleniumhomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","/Users/binjalraval/Downloads/Drivers/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.co.uk/");

    }

    }
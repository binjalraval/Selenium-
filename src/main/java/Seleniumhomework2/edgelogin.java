package Seleniumhomework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgelogin {
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");

            driver.findElement(By.className("ico-login")).click();
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
            driver.findElement(By.id("Email")).sendKeys("bvs.raval30@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("Shash1811*");
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[4]/button"));
    }
}

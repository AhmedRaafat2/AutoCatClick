package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://popcat.click/?fbclid=IwAR1dRf0WMzWKLuxQ5a1-tLPru1xWZ3WKLGRGER5XhgQlQ9tKc_8Fr3vQVCg");
        for (int i = 0 ; i< 1000 ; i++){
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]")).click();
        }
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]")).click();
    }
}

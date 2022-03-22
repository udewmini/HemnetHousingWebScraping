package com.example.hemnethousingwebscraping;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HemnetHousesBorlange{

    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.hemnet.se/salda/bostader?housing_form_groups%5B%5D=houses&housing_form_groups%5B%5D=row_houses&housing_form_groups%5B%5D=apartments&location_ids%5B%5D=17883&page=1");

        List<WebElement> area = driver.findElements(By.className("sold-property-listing__area") );
        List<WebElement> price = driver.findElements(By.xpath("//div[normalize-space(text())]" ));

        System.out.println(area.size());
        //System.out.println(price.toString());
        for (WebElement p : price) {
            String s = p.getAttribute("class");
            System.out.println(s);
        }

        driver.quit();

    }



}

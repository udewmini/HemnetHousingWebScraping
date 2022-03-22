package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

// https://www.hemnet.se/salda/bostader?housing_form_groups%5B%5D=houses&housing_form_groups%5B%5D=row_houses&housing_form_groups%5B%5D=apartments&location_ids%5B%5D=17883&page=1
public class Hemnet {

    @FindBy(xpath = "//h2[normalize-space(text()) = 'Vasagatan 16A']")
    public WebElement soldpropertylistingheadingH2;

    @FindBy(css = "div[class~='sold']")
    public WebElement soldpropertylistingsubheadingDiv;

    @FindBy(xpath = "//div[normalize-space(text()) = '1 860 kr/mån']")
    public WebElement soldpropertylistingfeeDiv;

    @FindBy(xpath = "//div[contains(@class, 'qa-sale-card')][.//h2[normalize-space(text()) = 'Vasagatan 16A']]//div[normalize-space(text()) = 'Slutpris 900 000 kr']")
    public WebElement soldpropertylistingsubheadingDiv2;

    @FindBy(xpath = "//div[contains(@class, 'qa-sale-card')][.//h2[normalize-space(text()) = 'Vasagatan 16A']]//div[normalize-space(text()) = 'Såld 18 mars 2022']")
    public WebElement soldpropertylistingsolddateDiv;

    System.out.println(WebElement.getText());



    @FindBy(xpath = "//div[contains(@class, 'qa-sale-card')][.//h2[normalize-space(text()) = 'Vasagatan 16A']]//div[contains(@class, 'and')]")
    public WebElement soldpropertylistingpricechangeandpriceperm2Div;

    @FindBy(css = "div.sold-property-listing__subheading.sold-property-listing__area")
    public WebElement soldpropertylistingsubheadingDiv3;

    @FindBy(css = "div[class~='sold']")
    public WebElement soldpropertylistinglandareaDiv;

    @FindBy(xpath = "//div[@class='sold-property-listing__info'][.//div[normalize-space(text()) = '4 053 kr/mån']]//span[normalize-space(text()) = 'Balkong']")
    public WebElement hcllabelSpan;

    public Hemnet(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.jetbrains.com/");

        mainPage = new MainPage(driver);
    }
}
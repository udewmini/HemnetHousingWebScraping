package com.example.hemnethousingwebscraping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.hemnet.se/salda/bostader?housing_form_groups%5B%5D=houses&housing_form_groups%5B%5D=row_houses&housing_form_groups%5B%5D=apartments&location_ids%5B%5D=17883&page=1
public class HemnetHouses {

    @FindBy(css = "h2.sold-property-listing__heading.qa-selling-price-title")
    public WebElement soldpropertylistingheadingH2;

    @FindBy(xpath = "//div[contains(@class, 'location')][.//h2[normalize-space(text()) = 'Brokroken 3A']]//div")
    public WebElement elementDiv;

    @FindBy(xpath = "//div[normalize-space(text()) = '109 m²   4 rum']")
    public WebElement soldpropertylistingsubheadingDiv;

    @FindBy(xpath = "//div[normalize-space(text()) = 'Slutpris 2 300 000 kr']")
    public WebElement soldpropertylistingsubheadingDiv2;

    @FindBy(xpath = "//div[@class='sold-property-listing__price'][.//div[normalize-space(text()) = 'Slutpris 2 300 000 kr']]//div[normalize-space(text()) = 'Såld 21 mars 2022']")
    public WebElement soldpropertylistingsolddateDiv;

    @FindBy(xpath = "//div[normalize-space(text()) = '21 101 kr/m²']")
    public WebElement soldpropertylistingpriceperm2Div;

    @FindBy(xpath = "//div[@class='sold-property-listing__info'][.//h2[normalize-space(text()) = 'Brokroken 3A']]//span[normalize-space(text()) = 'Balkong']")
    public WebElement hcllabelSpan;

    @FindBy(xpath = "//div[@class='sold-property-listing__info'][.//h2[normalize-space(text()) = 'Brokroken 3A']]//span[normalize-space(text()) = 'Uteplats']")
    public WebElement hcllabelSpan2;

    public HemnetHouses(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
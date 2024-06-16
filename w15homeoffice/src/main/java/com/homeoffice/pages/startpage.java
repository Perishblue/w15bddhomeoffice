package com.homeoffice.pages;

import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class startpage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public void StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//section[@class='govuk-!-margin-bottom-6']/a")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement dropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Check if you need a UK visa')]")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//div[@id='current-question']/button")
    WebElement nextStepButton1;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement result;

    public void clickStartNow() {
        clickOnElement(startNowButton);
    }

    public void selectNationality(String nationality) {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='response']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText(nationality);
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }

    public String getResultMessage(){
        return getTextFromElement(resultMessage);
    }
    public void selectReasonForVisit(String reason){
        clickOnElement(reasonForVisitList);

    }
    public void clickNextStepButton1(){
        clickOnElement(nextStepButton1);
    }
    public String resultMessage(){
        return getTextFromElement(result);
    }
}

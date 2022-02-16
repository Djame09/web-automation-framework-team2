package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//div[@class='sc-hd-category']")
    WebElement Categories;
    @FindBy(xpath = "//input[@type='text']")
    WebElement search;
    @FindBy(xpath ="//input[@type='submit']" )
    WebElement submitButton;



    public void hoverOverCategories(WebDriver driver){
        hoverOver(driver,Categories);
    }
    public void searchelements(String elementToSearch){
        type(search,elementToSearch);
        click(submitButton);
    }
    }

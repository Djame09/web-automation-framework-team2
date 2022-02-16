package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    public LoginPage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Create new account']")
    WebElement createAccountButton;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@name='reg_email__']")
    WebElement emailField;
    @FindBy(xpath = "//input[@name='reg_email_confirmation__']")
    WebElement emailConfirmationField;
    @FindBy(xpath = "//input[@name='reg_passwd__']")
    WebElement passwordField;
    @FindBy(xpath = "//select[@name='birthday_month']") //
    WebElement month;
    @FindBy(xpath = "//select[@name='birthday_day']")
    WebElement day;
    @FindBy(xpath = "//select[@name='birthday_year']")
    WebElement year;
    @FindBy(xpath = "//label[text()='Male']")
    WebElement gender;
    @FindBy(xpath = "//button[@name='websubmit']")
    WebElement signUpButton;
    @FindBy(xpath = "//h2[text()='Enter the code from your email']")
    WebElement confirmationCode;
    @FindBy(xpath = "//input[@name='email']")
    WebElement emailLoginField;
    @FindBy(xpath = "//input[@name='pass']")
    WebElement passwordLoginField;
    @FindBy(xpath = "//button[@name='login']")
    WebElement loginButton;
    @FindBy(xpath = "//a[@aria-current='page']")
    WebElement searchHomePage;
    @FindBy(xpath = "//span[text()='Create story']")
    WebElement createStory;
    @FindBy(xpath = "//div[text()='Create a text story']")
    WebElement createATextStory;
    @FindBy(xpath = "//textarea[@style='overflow-y: auto;']")
    WebElement textStory;
    @FindBy(xpath = "//span[text()='Share to Story']")
    WebElement shareButton;



    public String getConfirmationCode(){
        return getText(confirmationCode);
    }



    public void createAccount(){
        click(createAccountButton);
        type(firstNameField,"sidipirlo");
        type(lastNameField,"caravana");
        type(emailField,"sidipirlocavana@gmail.com");
        type(emailConfirmationField,"sidipirlocavana@gmail.com");
        type(passwordField,"1234cara@");
        selectDropdownOption(month,"Dec");
        selectDropdownOption(day,"15");
        selectDropdownOption(year,"2000");
        click(gender);
        click(signUpButton);
        waitFor(20);
    }
    public void signIn(){
        type(emailLoginField,"amararris77@gmail.com");
        type(passwordLoginField,"Ania@02102019");
        click(loginButton);
    }
    public void createStory(){
        type(emailLoginField,"amararris77@gmail.com");
        type(passwordLoginField,"Ania@02102019");
        click(loginButton);
        click(searchHomePage);
        click(createStory);
        click(createATextStory);
        type(textStory,"we learning selenium");
        click(shareButton);

    }
}
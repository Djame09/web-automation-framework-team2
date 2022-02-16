package us.piit.login;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.LoginPage;
import utility.GetProperties;

import java.util.Properties;


public class TestLogin extends CommonAPI {
    @Test(enabled = true)
    public void testCreateAccount() {
        LoginPage loginPage = new LoginPage(driver);
        Properties prop = GetProperties.loadProperties("src/test/resources/config.properties");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        loginPage.createAccount();
        Assert.assertEquals(loginPage.getConfirmationCode(),"Enter the code from your email");
        waitFor(3);
    }

    @Test(enabled = false)
    public void testSignIn() {
        LoginPage loginPage = new LoginPage(driver);

        waitFor(3);
        loginPage.signIn();
        //String expectedText="We need more information";
        // String actualText =homePage.moreInformation.getText();
        //Assert.assertEquals(actualText, expectedText,"the text did not match");
    }

    @Test(enabled = false)

    public void testCreateStory() {
        LoginPage loginPage = new LoginPage(driver);

        waitFor(3);
        loginPage.createStory();
        //String expectedText="We need more information";//div[text()='Sign Up']
        // String actualText =homePage.moreInformation.getText();
        //Assert.assertEquals(actualText, expectedText,"the text did not match");


    }

}

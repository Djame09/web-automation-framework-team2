package us.piit;


import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Locale;

public class AppTest extends CommonAPI {

@Test
 public void categoriesList(){
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);

    homePage.hoverOverCategories(driver);


}

@Test

    public void searchelement(){
    HomePage homePage2= PageFactory.initElements(driver,HomePage.class);
    homePage2.searchelements("monitor");
}


}

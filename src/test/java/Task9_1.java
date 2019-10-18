import HomeWork9.TestPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//import org.junit.jupiter.api.Test;

public class Task9_1 {

    private WebDriver driver;
    private TestPage testPage;


    @Before
    public void settings() {
        System.setProperty("webdriver.chrome.driver", "d:\\install\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        testPage = new TestPage(this.driver);
    }

    @Test
    public void createRegistration () {

        testPage.openMainPage();
        testPage.openRegistetionForm();
        testPage.enterEmail();
        testPage.createAccount();
        testPage.chooseGender ();
        testPage.enterFirstName ();
        testPage.enterLastName ();
        testPage.enterEmailAgain ();
        testPage.firstName();
        testPage.lastName();
        testPage.company();
        testPage.address();
        testPage.city();
        testPage.zipPostal();
        testPage.mobile();
        testPage.aliasForFutureReference();
        testPage.registration();
        Assert.assertTrue(
                testPage.error());

    }

    @After
    public void cleanup() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

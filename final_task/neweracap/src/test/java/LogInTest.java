import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static org.assertj.core.api.Assertions.assertThat;

public class LogInTest {

    HomePage homePage;
    LogInPage logInPage;

    @BeforeClass
    public void setUp() {
        isChrome();
        startMaximized = true;
        homePage = new HomePage();
        logInPage = new LogInPage();
    }

    @AfterClass
    public void shutDown() {
        clearBrowserCookies();
    }

    @Test
    public void logIn() {
        homePage.openBaseUrl();
        homePage.clickOnSignInRegisterButton();
        logInPage.enterEmail("metig18651@sammail.ws")
                .enterPassword("qwerty123QwErTy")
                .clickSubmitButton();

        assertThat(Selenide.$(By.xpath("//a[contains(@class,'myAccountLinksHeader collapsed')]")).isDisplayed());
    }

    @Test
    public void bla() {
        homePage.openBaseUrl();
        homePage.getListOfCapsBlack();
    }

}

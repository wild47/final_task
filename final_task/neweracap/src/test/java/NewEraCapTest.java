import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.caps_pages.AstrologyCapsPage;
import pages.caps_pages.CitySeriesCapsPage;
import pages.caps_pages.NflPlayoffsCapsPage;
import pages.caps_pages.TeenageMutantNinjaTurtlesCapsPage;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static org.assertj.core.api.Assertions.assertThat;

public class NewEraCapTest extends Configuration {

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
    public void checkThatCitySeriesCapsContainsTwelveCaps() {
        homePage.openBaseUrl();
        homePage.clickOnCitySeriesCapsPage();
        citySeriesCapsPage.citySeriesCapsShouldContainsTwelveCaps();
    }

    @Test
    public void checkThatTeenageMutantNinjaTurtlesContainsTwelveCaps() {
        homePage.openBaseUrl();
        homePage.clickOnTeenageMutantNinjaTurtlesCapsPage();
        teenageMutantNinjaTurtlesCapsPage.teenageMutantNinjaTurtlesShouldContainsTwelveCaps();
    }

    @Test
    public void checkThatNflPlayOffsCapsContainsTwelveCaps() {
        homePage.openBaseUrl();
        homePage.clickOnNflPlayOffsCapsPage();
        nflPlayoffsCapsPage.nflPlayOffsCapsShouldContainTwelveCaps();
    }

    @Test
    public void checkThatAstrologyClothesContainsTwelveCaps() {
        homePage.openBaseUrl();
        homePage.clickOnAstrologyClothesPage();
        astrologyCapsPage.astrologyClothesShouldContainTwelveClothes();
    }

}

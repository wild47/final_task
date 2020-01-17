import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewEraCapTest extends Configuration {

    @Test
    public void logIn() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnSignInRegisterButton();
        getLogInPage().enterEmail("metig18651@sammail.ws")
                .enterPassword("qwerty123QwErTy")
                .clickSubmitButton();

        assertThat(Selenide.$(By.xpath("//a[contains(@class,'myAccountLinksHeader collapsed')]")).isDisplayed());
    }

    @Test
    public void checkThatCitySeriesCapsContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnCitySeriesCapsPage();
        getCitySeriesCapsPage().citySeriesCapsShouldContainsTwelveCaps();
    }

    @Test
    public void checkThatTeenageMutantNinjaTurtlesContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnTeenageMutantNinjaTurtlesCapsPage();
        getTeenageMutantNinjaTurtlesCapsPage().teenageMutantNinjaTurtlesShouldContainsTwelveCaps();
    }

    @Test
    public void checkThatNflPlayOffsCapsContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnNflPlayOffsCapsPage();
        getNflPlayoffsCapsPage().nflPlayOffsCapsShouldContainTwelveCaps();
    }

    @Test
    public void checkThatAstrologyClothesContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnAstrologyClothesPage();
        getAstrologyCapsPage().astrologyClothesShouldContainTwelveClothes();
    }
}

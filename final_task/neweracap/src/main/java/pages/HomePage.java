package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private final static String HOME_URL = "https://www.neweracap.com/";

    private SelenideElement signInRegisterButton = $x("//a[@href='/login']");

    private SelenideElement citySeriesCaps = $x("(//img[contains(@class,'multi-layer__image ')])[1]");
    private SelenideElement teenageMutantNinjaTurtles = $x("(//a[@class='nwer-button-default js-ucp-btn '])[2]");
    private SelenideElement nflPlayOffsCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[3]");
    private SelenideElement astrologyClothes = $x("(//a[@class='nwer-button-default js-ucp-btn '])[4]");

    public HomePage openBaseUrl() {
        open(HOME_URL);
        return this;
    }

    public HomePage clickOnSignInRegisterButton() {
        signInRegisterButton.click();
        return this;
    }

    public HomePage clickOnCitySeriesCapsPage() {
        citySeriesCaps.shouldBe(visible).click();
        return this;
    }

    public HomePage clickOnTeenageMutantNinjaTurtlesCapsPage() {
        teenageMutantNinjaTurtles.shouldBe(visible).click();
        return this;
    }

    public HomePage clickOnNflPlayOffsCapsPage() {
        nflPlayOffsCaps.shouldBe(visible).click();
        return this;
    }

    public HomePage clickOnAstrologyClothesPage() {
        astrologyClothes.shouldBe(visible).click();
        return this;
    }
}
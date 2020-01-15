package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private final static String HOME_URL = "https://www.neweracap.com/";

    private SelenideElement signInRegisterButton = $x("//a[@href='/login']");

    private SelenideElement citySeriesCaps = $x("(//img[contains(@class,'multi-layer__image ')])[1]");
    private SelenideElement teenageMutantNinjaTurtles = $x("(//a[@class='nwer-button-default js-ucp-btn '])[2]");
    private SelenideElement nflPlayOffsCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[3]");
    private SelenideElement astrologyClothes = $x("(//a[@class='nwer-button-default js-ucp-btn '])[4]");

    private ElementsCollection citySeriesCapsElements = $$x("(//a[@class='j-ga-spy'])");
    private ElementsCollection teenageMutantNinjaTurtlesElements = $$x("(//a[@class='j-ga-spy'])");
    private ElementsCollection nflPlayOffsCapsElements = $$x("(//a[@class='j-ga-spy'])");
    private ElementsCollection astrologyClothesElements = $$x("(//a[@class='j-ga-spy'])");

    public HomePage openBaseUrl() {
        open(HOME_URL);
        return this;
    }

    public HomePage clickOnSignInRegisterButton() {
        signInRegisterButton.click();
        return this;
    }

    public HomePage citySeriesCapsContainsTwelveCaps() {
        citySeriesCaps.shouldBe(visible).click();
        citySeriesCapsElements.shouldHaveSize(12);
        return this;
    }

    public HomePage teenageMutantNinjaTurtlesContainsTwelveCaps() {
        teenageMutantNinjaTurtles.shouldBe(visible).click();
        teenageMutantNinjaTurtlesElements.shouldHaveSize(12);
        return this;
    }

    public HomePage nflPlayOffsCapsContainsTwelveCaps() {
        nflPlayOffsCaps.shouldBe(visible).click();
        nflPlayOffsCapsElements.shouldHaveSize(12);
        return this;
    }

    public HomePage astrologyClothesContainsTwelveCaps() {
        astrologyClothes.shouldBe(visible).click();
        astrologyClothesElements.shouldHaveSize(12);
        return this;
    }
}

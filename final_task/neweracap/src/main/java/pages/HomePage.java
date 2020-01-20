package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.Keys.ENTER;

public class HomePage {

    private final static String HOME_URL = "https://lb.aqa.us.nwer-hybr.projects.epam.com/";

    private SelenideElement signInRegisterButton = $x("//a[@href='/login']");

    private SelenideElement citySeriesCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[1]");
    private SelenideElement teenageMutantNinjaTurtles = $x("(//a[@class='nwer-button-default js-ucp-btn '])[2]");
    private SelenideElement nflPlayOffsCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[3]");
    private SelenideElement astrologyClothes = $x("(//a[@class='nwer-button-default js-ucp-btn '])[4]");

    private SelenideElement searchButton = $x("//div[@class='ui-front']");
    private SelenideElement searchField = $(className("js-site-search-input"));

    public HomePage openBaseUrl() {
        open(HOME_URL);
        return this;
    }

    public HomePage clickOnSignInRegisterButton() {
        signInRegisterButton.shouldBe(visible).pressEnter();
        return this;
    }

    public HomePage clickOnCitySeriesCapsPage() {
        citySeriesCaps.shouldBe(visible).pressEnter();
        return this;
    }

    public HomePage clickOnTeenageMutantNinjaTurtlesCapsPage() {
        teenageMutantNinjaTurtles.shouldBe(visible).pressEnter();
        return this;
    }

    public HomePage clickOnNflPlayOffsCapsPage() {
        nflPlayOffsCaps.shouldBe(visible).pressEnter();
        return this;
    }

    public HomePage clickOnAstrologyClothesPage() {
        astrologyClothes.shouldBe(visible).pressEnter();
        return this;
    }

    public HomePage searchSomeData(String text) {
        searchButton.shouldBe(visible).click();
        searchField.shouldBe(visible).sendKeys(text, ENTER);
        return this;
    }
}

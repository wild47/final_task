package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private final static String HOME_URL = "https://www.neweracap.com/";

    private SelenideElement signInRegisterButton = $x("//a[@href='/login']");
    private SelenideElement citySeriesCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[1]");
    private SelenideElement teenageMutantNinjaTurtles = $x("//a[@class='nwer-button-default js-ucp-btn']");
    private SelenideElement nflPlayoffsCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[2]");
    private SelenideElement astrologyCaps = $x("(//a[@class='nwer-button-default js-ucp-btn '])[3]");

    private ElementsCollection caps = $$x("(//div[@class='product-item__name'])");
    private ElementsCollection blackCapsElements = $$x("(//a[@class='j-ga-spy'])");

    public HomePage openBaseUrl() {
        open(HOME_URL);
        return this;
    }

    public HomePage clickOnSignInRegisterButton() {
        signInRegisterButton.click();
        return this;
    }

    /*public HomePage getListOfCaps() {
        nflPlayoffsCaps.click();
        System.out.println(caps.size());
        caps.shouldHaveSize(12);
        return this;
    }

    public HomePage getListOfCapsBlack() {
        citySeriesCaps.click();
        blackCapsElements.shouldHaveSize(12);
        System.out.println(blackCapsElements.size());
        return this;
    }*/

}

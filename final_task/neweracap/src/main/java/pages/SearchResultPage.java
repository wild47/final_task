package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.tagName;

public class SearchResultPage {

    private SelenideElement searchResult = $(tagName("h1"));
    private SelenideElement pagination = $(className("pagination"));
    private SelenideElement dropDownMenuOfCountOfCaps = $x("(//button[@data-toggle='dropdown'])[1]");
    private SelenideElement twelveCaps = $x("(//a[@role='option'])[1]");
    private SelenideElement twentyFourCaps = $x("(//a[@role='option'])[2]");
    private SelenideElement fortyEightCaps = $x("(//a[@role='option'])[3]");

    private ElementsCollection collectionOfCaps = $$x("(//div[@class = 'product-item__name'])");

    public SearchResultPage checkThatResultPageContainsSearchInput(String text) {
        searchResult.shouldHave(text(text));
        return this;
    }

    public SearchResultPage resultPageContainsSoManyCapsAsIndicated() {
        dropDownMenuOfCountOfCaps.shouldBe(visible).click();
        twelveCaps.shouldBe(visible).click();
        pagination.scrollTo().shouldBe(visible);
        collectionOfCaps.shouldHaveSize(12);

        dropDownMenuOfCountOfCaps.shouldBe(visible).click();
        twentyFourCaps.shouldBe(visible).click();
        pagination.scrollTo().shouldBe(visible);
        collectionOfCaps.shouldHaveSize(24);

        dropDownMenuOfCountOfCaps.shouldBe(visible).click();
        fortyEightCaps.shouldBe(visible).click();
        pagination.scrollTo().shouldBe(visible);
        collectionOfCaps.shouldHaveSize(48);
        return this;
    }

}

package pages.caps;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class CitySeriesCapsPage {

    private ElementsCollection citySeriesCapsElements = $$x("(//a[@class='j-ga-spy'])");

    public CitySeriesCapsPage citySeriesCapsShouldContainsTwelveCaps() {
        citySeriesCapsElements.shouldHaveSize(12);
        return this;
    }
}

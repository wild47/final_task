package pages.caps;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class AstrologyCapsPage {

    private ElementsCollection astrologyClothesElements = $$x("(//p[@class='j-ga-spy'])");

    public AstrologyCapsPage astrologyClothesShouldContainTwelveClothes() {
        astrologyClothesElements.shouldHaveSize(12);
        return this;
    }
}

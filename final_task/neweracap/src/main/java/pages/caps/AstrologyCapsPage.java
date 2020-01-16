package pages.caps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class AstrologyCapsPage {

    private ElementsCollection astrologyClothesElements = $$x("(//a[@class='j-ga-spy'])");

    public AstrologyCapsPage astrologyClothesShouldContainTwelveClothes(){
        astrologyClothesElements.shouldHaveSize(12);
        return this;
    }

}

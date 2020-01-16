package pages.caps;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class NflPlayoffsCapsPage {

    private ElementsCollection nflPlayOffsCapsElements = $$x("(//a[@class='j-ga-spy'])");

    public NflPlayoffsCapsPage nflPlayOffsCapsShouldContainTwelveCaps(){
        nflPlayOffsCapsElements.shouldHaveSize(12);
        return this;
    }

}

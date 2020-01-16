package pages.caps;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class TeenageMutantNinjaTurtlesCapsPage {

    private ElementsCollection teenageMutantNinjaTurtlesElements = $$x("(//p[@class='j-ga-spy'])");

    public TeenageMutantNinjaTurtlesCapsPage teenageMutantNinjaTurtlesShouldContainsTwelveCaps() {
        teenageMutantNinjaTurtlesElements.shouldHaveSize(12);
        return this;
    }

}

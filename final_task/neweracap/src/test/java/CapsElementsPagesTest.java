import org.testng.annotations.Test;

public class CapsElementsPagesTest extends Configuration {

    @Test
    public void checkThatCitySeriesCapsContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnCitySeriesCapsPage();
        getCitySeriesCapsPage().citySeriesCapsShouldContainsTwelveCaps();
    }

    @Test
    public void checkThatTeenageMutantNinjaTurtlesContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnTeenageMutantNinjaTurtlesCapsPage();
        getTeenageMutantNinjaTurtlesCapsPage().teenageMutantNinjaTurtlesShouldContainsTwelveCaps();
    }

    @Test
    public void checkThatNflPlayOffsCapsContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnNflPlayOffsCapsPage();
        getNflPlayoffsCapsPage().nflPlayOffsCapsShouldContainTwelveCaps();
    }

    @Test
    public void checkThatAstrologyClothesContainsTwelveCaps() {
        getHomePage().openBaseUrl();
        getHomePage().clickOnAstrologyClothesPage();
        getAstrologyCapsPage().astrologyClothesShouldContainTwelveClothes();
    }

}

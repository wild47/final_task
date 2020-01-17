import lombok.Getter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LogInPage;
import pages.caps_pages.AstrologyCapsPage;
import pages.caps_pages.CitySeriesCapsPage;
import pages.caps_pages.NflPlayoffsCapsPage;
import pages.caps_pages.TeenageMutantNinjaTurtlesCapsPage;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

@Getter
public class Configuration {


    private HomePage homePage;
    private LogInPage logInPage;
    private CitySeriesCapsPage citySeriesCapsPage;
    private TeenageMutantNinjaTurtlesCapsPage teenageMutantNinjaTurtlesCapsPage;
    private NflPlayoffsCapsPage nflPlayoffsCapsPage;
    private AstrologyCapsPage astrologyCapsPage;

    @BeforeClass
    public void setUp() {
        isChrome();
        startMaximized = true;
        homePage = new HomePage();
        logInPage = new LogInPage();
        citySeriesCapsPage = new CitySeriesCapsPage();
        teenageMutantNinjaTurtlesCapsPage = new TeenageMutantNinjaTurtlesCapsPage();
        nflPlayoffsCapsPage = new NflPlayoffsCapsPage();
        astrologyCapsPage = new AstrologyCapsPage();
    }

    @AfterClass
    public void shutDown() {
        clearBrowserCookies();
    }

}

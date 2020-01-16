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

public class Configuration {

    public static HomePage homePage;
    public static LogInPage logInPage;
    public static CitySeriesCapsPage citySeriesCapsPage;
    public static TeenageMutantNinjaTurtlesCapsPage teenageMutantNinjaTurtlesCapsPage;
    public static NflPlayoffsCapsPage nflPlayoffsCapsPage;
    public static AstrologyCapsPage astrologyCapsPage;

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

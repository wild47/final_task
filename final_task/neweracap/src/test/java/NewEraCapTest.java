import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewEraCapTest extends Configuration {

    private static final String JSON = "JSON";

    // TODO rename test method
    @Test(dataProvider = JSON, dataProviderClass = JsonHelper.class)
    public void logIn(String email, String password) {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage().enterEmailToLogInField(email)
                .enterPasswordToLogInField(password)
                .clickSignInButton();

        assertThat(Selenide.$(By.xpath("//a[contains(@class,'myAccountLinksHeader collapsed')]")).isDisplayed());
    }

    // TODO rename test method
    @Test(dataProvider = JSON, dataProviderClass = JsonHelper.class)
    public void forgetPasswordTest(String email) {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage().clickForgotPasswordButton()
                .resetPassword(email)
                .checkThatPopUpExist()
                .closePopUp()
                .checkThatForgotPasswordButtonIsNotExistAfterPasswordReset();
    }

    @Test(dataProvider = JSON, dataProviderClass = JsonHelper.class)
    public void checkThatSearchWorksCorrect(String dataForSearching) {
        getHomePage().openBaseUrl()
                .searchSomeData(dataForSearching);
        getSearchResultPage().checkThatResultPageContainsSearchInput(dataForSearching);
    }

    @Test(dataProvider = JSON, dataProviderClass = JsonHelper.class)
    public void checkThatResultPageContainsSoManyCapsAsIndicated(String dataForSearching) {
        getHomePage().openBaseUrl()
                .searchSomeData(dataForSearching);
        getSearchResultPage().checkThatResultPageContainsSearchInput(dataForSearching)
                .resultPageContainsTwelveCaps()
                .resultPageContainsTwentyFourCaps()
                .resultPageContainsFortyEightCaps();
    }

    @Test(dataProvider = JSON, dataProviderClass = JsonHelper.class)
    public void checkThatRegistrationCompleteSuccessfully(String firstName, String lastName, String password) {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage()
                .enterFirstNameToRegistrationField(firstName)
                .enterLastNameToRegistrationField(lastName)
                .enterEmailToRegistrationField()
                .enterPasswordToRegistrationField(password)
                .confirmPasswordToRegistrationField(password)
                .clickRegister()
                .checkThatPopUpSuccessfulRegistrationDisplayed();
    }
}

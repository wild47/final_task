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
    @Test
    public void forgetPasswordTest(String email) {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage().clickForgotPasswordButton()
                .resetPassword(email)
                .checkThatPopUpExist()
                .closePopUp()
                .checkThatForgotPasswordButtonIsNotExistAfterPasswordReset();
    }

    @Test
    public void checkThatSearchWorksCorrect() {
        getHomePage().openBaseUrl()
                .searchSomeData("MLB");
        getSearchResultPage().checkThatResultPageContainsSearchInput("MLB");
    }

    @Test
    public void checkThatResultPageContainsSoManyCapsAsIndicated() {
        getHomePage().openBaseUrl()
                .searchSomeData("MLB");
        getSearchResultPage().checkThatResultPageContainsSearchInput("MLB")
                .resultPageContainsTwelveCaps()
                .resultPageContainsTwentyFourCaps()
                .resultPageContainsFortyEightCaps();
    }

    @Test
    public void checkThatRegistrationCompleteSuccessfully() {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage()
                .enterFirstNameToRegistrationField("aaaa")
                .enterLastNameToRegistrationField("aaa")
                .enterEmailToRegistrationField()
                .enterPasswordToRegistrationField("qwerty123qwerty")
                .confirmPasswordToRegistrationField("qwerty123qwerty")
                .clickRegister()
                .checkThatPopUpSuccessfulRegistrationDisplayed();
    }
}

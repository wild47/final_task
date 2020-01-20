import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewEraCapTest extends Configuration {

    // TODO rename test method
    @Test
    public void logIn() {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage().enterEmailToLogInField("metig18651@sammail.ws")
                .enterPasswordToLogInField("qwerty123QwErTy")
                .clickSignInButton();

        assertThat(Selenide.$(By.xpath("//a[contains(@class,'myAccountLinksHeader collapsed')]")).isDisplayed());
    }

    // TODO rename test method
    @Test
    public void forgetPasswordTest() {
        getHomePage().openBaseUrl()
                .clickOnSignInRegisterButton();
        getLogInRegistrationPage().clickForgotPasswordButton()
                .resetPassword("google@google.com")
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
                .resultPageContainsSoManyCapsAsIndicated();
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

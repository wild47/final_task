package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class LogInRegistrationPage {

    private static final String RANDOM_EMAIL_ADDRESS = "test" + randomAlphabetic(5) + "@gmail.com";

    private SelenideElement emailFieldToLogInField = $(id("j_username"));
    private SelenideElement passwordFieldToLogInField = $(id("j_password"));
    private SelenideElement signInButton = $(id("loginFormBtn"));
    private SelenideElement myAccountField = $x("//a[contains(@class,'myAccountLinksHeader collapsed')]");

    private SelenideElement firstNameToRegistrationField = $(id("register.firstName"));
    private SelenideElement lastNameToRegistrationField = $(id("register.lastName"));
    private SelenideElement emailToRegistrationField = $(id("register.email"));
    private SelenideElement passwordToRegistrationField = $(id("password"));
    private SelenideElement confirmationPasswordToRegistrationField = $(id("register.checkPwd"));
    private SelenideElement registerButton = $(id("registerFormBtn"));
    private SelenideElement popUpSuccessfulRegistration = $(className("alert-plain-message"));

    private SelenideElement forgotPasswordButton = $(className("js-password-forgotten"));
    private SelenideElement emailAddressInputFieldToForgotPasswordField = $(id("forgottenPwd.email"));
    private SelenideElement resetPasswordButton = $x("(//button[@class='btn btn-primary btn-block'])");
    private SelenideElement popUpPasswordReset = $(className("alert-plain-message"));
    private SelenideElement popUpPasswordResetButton = $x("//button[@data-dismiss='alert']");

    public LogInRegistrationPage enterEmailToLogInField(String email) {
        emailFieldToLogInField.shouldBe(visible).setValue(email);
        emailFieldToLogInField.shouldNotBe(empty);
        return this;
    }

    public LogInRegistrationPage enterPasswordToLogInField(String password) {
        passwordFieldToLogInField.shouldBe(visible).setValue(password);
        passwordFieldToLogInField.shouldNotBe(empty);
        return this;
    }

    public LogInRegistrationPage clickSignInButton() {
        signInButton.shouldBe(visible).click();
        return this;
    }

    public LogInRegistrationPage checkThatMyAccountInfoIsDisplayed() {
        myAccountField.shouldBe(visible, exist);
        return this;
    }

    public LogInRegistrationPage enterFirstNameToRegistrationField(String firstName) {
        firstNameToRegistrationField.shouldBe(visible).setValue(firstName);
        return this;
    }

    public LogInRegistrationPage enterLastNameToRegistrationField(String lastName) {
        lastNameToRegistrationField.shouldBe(visible).setValue(lastName);
        return this;
    }

    public LogInRegistrationPage enterEmailToRegistrationField() {
        emailToRegistrationField.shouldBe(visible).setValue(RANDOM_EMAIL_ADDRESS);
        return this;
    }

    public LogInRegistrationPage enterPasswordToRegistrationField(String password) {
        passwordToRegistrationField.shouldBe(visible).setValue(password);
        return this;
    }

    public LogInRegistrationPage confirmPasswordToRegistrationField(String password) {
        confirmationPasswordToRegistrationField.shouldBe(visible).setValue(password);
        return this;
    }

    public LogInRegistrationPage clickRegister() {
        registerButton.shouldBe(visible).click();
        return this;
    }

    public LogInRegistrationPage checkThatPopUpSuccessfulRegistrationDisplayed() {
        popUpSuccessfulRegistration.shouldBe(visible);
        return this;
    }

    public LogInRegistrationPage clickForgotPasswordButton() {
        forgotPasswordButton.shouldBe(visible).click();
        return this;
    }

    public LogInRegistrationPage resetPassword(String email) {
        emailAddressInputFieldToForgotPasswordField.sendKeys(email);
        emailAddressInputFieldToForgotPasswordField.shouldNotBe(empty);
        resetPasswordButton.click();
        return this;
    }

    public LogInRegistrationPage checkThatPopUpExist() {
        popUpPasswordReset.shouldBe(exist);
        return this;
    }

    public LogInRegistrationPage closePopUp() {
        popUpPasswordResetButton.click();
        popUpPasswordReset.shouldNotBe(visible);
        return this;
    }

    public LogInRegistrationPage checkThatForgotPasswordButtonIsNotExistAfterPasswordReset() {
        forgotPasswordButton.shouldNotBe(exist);
        return this;
    }

}

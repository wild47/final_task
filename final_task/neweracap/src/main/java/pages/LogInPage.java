package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogInPage {

    private SelenideElement emailField = $(By.id("j_username"));
    private SelenideElement passwordField = $(By.id("j_password"));
    private SelenideElement submitButton = $(By.id("loginFormBtn"));

    public LogInPage enterEmail(String email) {
        emailField.setValue(email);
        emailField.shouldNotBe(Condition.empty);
        return this;
    }

    public LogInPage enterPassword(String password) {
        passwordField.setValue(password);
        passwordField.shouldNotBe(Condition.empty);
        return this;
    }

    public LogInPage clickSubmitButton() {
        submitButton.click();
        return this;
    }
}

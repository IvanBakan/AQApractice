package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class githubAuthorizationPage {
    private static final SelenideElement userLoginInput = $(By.id("login_field"));
    private static final SelenideElement userPasswordInput = $(By.id("password"));
    private static final SelenideElement submitButton = $(By.xpath("//input[@value='Sign in']"));
    private static final SelenideElement invalidCredErrorMessage = $(By.xpath("//div[contains(text(), 'Incorrect username or password')]"));

    public void authOperation(String login, String password){
        SetUserLogin(login);
        SetUserPassword(password);
        PushSubmitButton();
    }

    public void SetUserLogin(String login){
        userLoginInput.shouldBe(visible).setValue(login);
    }

    public void SetUserPassword (String password){
        userPasswordInput.shouldBe(visible).setValue(password);
    }

    public void PushSubmitButton(){
        submitButton.shouldBe(visible).click();
    }

    public void isErrorMessageDisplayed(){
        invalidCredErrorMessage.shouldBe(visible);
    }
}

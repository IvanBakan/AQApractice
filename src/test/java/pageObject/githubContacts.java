package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class githubContacts {
    private static final SelenideElement userFirstName = $(By.id("form-field-first_name"));
    private static final SelenideElement userLastName = $(By.id("form-field-last_name"));

    public void dataInput (String firstName, String lastName){
        SetUserFirstName(firstName);
        SetUserLastName(lastName);
    }

    public void SetUserFirstName(String firstName){
        userFirstName.shouldBe(visible).setValue(firstName);
    }

    public void SetUserLastName (String lastName){
        userLastName.shouldBe(visible).setValue(lastName);
    }
}

package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GithubContacts {
    public static final SelenideElement userFirstName = $(By.id("form-field-first_name"));
    public static final SelenideElement userLastName = $(By.id("form-field-last_name"));

    public void dataInput (String firstName, String lastName){
        setUserFirstName(firstName);
        setUserLastName(lastName);
    }

    public void setUserFirstName(String firstName){
        userFirstName.shouldBe(visible).setValue(firstName);
    }

    public void setUserLastName (String lastName){
        userLastName.shouldBe(visible).setValue(lastName);
    }
}

package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GitHubTopics {
    private static final SelenideElement ResourcesButton = $(By.xpath("//button[normalize-space()='Resources']"));
    public static final ElementsCollection Topics = $$(By.xpath("//ul[@aria-labelledby='resources-topics-heading']/li"));


    public void clickResourcesButton (){
        ResourcesButton.shouldBe(visible).click();
    }
}

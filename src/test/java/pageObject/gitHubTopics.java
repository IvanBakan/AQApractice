package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class gitHubTopics {
    private static final SelenideElement ResourcesButton = $(By.xpath("//button[contains(@class, 'HeaderMenu-link') and normalize-space()='Resources']"));
    public static final ElementsCollection Topics = $$(By.xpath("//ul[@class='list-style-none f5' and @aria-labelledby='resources-topics-heading']/li"));


    public void ClickResourcesButton (){
        ResourcesButton.shouldBe(visible).click();
    }
}

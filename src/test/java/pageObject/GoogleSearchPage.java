package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchPage {
    private static final SelenideElement SearchLine = $(By.id("APjFqb"));
    public static final ElementsCollection SearchOptions = $$(By.xpath(".//div[@id='Alh6id']//ul/li"));

    public void SetText(String text){
        SearchLine.shouldBe(visible).setValue(text);
    }
}

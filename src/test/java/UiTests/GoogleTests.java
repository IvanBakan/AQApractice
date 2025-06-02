package UiTests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import pageObject.GoogleSearchPage;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pageObject.GoogleSearchPage.SearchOptions;


public class GoogleTests {
    private final static String URL = "https://www.google.com";

    @ParameterizedTest
    @ValueSource (strings = {"qa", "aqa", "cars"})
    public void googleSearchTest (String searchQuery){
        GoogleSearchPage GoogleSearchPage = new GoogleSearchPage ();
        Selenide.open(URL);
        GoogleSearchPage.SetText(searchQuery);
        SearchOptions.get(0).shouldBe(visible);
        Assertions.assertTrue(SearchOptions.size() > 5);
    }
}

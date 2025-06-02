package UiTests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageObject.GoogleSearchPage;

import static pageObject.GoogleSearchPage.SearchOptions;


public class GoogleTests {
    private final static String URL = "https://www.google.com";

    @ParameterizedTest
    @ValueSource (strings = {"qa", "aqa", "cars"})
    public void googleSearchTest (String searchQuery){
        GoogleSearchPage GoogleSearchPage = new GoogleSearchPage ();
        Selenide.open(URL);
        GoogleSearchPage.SetText(searchQuery);
        SearchOptions.shouldBe(CollectionCondition.sizeGreaterThanOrEqual(5));
    }
}

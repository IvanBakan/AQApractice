package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageObject.GoogleSearchPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pageObject.GoogleSearchPage.searchOptions;


public class GoogleTests {
    private final static String URL = "https://www.google.com";

    @ParameterizedTest
    @ValueSource (strings = {"qa", "aqa", "cars"})
    public void googleSearchTest (String searchQuery){
        GoogleSearchPage GoogleSearchPage = new GoogleSearchPage ();
        Selenide.open(URL);
        GoogleSearchPage.setText(searchQuery);
        searchOptions.get(0).shouldBe(visible);
        Assertions.assertTrue(searchOptions.size() > 5);
    }
}

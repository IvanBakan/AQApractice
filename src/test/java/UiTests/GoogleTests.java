package UiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GoogleSearchPage;

public class GoogleTests {
    private final static String URL = "https://www.google.com";

    @Test
    public void googleSearchTest (){
        GoogleSearchPage GoogleSearchPage = new GoogleSearchPage ();
        Selenide.open(URL);
        GoogleSearchPage.SetText("qa");
    }
}

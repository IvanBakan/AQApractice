package UiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.githubAuthorizationPage;

public class githubSuccessfulАuthorizationPageTest extends BaseTest {

    @Test
    public void loginSuccessfulOperation(){
        githubAuthorizationPage githubAuthorizationPage = new githubAuthorizationPage();
        Selenide.open("/login");
        githubAuthorizationPage.authOperation("ivanbakan2005@gmail.com", "08041950s");
    }
}

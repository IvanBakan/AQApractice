package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GithubAuthorizationPage;

public class GithubSuccessfulAuthorizationPageTest extends BaseTestGitHub {

    @Test
    public void loginSuccessfulOperation(){
        GithubAuthorizationPage githubAuthorizationPage = new GithubAuthorizationPage();
        Selenide.open("/login");
        githubAuthorizationPage.authOperation("ivanbakan2005@gmail.com", "08041950s");
    }
}

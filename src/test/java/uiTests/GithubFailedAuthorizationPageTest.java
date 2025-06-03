package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GithubAuthorizationPage;

public class GithubFailedAuthorizationPageTest extends BaseTestGitHub {

    @Test
    public void loginOperationWithBadCredintails(){
        GithubAuthorizationPage githubAuthorizationPage = new GithubAuthorizationPage();
        Selenide.open("/login");
        githubAuthorizationPage.authOperation("test@gmail.com", "123456789");
        githubAuthorizationPage.isErrorMessageDisplayed();
    }
}



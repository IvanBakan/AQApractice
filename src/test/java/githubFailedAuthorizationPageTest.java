import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.githubAuthorizationPage;

public class githubFailedAuthorizationPageTest extends BaseTest {

    @Test
    public void loginOperationWithBadCredintails(){
        githubAuthorizationPage githubAuthorizationPage = new githubAuthorizationPage();
        Selenide.open("/login");
        githubAuthorizationPage.authOperation("test@gmail.com", "123456789");
        githubAuthorizationPage.isErrorMessageDisplayed();
    }
}



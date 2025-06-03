package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GithubContacts;

import static com.codeborne.selenide.Condition.value;
import static pageObject.GithubContacts.userFirstName;
import static pageObject.GithubContacts.userLastName;

public class GitHubContactsTest extends BaseTestGitHub {

    private static final String FIRST_NAME = "Ivan";
    private static final String LAST_NAME = "Bakanov";
    private static final String BASE_URN = "/enterprise/contact?ref_cta=Contact+sales&ref_loc=hero&ref_page=%2Fsolutions_usecase_cicd";


    @Test
    public void contactsInput (){
        GithubContacts githubContacts = new GithubContacts();
        Selenide.open(BASE_URN);
        githubContacts.dataInput(FIRST_NAME, LAST_NAME);
        userFirstName.shouldHave(value("Ivan"));
        userLastName.shouldHave(value("Bakanov"));
    }
}

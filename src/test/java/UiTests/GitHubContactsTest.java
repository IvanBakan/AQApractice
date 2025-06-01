package UiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.githubContacts;

public class GitHubContactsTest extends BaseTestGitHubContacts {


    @Test
    public void ContactsInput (){
        githubContacts githubContacts = new githubContacts();
        Selenide.open("/enterprise/contact?ref_cta=Contact+sales&ref_loc=hero&ref_page=%2Fsolutions_usecase_cicd");
        githubContacts.dataInput("Ivan", "Bakanov");
    }
}

package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubTopics;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Configuration.baseUrl;
import static pageObject.GitHubTopics.Topics;

public class GitHubTopicsTest extends BaseTestGitHub {



    @Test
    public void gitHubTopicTest (){
        GitHubTopics gitHubTopics = new GitHubTopics();
        Selenide.open(baseUrl);
        gitHubTopics.clickResourcesButton();
        Topics.shouldHave(texts("AI", "DevOps", "Security", "Software Development", "View All"));
    }
}

package UiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObject.gitHubTopics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static pageObject.gitHubTopics.Topics;

public class gitHubTopicsTest {
    private final static String URL = "https://github.com/";




    @Test
    public void gitHubTopicTest (){
        gitHubTopics gitHubTopics = new gitHubTopics();
        Selenide.open(URL);
        gitHubTopics.ClickResourcesButton();
        Topics.shouldHave(texts("AI", "DevOps", "Security", "Software Development", "View All"));
    }
}

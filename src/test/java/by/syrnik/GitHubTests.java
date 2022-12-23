package by.syrnik;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTests extends TestBase {

    @Test
    void checkSelenideWikiHasExampleForJUnit5() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body ul").shouldHave(text("Soft assertions"));
        $$("#wiki-body ul a").findBy(href("/selenide/selenide/wiki/SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}

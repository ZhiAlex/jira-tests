package jira_tests;

import com.codeborne.selenide.Configuration;
import jira_tests.helpers.Attach;
import jira_tests.page_object.steps.AuthPageSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    public final AuthPageSteps authPageSteps = new AuthPageSteps();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void addAttachment() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();

        closeWebDriver();
    }
}

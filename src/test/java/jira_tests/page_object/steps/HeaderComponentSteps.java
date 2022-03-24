package jira_tests.page_object.steps;

import io.qameta.allure.Story;
import jira_tests.page_object.elements.HeaderComponentElements;

public class HeaderComponentSteps {

    HeaderComponentElements headerComponentElements = new HeaderComponentElements();

    @Story("Клик на кнопку Create")
    public void createIssue() {
        headerComponentElements.getCreateIssueButton().click();
    }
}

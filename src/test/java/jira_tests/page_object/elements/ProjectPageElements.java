package jira_tests.page_object.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

@Getter
public class ProjectPageElements {
    private SelenideElement
            tasksAmount = $(".ghx-issue-count"),
            showAllTasksButton = $(".ghx-show-all a");
    private ElementsCollection tasks = $$x("//div[@class='ghx-issue-content']");
}

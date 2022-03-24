package jira_tests.page_object.elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class TaskPageElements {
    private SelenideElement
            workflowButton = $("#opsbar-transitions_more"),
            status = $("#status-val");
}

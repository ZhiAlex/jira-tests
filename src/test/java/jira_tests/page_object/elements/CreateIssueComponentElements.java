package jira_tests.page_object.elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class CreateIssueComponentElements {
    private SelenideElement
            chooseProjectInput = $("#project-field"),
            chooseIssueTypeInput = $("#issuetype-field"),
            summaryInput = $("#summary"),
            createIssueButton = $("#create-issue-submit"),
            chooseSetDescriptionTextButton = $x("(//ul//button[@class='aui-button'])[2]"),
            descriptionTextArea = $("#description");
}

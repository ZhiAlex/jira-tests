package jira_tests.page_object.elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HeaderComponentElements {
    private SelenideElement createIssueButton = $("#create_link");
}

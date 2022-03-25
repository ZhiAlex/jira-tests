package jira_tests.page_object.steps;

import io.qameta.allure.Step;
import jira_tests.page_object.elements.TaskPageElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class TaskPageSteps {

    TaskPageElements taskPageElements = new TaskPageElements();

    @Step("Открытие workflow")
    public TaskPageSteps clickWorkflow() {
        taskPageElements.getWorkflowButton().click();
        return this;
    }

    @Step("Выбор статуса")
    public TaskPageSteps chooseStatus(String status) {
        String xpath = String.format("//div[@class='aui-dropdown2-item-group']//a//span[text()='%s']", status);
        $x(xpath).click();
        return this;
    }

    @Step("Проверка, что статус стал done")
    public void checkDoneStatus(String status) {
        taskPageElements.getStatus().lastChild().shouldHave(text(status));
    }
}

package jira_tests.page_object.steps;

import io.qameta.allure.Step;
import jira_tests.page_object.elements.CreateIssueComponentElements;

public class CreateIssueComponentSteps {

    CreateIssueComponentElements createIssueComponentElements = new CreateIssueComponentElements();

    @Step("Выбор проекта")
    public CreateIssueComponentSteps chooseProjectInput() {
        createIssueComponentElements.getChooseProjectInput().setValue("Test (TEST)").pressEnter();
        return this;
    }

    @Step("Выбор типа создаваемого таска")
    public CreateIssueComponentSteps chooseIssueTypeInput() {
        createIssueComponentElements.getChooseIssueTypeInput().setValue("Ошибка").pressEnter();
        return this;
    }

    @Step("Ввод summary")
    public CreateIssueComponentSteps setSummary(String summary) {
        createIssueComponentElements.getSummaryInput().setValue(summary);
        return this;
    }

    @Step("Переход на режим ввобда текста описания")
    public CreateIssueComponentSteps clickSetDescriptionTextButton() {
        createIssueComponentElements.getChooseSetDescriptionTextButton().click();
        return this;
    }

    @Step("Ввод description")
    public CreateIssueComponentSteps setDescription(String description) {
        createIssueComponentElements.getDescriptionTextArea().setValue(description);
        return this;
    }

    @Step("Клик на кнопку создания таски")
    public void createIssue() {
        createIssueComponentElements.getCreateIssueButton().click();
    }
}

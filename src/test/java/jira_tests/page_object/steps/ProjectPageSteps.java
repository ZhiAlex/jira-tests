package jira_tests.page_object.steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import jira_tests.config.UrlConfig;
import jira_tests.page_object.elements.ProjectPageElements;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class ProjectPageSteps {

    ProjectPageElements projectPageElements = new ProjectPageElements();
    UrlConfig config = ConfigFactory.create(UrlConfig.class, System.getProperties());

    @Step("Получение уоличества тасков")
    public SelenideElement getTasksAmount() {
        return projectPageElements.getTasksAmount();
    }

    @Step("Открытие полного списка тасков")
    public ProjectPageSteps showAllTasks(){
        projectPageElements.getShowAllTasksButton().scrollTo().click();
        return this;
    }

    @Step("Получение всех тасков")
    public ElementsCollection getTasks() {
        return projectPageElements.getTasks();
    }

    @Step("Открытие страницы")
    public void openPage() {
        open(config.projectPageUrl());
    }

    @Step("Поиск таска по названию")
    public SelenideElement searchTaskByName(String taskName) {
        return $x("//span[text()='" + taskName + "']").parent().parent().$("a");
    }

    @Step("Открытие таска")
    public void openTask() {
        $(".ghx-key-group a").click();
    }

    @Step("Проверка количества тасков")
    public void checkTasksAmount(int tasksAmount, int tasksLength) {
        Assertions.assertEquals(tasksAmount, tasksLength);
    }
}

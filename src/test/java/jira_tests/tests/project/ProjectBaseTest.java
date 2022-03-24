package jira_tests.tests.project;

import com.github.javafaker.Faker;
import jira_tests.BaseTest;
import jira_tests.page_object.steps.CreateIssueComponentSteps;
import jira_tests.page_object.steps.HeaderComponentSteps;
import jira_tests.page_object.steps.ProjectPageSteps;
import jira_tests.page_object.steps.TaskPageSteps;
import org.junit.jupiter.api.BeforeEach;

public class ProjectBaseTest extends BaseTest {

    HeaderComponentSteps headerComponentsSteps = new HeaderComponentSteps();
    CreateIssueComponentSteps issueComponentsSteps = new CreateIssueComponentSteps();
    TaskPageSteps taskPageSteps = new TaskPageSteps();
    ProjectPageSteps projectPageSteps = new ProjectPageSteps();
    Faker faker = new Faker();

    @BeforeEach
    void login() {
        projectPageSteps.openPage();
        authPageSteps.login();
    }
}

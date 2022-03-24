package jira_tests.tests.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PassBugStatusesTest extends ProjectBaseTest {

    @Test
    @DisplayName("Check the passage of the bug for all statuses")
    public void passBugStatusesTest() {

        headerComponentsSteps.createIssue();

        String summary = faker.book().author() + " " + faker.numerify("######");
        String status = "Done";

        issueComponentsSteps
                .chooseProjectInput()
                .chooseIssueTypeInput()
                .setSummary(summary)
                .clickSetDescriptionTextButton()
                .setDescription(faker.beer().name())
                .createIssue();

        projectPageSteps.searchTaskByName(summary).click();
        projectPageSteps.openTask();

        taskPageSteps
                .clickWorkflow()
                .chooseStatus(status)
                .checkDoneStatus(status);
    }
}

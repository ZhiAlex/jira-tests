package jira_tests.tests.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckTasksAmountTest extends ProjectBaseTest {

    @Test
    @DisplayName("Check amount of tasks")
    void checkTasksAmountTest() {

        int tasksAmount = Integer.parseInt(projectPageSteps.getTasksAmount().getText().split(" ")[0]);
        int tasksLength = projectPageSteps.getTasks().toArray().length;

        projectPageSteps.checkTasksAmount(tasksAmount, tasksLength);
    }
}

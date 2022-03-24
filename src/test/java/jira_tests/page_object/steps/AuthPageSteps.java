package jira_tests.page_object.steps;

import io.qameta.allure.Step;
import jira_tests.config.AuthConfig;
import jira_tests.page_object.elements.AuthPageElements;
import org.aeonbits.owner.ConfigFactory;

public class AuthPageSteps {

    AuthPageElements authPageElements = new AuthPageElements();

    @Step("Авторизация")
    public void login() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        authPageElements.getLoginInput().setValue(config.username());
        authPageElements.getPasswordInput().setValue(config.password()).pressEnter();
    }
}

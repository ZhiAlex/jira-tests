package jira_tests.page_object.elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class AuthPageElements {
    private SelenideElement
            loginInput = $x("//input[@id='login-form-username']"),
            passwordInput = $x("//input[@id='login-form-password']");
}

package jira_tests.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:page_url.properties"})
public interface UrlConfig extends Config {
    @Key("project_page") String projectPageUrl();
}

package co.com.choucair.BanistmoReto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/retoBanistmo.feature",
        tags = "@stories",
        glue = "co.com.choucair.BanistmoReto.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
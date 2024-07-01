package cucumberrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/report.html"},features="src/test/java/featurepack",glue="cucumberpack")
public class Runner {

}

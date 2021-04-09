package Sarah;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Sarah.feature",
glue = {""}, tags = "@Sarah",
monochrome = true, 
dryRun = false)
public class SarahTeste {

}



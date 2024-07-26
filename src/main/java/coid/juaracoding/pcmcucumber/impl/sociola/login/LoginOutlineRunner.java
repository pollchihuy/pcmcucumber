package coid.juaracoding.pcmcucumber.impl.sociola.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/features/001LoginPositif.feature",
//		"src/main/resources/features/002LoginNegatif.feature",
		"src/main/resources/features/011InputRegistrasiPositif.feature",
		"src/main/resources/features/014VerifikasiPositif.feature",
		},
glue = "coid.juaracoding.pcmcucumber.impl.sociola.login",
monochrome=true,
plugin = {"pretty","html:sociola-report/extentreport/sociola.html",
		"json:sociola-report/extentreport/sociola.json",
		"junit:sociola-report/extentreport/sociola.xml"})
public class LoginOutlineRunner extends AbstractTestNGCucumberTests{}
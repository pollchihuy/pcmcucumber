package coid.juaracoding.pcmcucumber.impl.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/features/001LoginPositif.feature",
		"src/main/resources/features/002LoginNegatif.feature"
		},
glue = "com.juaracoding.pcmautomation.cucumber.practicetestautomation.impl",
monochrome=true,
plugin = {"pretty","html:practiceautomation-report/extentreport/LoginRunnerOutline.html",
		"json:practiceautomation-report/extentreport/LoginRunnerOutline.json",
		"junit:practiceautomation-report/extentreport/LoginRunnerOutline.xml"})
public class LoginOutlineRunner extends AbstractTestNGCucumberTests{}
package br.com.inmetrics.testetecnico.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "classpath:features",
	glue = {"br/com/inmetrics/testetecnico/steps"},
	//tags= {"@cadastroFuncionario, @alterandoFuncionario, @excluir"},
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
	monochrome = true,
	dryRun = false)
         
	public class testRunner {
	
	@AfterClass
	public static void  ExtentReport() {
		Reporter.loadXMLConfig(new File("config/extension-config.xml"));
	
	}

}

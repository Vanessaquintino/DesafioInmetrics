package br.com.inmetrics.testetecnico.steps;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.inmetrics.testetecnico.pageManager.Generator;
import br.com.inmetrics.testetecnico.pageManager.driverObject;

import cucumber.api.Scenario;
import cucumber.api.java.After;

    public class Hooks {

	public WebDriver driver;
	
	 @After(order =0)
	public void finaliza() {

		driverObject.fechandoDriver();
	}

	@After(order = 1)
	public void finalizarreport(Scenario scenario) throws Exception, MalformedURLException {
		
		File screenshot = ((TakesScreenshot) driverObject.inicializaDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + scenario.getName() + "-"
				+ Generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}
}

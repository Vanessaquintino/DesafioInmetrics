package br.com.inmetrics.testetecnico.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.inmetrics.testetecnico.pageManager.Generator;
import br.com.inmetrics.testetecnico.pageManager.driverObject;
import br.com.inmetrics.testetecnico.pageObject.alterandoCadastroPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class alteracaoSteps {
	
	public WebDriver driver;
	public alterandoCadastroPage page;
	@Before
	public void Driver() {
	 /* iniciando o driver */
		driver = driverObject.inicializaDriver();
		page = new alterandoCadastroPage(driverObject.inicializaDriver());
	}
	
	
	@Dado("^quando eu eu estiver logado$")
	public void quando_eu_eu_estiver_logado() throws Throwable {
		page.usuario().sendKeys("vanessa@gmail.com");
		page.senha().sendKeys("123456");
		page.btn_entrar().click();
	 
	}
	
	@Quando("^eu pesquisar o funcionario$")
	public void eu_pesquisar_o_funcionario() throws Throwable {
		page.dash_pesquisar().sendKeys("Vanessa Quirino");
	   
	}

	@Quando("^clicar em alterar cadastro$")
	public void clicar_em_alterar_cadastro() throws Throwable {
		page.btn_alterar().click();
		page.alterandoocargo().clear();
		page.alterandoocargo().sendKeys("Analista junior");
		page.btn_enviar().click();
	   
	}

	@Entao("^o cadastro sera alterado com realizado com sucesso$")
	public void o_cadastro_sera_alterado_com_realizado_com_sucesso() throws Throwable {
		String alteradocomsucesso = page.mensagemdesucesso().getText();
		Assert.assertTrue(alteradocomsucesso.contains("SUCESSO! Informações atualizadas com sucesso"));
		
	}
}

	





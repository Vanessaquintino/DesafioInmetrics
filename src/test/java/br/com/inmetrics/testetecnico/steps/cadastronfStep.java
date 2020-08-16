package br.com.inmetrics.testetecnico.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.inmetrics.testetecnico.pageManager.Generator;
import br.com.inmetrics.testetecnico.pageManager.driverObject;
import br.com.inmetrics.testetecnico.pageObject.cadastroNovoFuncPage;
import br.com.inmetrics.testetecnico.pageObject.alterandoCadastroPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class cadastronfStep {
	
	public WebDriver driver;
	public cadastroNovoFuncPage funcionario;
	//public WebDriverWait wait;
	
	@Before
	public void Driver() {
	 /* iniciando o driver */
		driver = driverObject.inicializaDriver();
		funcionario = new cadastroNovoFuncPage(driverObject.inicializaDriver());
	}
	
	@Dado("^quando eu eu estiver logado com meu usuario$")
	public void quando_eu_eu_estiver_logado_com_meu_usuario() throws Throwable {
		funcionario.usuario().sendKeys("vanessa@gmail.com");
		funcionario.senha().sendKeys("123456");
		funcionario.btn_entrar().click();
	 
	}

	@Quando("^eu preencher o cadastro do funcionario$")
	public void eu_preencher_o_cadastro_do_funcionario() throws Throwable {
		funcionario.btn_NovoFunc().click();
		funcionario.nome().sendKeys("Vanessa Quirino");
		funcionario.cargo().sendKeys("QA");
		funcionario.cpf().sendKeys("119.858.386-05");
		funcionario.salario().sendKeys("5.000,00");
		funcionario.sexo().click();
		funcionario.sexo_seletor().click();
		funcionario.clt().click();
		funcionario.admissao().sendKeys("12/08/2020");
		funcionario.btn_enviar().click();
	}

	@Entao("^o cadastro sera realizado com sucesso$")
	public void o_cadastro_sera_realizado_com_sucesso() throws Throwable {
		String cadastrorealizadocomsucesso = funcionario.cadastrorealizadocomsucesso().getText();
		Assert.assertTrue(cadastrorealizadocomsucesso.contains("Nome"));
	}
}
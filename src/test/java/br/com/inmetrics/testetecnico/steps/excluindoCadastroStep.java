package br.com.inmetrics.testetecnico.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.inmetrics.testetecnico.pageManager.Generator;
import br.com.inmetrics.testetecnico.pageManager.driverObject;
import br.com.inmetrics.testetecnico.pageObject.cadastroNovoFuncPage;
import br.com.inmetrics.testetecnico.pageObject.excluindoCadastroPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class excluindoCadastroStep {

	public WebDriver driver;
	public excluindoCadastroPage page;
	//public WebDriverWait wait;
	
	@Before
	public void Driver() {
	 /* iniciando o driver */
		driver = driverObject.inicializaDriver();
		page = new excluindoCadastroPage(driverObject.inicializaDriver());
	}
	
	@Dado("^quando eu eu estiver logado na pagina principal$")
	public void quando_eu_eu_estiver_logado_na_pagina_principal() throws Throwable {
		page.usuario().sendKeys("vanessa@gmail.com");
		page.senha().sendKeys("123456");
		page.btn_entrar().click();
	}
	@Quando("^eu clicar em pesquisar o funcionario$")
	public void eu_clicar_em_pesquisar_o_funcionario() throws Throwable {
		page.dash_pesquisar().sendKeys("Vanessa Quirino");

	}
	@Quando("^clicar em excluir$")
	public void eu_clicar_em_excluir() throws Throwable {
		page.btn_excluir().click();

	}
	@Entao("^o cadastro sera excluido com sucesso$")
	public void o_cadastro_sera_excluido_com_sucesso() throws Throwable {
		String cadastrorealizadocomsucesso = page.mensagemdesucessoderemovido().getText();
		Assert.assertTrue(cadastrorealizadocomsucesso.contains("SUCESSO! Funcionário removido com sucesso"));
		}
	}
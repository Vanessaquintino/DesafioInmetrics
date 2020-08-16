package br.com.inmetrics.testetecnico.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cadastroNovoFuncPage {
	
	private WebDriver driver;
	

	 public cadastroNovoFuncPage(WebDriver driver) {
		 this.driver = driver;

	 }

	 
	 public WebElement usuario() {

		 WebElement dash_usuario = driver.findElement(By.name("username")); 

		 return dash_usuario;
		 
		}
	public WebElement senha() {

		 WebElement dash_senha = driver.findElement(By.name("pass")); 

		 return dash_senha;
		 
		}
	public WebElement btn_entrar() {

		 WebElement btn__entrar = driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[6]/button")); 

		 return btn__entrar;
	}
	public WebElement btn_NovoFunc() {

		 WebElement btn_NovoFunc = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")); 

		 return btn_NovoFunc;
	}
	
	public WebElement nome() {

		 WebElement nome  = driver.findElement(By.id("inputNome")); 

		 return nome ;
	}
	public WebElement cpf() {

		 WebElement cpf  = driver.findElement(By.id("cpf")); 

		 return cpf ;
	}
	public WebElement cargo() {

		 WebElement cargo  = driver.findElement(By.id("inputCargo")); 

		 return cargo ;
	}
	public WebElement salario() {

		 WebElement salario  = driver.findElement(By.id("dinheiro")); 

		 return salario ;
	}
	public WebElement sexo () {

		 WebElement  sexo = driver.findElement(By.id("slctSexo")); 

		 return sexo;
	}
	public WebElement sexo_seletor() {

		 WebElement  sexo_seletor= driver.findElement(By.xpath("//*[@id=\"slctSexo\"]/option[2]")); 

		 return sexo_seletor;
	}
	public WebElement clt() {

		 WebElement  clt = driver.findElement(By.id("clt")); 

		 return clt;
		 
	}
	public WebElement admissao() {

		 WebElement admissao = driver.findElement(By.id("inputAdmissao")); 

		 return admissao;
	}
	public WebElement btn_enviar() {

	 WebElement btn_enviar = driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/input")); 

	 return btn_enviar;
	}
	public WebElement cadastrorealizadocomsucesso() {

		 WebElement cadastrorealizadocomsucesso = driver.findElement(By.xpath("//*[@id=\"tabela\"]/thead/tr/th[1]")); 

		 return cadastrorealizadocomsucesso;
	}
}
	 
	 
	 
	 
	 
	 
	 

package br.com.inmetrics.testetecnico.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class alterandoCadastroPage {

	private WebDriver driver;
	

	 public alterandoCadastroPage(WebDriver driver) {
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
	public WebElement dash_pesquisar() {

		 WebElement dash_pesquisar = driver.findElement(By.xpath("//*[@id=\"tabela_filter\"]/label/input")); 

		 return dash_pesquisar;
	}
	public WebElement btn_alterar() {

		 WebElement btn_alterar = driver.findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[2]/button")); 

		 return btn_alterar;
	}
	public WebElement alterandoocargo() {

		 WebElement cargo  = driver.findElement(By.id("inputCargo")); 

		 return cargo ;
	}
	public WebElement btn_enviar() {

		 WebElement btn_enviar = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/input")); 

		 return btn_enviar;
	}
	public WebElement mensagemdesucesso() {

		 WebElement mensagemdesucesso = driver.findElement(By.xpath("/html/body/div/div[1]/div")); 

		 return mensagemdesucesso;
	}



}

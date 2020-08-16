package br.com.inmetrics.testetecnico.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class excluindoCadastroPage {
	
	private WebDriver driver;
	

	 public excluindoCadastroPage(WebDriver driver) {
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
	public WebElement btn_excluir() {

		 WebElement  btn_excluir = driver.findElement(By.id("delete-btn")); 

		 return btn_excluir;
	}
	public WebElement mensagemdesucessoderemovido () {

	 WebElement  mensagemdesucessoderemovido = driver.findElement(By.xpath("/html/body/div/div[1]/div")); 

	 return mensagemdesucessoderemovido ;
}
	
}

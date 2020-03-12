package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	private WebDriver navegador;
	
	public LoginPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public void LoginWeb(String usuario, String senha) {
		
		inserirUsuario(usuario);
		inserirSenha(senha);
		btnEntrar();
	}
	public LoginPage inserirUsuario(String usuario) {
		
		WebElement login = navegador.findElement(By.id("edt_login"));
		login.sendKeys(usuario);
		login.sendKeys(Keys.ENTER);
		return new LoginPage(navegador);
	}
	
	public LoginPage inserirSenha(String senha) {
		
		WebElement login = navegador.findElement(By.id("edt_senha"));
		login.sendKeys(senha);
		login.sendKeys(Keys.ENTER);
		return new LoginPage(navegador);
		
	}
	
	public void btnEntrar() {
		
		navegador.findElement(By.xpath("//input[@id='bt-entrar']")).click();
	}
}

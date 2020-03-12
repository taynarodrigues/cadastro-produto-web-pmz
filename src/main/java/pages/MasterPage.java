package pages;

import org.openqa.selenium.WebDriver;

public class MasterPage {

	private LoginPage loginPage;
	private CadastroProdutoPage cadastroProduto;

	
	public MasterPage(WebDriver navegador) {
		
		this.loginPage = new LoginPage(navegador);
		this.cadastroProduto = new CadastroProdutoPage(navegador);
		

	}
	
	public LoginPage getLoginPage() {
		return loginPage;
	}
	
	public CadastroProdutoPage getCadastroProdutoPage() {
		return cadastroProduto;
	}
	

		

}

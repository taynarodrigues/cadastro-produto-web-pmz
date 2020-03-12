package Aleatorio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.MasterPage;
import suporte.Web;

public class CadastroProdutoTest {

	private WebDriver navegador;
	private MasterPage masterPage;
	
	
	@Before
	public void setUp() {
		navegador = Web.createChrome("http://192.168.150.116/pemaza/login.php");
		masterPage = new MasterPage(navegador);
		masterPage.getLoginPage().LoginWeb("teste", "1234");
	}
	
	@After
	public void tearDown() {
		
		navegador.quit();	
	}
	
	@Test
	public void abaCadastro(){
		
		masterPage.getCadastroProdutoPage().iconeCarrinhoCompras();
		masterPage.getCadastroProdutoPage().abaCadastro();
	}
	
}

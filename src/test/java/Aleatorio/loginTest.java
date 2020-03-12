package Aleatorio;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.MasterPage;
import suporte.Web;

public class loginTest {

	private WebDriver navegador;
	private MasterPage masterPage;
	
	@Before
	public void setUp() {
		navegador = Web.createChrome("http://192.168.150.116/pemaza/login.php");
		masterPage = new MasterPage(navegador);
		
	}
	
	@After
	public void tearDown() {
		
		navegador.quit();	
	}
	
	@Ignore
	@Test
	public void loginWeb() {
		masterPage.getLoginPage().LoginWeb("teste", "1234");
	}
}

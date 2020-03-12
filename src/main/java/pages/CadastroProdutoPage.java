package pages;

import static org.hamcrest.CoreMatchers.containsString;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroProdutoPage {

	private WebDriver navegador;
	private Actions act;
	private WebDriverWait e;

	public CadastroProdutoPage(WebDriver navegador) {
		this.navegador = navegador;
		this.act = new Actions(navegador);
		e = new WebDriverWait(navegador, 10);
	}

	private void esperaLoading() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e.until(ExpectedConditions.invisibilityOfElementLocated(By.className("general-loading")));
	}

	public void iconeCarrinhoCompras() {

		navegador.findElement(By.xpath("//a[contains(text(),'Compras')]")).click();
	}

	public void abaCadastro() {

		WebElement aba = navegador.findElement(By.xpath("//td[3]//a[1]"));
		act.moveToElement(aba).click().build().perform();

		navegador.findElement(By.xpath("//a[contains(text(),'Cadastro Produto')]")).click();
	}
}

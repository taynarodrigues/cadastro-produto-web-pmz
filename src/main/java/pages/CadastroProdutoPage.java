package pages;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ProdutoUtil;

public class CadastroProdutoPage {

	private WebDriver navegador;
	private Actions act;
	private WebDriverWait e;

	public CadastroProdutoPage(WebDriver navegador) {
		this.navegador = navegador;
		this.act = new Actions(navegador);
		e = new WebDriverWait(navegador, 5);
	}

	private void esperaLoading() {

		try {
			Thread.sleep(500);
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
	
	public void editarItem(String posicao) {
		
		navegador.findElement(By.xpath("/html[1]/body[1]/div[11]/fieldset[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr["+ posicao +"]")).click();
		
		navegador.findElement(By.xpath("//div[contains(text(),'EDIT')]")).click();
	}
	
	
	public void preencherDadosProduto() {

		esperaLoading();
		Map<String, String> map = ProdutoUtil.getDadosProduto();
		for(String xpath: map.keySet()) {
			esperaLoading();
			navegador.findElement(By.xpath("//input[@id='"+ xpath +"']")).sendKeys(map.get(xpath));
		}
	}

	public void pesquisaLupa() {
		
		esperaLoading();
		navegador.findElement(By.xpath("//button[@id='pesquisa_cest']")).click();
	}
	
	public void fecharAba() {
		
		navegador.findElement(By.xpath("//body/div[50]/div[3]/div[1]/button[1]/span[1]")).click();
	}
}

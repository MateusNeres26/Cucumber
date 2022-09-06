package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	WebDriver driver;

	final String PRODUTO_BUSCA = "//span[contains(text(),'Apple iPhone 13 (128 GB) - Meia-noite')]";
	final String PRECO_PRODUTO = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='gsod_singleOfferDisplay_Desktop']/div[@id='qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[2]/span[2]";

	public ResultadoBuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarProduto() {
		driver.findElement(By.xpath(PRODUTO_BUSCA)).click();
	}

	public String retornarValorProduto() {

		return driver.findElement(By.xpath(PRECO_PRODUTO)).getText();
	}

}

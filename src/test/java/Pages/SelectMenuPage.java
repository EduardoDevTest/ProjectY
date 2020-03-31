package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectMenuPage {

	private WebDriver navegador;

	public SelectMenuPage(WebDriver navegador) {
		super();
		this.navegador = navegador;
	}


	public PreencherOportunidadePageOne selecionarMenu() {
		WebElement menu = navegador
				.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[1]/div/div[1]/div/span"));
		menu.click();
		Actions actions = new Actions(navegador);
		actions.moveToElement(menu).perform();
		navegador.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/div[3]/div/div/span[2]")).click();

		return new PreencherOportunidadePageOne(navegador);

	}

}

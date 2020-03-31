package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PreencherOportunidadePageTree {

	private WebDriver navegador;
	public PreencherOportunidadePageTree(WebDriver navegador) {
		// TODO Auto-generated constructor stub
	}

	
	@Test
	public PreencherOportunidadePageTree clickOportunidades3() {

		WebElement oportunidades = navegador.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD"));
		oportunidades.click();
		return this; 
	}

	@Test
	public PreencherOportunidadePageTree preencheNome3() {
		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Jeverson Next analisty");
		return this;
	}

	@Test
	public void preencherContato3() {
		navegador.findElement(By.id("contact_id_display")).sendKeys("Karol");

	}

	@Test
	public PreencherOportunidadePageTree preenche3() {
		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("viicius ");
		return this;
	}

	@Test
	public PreencherOportunidadePageTree preencheSkil3() {
		navegador.findElement(By.id("contact_id_display")).sendKeys("jackson");
		return this;
	}

	@Test
	public PreencherOportunidadePageTree preencheValor3() {
		navegador.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("90.000");
		return this;
	}

	@Test
	public PreencherOportunidadePageTree preencheCargo3() {

		navegador.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("Analista de auotmação");
		return this;
	}

	@Test
	public PreencherOportunidadePageTree data3() {

		WebElement data = navegador.findElement(By.id("Potentials_editView_fieldName_closingdate"));
		Actions a = new Actions(navegador);
		a.moveToElement(data).click().build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement dia = navegador.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr[5]/td[7]"));
		a.moveToElement(dia).click().build().perform();
		return this;
	}

	@Test
	public PreencherOportunidadePageTree modalidade3() {

		WebElement opcaoSelect = navegador.findElement(By.id("select2-chosen-8"));
		Actions analise = new Actions(navegador);
		analise.moveToElement(opcaoSelect).click().sendKeys("Analise Percepção").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		navegador.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[3]/div/div/button")).click();
		return this;

}
}
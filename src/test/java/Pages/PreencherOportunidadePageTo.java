package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PreencherOportunidadePageTo {

	private WebDriver navegador;

	public PreencherOportunidadePageTo(WebDriver navegador) {
		super();
		this.navegador = navegador;
	}

	@Test

	public PreencherOportunidadePageTo clickOportunidade2() throws InterruptedException {
		Thread.sleep(3000);
		WebElement oportunidades = navegador.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD"));
		oportunidades.click();

		return this;
	}

	@Test
	public PreencherOportunidadePageTo preencheNome2() {
		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Bill Testador");
		return this;

	}

	@Test
	public PreencherOportunidadePageTo preencherContato2() {
		navegador.findElement(By.id("contact_id_display")).sendKeys("dev teste");
		return this;
	}

	@Test
	public PreencherOportunidadePageTo preenche2() {
		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Silva TestaGeraldo");
		return this;
	}

	@Test
	public PreencherOportunidadePageTo preencheSkill2() {
		navegador.findElement(By.id("contact_id_display")).sendKeys("Tester");
		return this;
	}

	@Test
	public PreencherOportunidadePageTo preencheValor2() {
		navegador.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("100.000");
		return this;
	}

	@Test
	public PreencherOportunidadePageTo preencheCargo2() {

		navegador.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("Qa engineer");
		return this;
	}

	@Test
	public PreencherOportunidadePageTo data2() {

		WebElement data = navegador.findElement(By.id("Potentials_editView_fieldName_closingdate"));
		Actions a = new Actions(navegador);
		a.moveToElement(data).click().build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement dia = navegador.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr[5]/td[7]"));
		a.moveToElement(dia).click().build().perform();

		return this;

	}

	@Test
	public PreencherOportunidadePageTree modalidade2() {

		WebElement opcaoSelect = navegador.findElement(By.id("select2-chosen-8"));
		Actions analise = new Actions(navegador);
		analise.moveToElement(opcaoSelect).click().sendKeys("Analise Percepção").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		navegador.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[3]/div/div/button")).click();

		return new PreencherOportunidadePageTree(navegador);

	}


}

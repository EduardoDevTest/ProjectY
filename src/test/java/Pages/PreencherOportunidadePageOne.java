package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PreencherOportunidadePageOne {

	private WebDriver navegador;

	public PreencherOportunidadePageOne(WebDriver navegador) {
		super();
		this.navegador = navegador;
	}

	@Test
	public PreencherOportunidadePageOne clickOportunidades() {

		WebElement oportunidades = navegador.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD"));
		oportunidades.click();
		return this;

	}

	@Test
	public PreencherOportunidadePageOne preencheNome() {
		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Steve jobs da silva");
		return this;

	}

	@Test
	public PreencherOportunidadePageOne preencherContato() {
		navegador.findElement(By.id("contact_id_display")).sendKeys("Oswaldo Rocha");
		return this;

	}

	@Test
	public PreencherOportunidadePageOne preenche() {
		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Steve jobs da silva");
		return this;

	}

	@Test
	public PreencherOportunidadePageOne preencheSkil() {
		navegador.findElement(By.id("contact_id_display")).sendKeys("dev teste");
		return this;

	}

	@Test
	public PreencherOportunidadePageOne preencheValor() {
		navegador.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("80.000");
		return this;

	}

	@Test
	public PreencherOportunidadePageOne preencheCargo() {
		navegador.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("Analise de um Engenheiro");
		return this;

	}

	@Test
	public PreencherOportunidadePageOne data() {

		WebElement data = navegador.findElement(By.id("Potentials_editView_fieldName_closingdate"));
		Actions a = new Actions(navegador);
		a.moveToElement(data).click().build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement dia = navegador.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr[5]/td[7]"));
		a.moveToElement(dia).click().build().perform();
		return this;

	}

	@Test
	public PreencherOportunidadePageTo modalidade() {

		WebElement opcaoSelect = navegador.findElement(By.id("select2-chosen-8"));
		Actions analise = new Actions(navegador);
		analise.moveToElement(opcaoSelect).click().sendKeys("Analise Percepção").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[3]/div/div/button")).click();

		return new PreencherOportunidadePageTo(navegador);

	}
	

}

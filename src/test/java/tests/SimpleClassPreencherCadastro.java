package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleClassPreencherCadastro {


	@Test
	public void cadastro() throws InterruptedException {
		System.setProperty("Webdriver.gecko.driver", "C:\\driver");
		WebDriver navegador = new FirefoxDriver();
		navegador.get("http://startupflex.com.br/crm/");
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		navegador.findElement(By.id("username")).sendKeys("Eduardo Barbosa");
		navegador.findElement(By.id("password")).sendKeys("5678");
		WebElement seletor = navegador
				.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[3]/button"));
		seletor.click();
	
		WebElement menu = navegador
				.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[1]/div/div[1]/div/span"));
		menu.click();
		Actions actions = new Actions(navegador);
		actions.moveToElement(menu).perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/div[3]/div/div/span[2]")).click();

		Thread.sleep(3000);
		WebElement oportunidades = navegador.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD"));
		oportunidades.click();

		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Steve jobs da silva");

		navegador.findElement(By.id("contact_id_display")).sendKeys("dev teste");

		navegador.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("80.000");

		navegador.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("Analise de um Engenheiro");

		Thread.sleep(3000);
		WebElement data = navegador.findElement(By.id("Potentials_editView_fieldName_closingdate"));
		Actions a = new Actions(navegador);
		a.moveToElement(data).click().build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement dia = navegador.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr[5]/td[7]"));
		a.moveToElement(dia).click().build().perform();
		WebElement opcaoSelect = navegador.findElement(By.id("select2-chosen-8"));
		Actions analise = new Actions(navegador);
		analise.moveToElement(opcaoSelect).click().sendKeys("Analise Percepção").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		navegador.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[3]/div/div/button")).click();

		Thread.sleep(3000);
		navegador.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement oportunidadesDois = navegador.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD"));
		oportunidadesDois.click();

		navegador.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		navegador.findElement(By.id("Potentials_editView_fieldName_potentialname"))
				.sendKeys("Analista de automação de testes");

		navegador.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		navegador.findElement(By.id("contact_id_display")).sendKeys("Marcos Barbosa");

		navegador.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("100.000");

		navegador.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("Analise de teste");

		WebElement data2 = navegador.findElement(By.id("Potentials_editView_fieldName_closingdate"));
		Actions a2 = new Actions(navegador);
		a2.moveToElement(data2).click().build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement dia2 = navegador.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr[5]/td[7]"));
		a2.moveToElement(dia2).click().build().perform();

		WebElement opcaoSelect2 = navegador.findElement(By.id("select2-chosen-8"));
		Actions analise2 = new Actions(navegador);
		analise2.moveToElement(opcaoSelect2).click().sendKeys("Analise Percepção").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		navegador.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[3]/div/div/button")).click();

	}
}

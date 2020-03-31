package Suport;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {

	public static WebDriver iniciar() {
		//ABERTURA DE NAVEGADOR
		System.setProperty("Webdriver.gecko.driver", "C:\\driver");
		WebDriver navegador = new FirefoxDriver();
		
		//ABERTURA DE PAGINA
		navegador.get("http://startupflex.com.br/crm/");
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return navegador;
	}

}
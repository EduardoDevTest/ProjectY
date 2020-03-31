package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {
	
	private WebDriver navegador; 
	
	public Login(WebDriver navegador) {
		super();
		this.navegador = navegador;
	}
	
	
	public Login digitarLogin(String usuario){
		navegador.findElement(By.id("username")).sendKeys(usuario);
	return this;
	
	}
	
	//5678
	public 	SelectMenuPage digitarsenha(String senha) {
		navegador.findElement(By.id("password")).sendKeys(senha);

		WebElement seletor = navegador.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[3]/button"));
		seletor.click();
		
		return new SelectMenuPage(navegador);

	}

}



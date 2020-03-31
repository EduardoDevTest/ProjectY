package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sun.xml.bind.unmarshaller.DatatypeDeserializer;

import Pages.Login;
import Suport.Web;


//@RunWith(DataDrivenTestRunner)
@DataLoader(filePaths = "informacoesTestesData.csv")

public class RunnerTestsPage {
	private WebDriver navegador;
	
	String Nome ="Eduardo Barbosa";
	String Senha= "5678";
	
	@Before
	public void SetUp() {
		navegador = Web.iniciar();
	}

	@Test
	public void realizarcadastroOportunidade() throws InterruptedException {
		new Login(navegador)
		.digitarLogin(Nome)
		.digitarsenha(Senha)
		.selecionarMenu()
		.clickOportunidades()
		.preencheNome()
		.preencherContato()
		.preenche()
		.preencheSkil()
		.preencheValor()
		.preencheCargo()
		.data()
		.modalidade()
		
		//SEGUNDO CADASTRO
		.clickOportunidade2()
		.preencheNome2()
		.preencherContato2()
		.preenche2()
		.preencheSkill2()
		.preencheValor2()
		.preencheCargo2()
		.data2()
		.modalidade2();
	
		
		}
	
	@After
	public void fechar() {
		navegador.quit();

	}

}

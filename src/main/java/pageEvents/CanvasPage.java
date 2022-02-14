package pageEvents;

import pageObjects.CanvasPageElement;
import utils.ElementFetch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseTest.BaseTest;
public class CanvasPage {
	ElementFetch ef;
	public void designInCanvas() {
		ef=new ElementFetch();
		ef.getWebElement("XPATH", CanvasPageElement.draw_A_LineBtn).click();
		WebElement element=ef.getWebElement("XPATH", CanvasPageElement.canvasFrame);
		Actions builder= new Actions(BaseTest.driver);
		
		builder.moveToElement(element).perform();
//		builder.moveByOffset(0, -150);
		builder.moveToElement(element, 0, -150).click();
		builder.release();
		builder.moveToElement(element, -50, 100).perform();
		
	}
}

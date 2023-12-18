package webEx

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
//import webExLocator.MyntarLocator
import webExLocator.MyntraLocator


import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

public class AutomateMyntra {
	String size = "9";
	MyntraLocator locator = new MyntraLocator();

	def openBrowser() {
		WebUI.openBrowser("https://www.myntra.com/")
		WebUI.setText(locator.inputSearchProducts(),"shoes")
		WebUI.sendKeys(locator.inputSearchProducts(),Keys.chord(Keys.ENTER))
		WebUI.waitForElementPresent(locator.RadioButtonMen(), 10)
		WebUI.enhancedClick(locator.RadioButtonMen())
		WebUI.enhancedClick(locator.imageShoe())
		//		Thread.sleep(3000)
		WebUI.switchToWindowIndex(1)
		WebUI.enhancedClick(locator.buttonSizes(), FailureHandling.STOP_ON_FAILURE)
		//		List<WebElement> elements= WebUI.findWebElements(locator.buttonSizes(), 5, FailureHandling.STOP_ON_FAILURE)
		//		println(elements)

		//		for(WebElement ele : elements) {
		//			println(ele)
		//			println(ele.getText())
		//			if(ele.getText().equals(size)) {
		//				ele.click()
		//				break
		//			}
		//		}
		WebUI.enhancedClick(locator.buttonAddtoBag())
		WebUI.enhancedClick(locator.buttonBag())
		
	}
}

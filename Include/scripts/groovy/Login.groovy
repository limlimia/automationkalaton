import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User access login page")
	def access_loginPage() {
		WebUI.openBrowser('https://www.saucedemo.com/')
	}

	@When("User enter (.*) and (.*)")
	def fillData(String username, String password) {
		WebUI.setText(findTestObject('Sauce Demo Object/username_field'), username)
		WebUI.setText(findTestObject('Sauce Demo Object/password_field'), password)
	}

	@And("Click login button")
	def clickLogin() {
		WebUI.click(findTestObject('Sauce Demo Object/login_button'))
	}

	@Then("User directed to homepage")
	def verifyHomepage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/Products_Text'), 3)
	}
	
	@Then("User get error message")
	def verifyError() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/Products_Text'), 3)
	}
	
//	@DataTableType(replaceWithEmptyString = "[blank]")
//	public String stringType(String cell) {
//		return cell;
//	}
}
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

import io.cucumber.java.en.*
import io.cucumber.datatable.DataTable
//import io.cucumber.datatable.DataTableType
import java.util.HashMap
import java.util.List
import java.util.Map

public @interface DataTableType {

	/**
	 * Replace these strings in the Datatable with empty strings.
	 * <p>
	 * A data table can only represent absent and non-empty strings. By replacing
	 * a known value (for example [empty]) a data table can also represent
	 * empty strings.
	 * <p>
	 * It is not recommended to use multiple replacements in the same table.
	 *
	 * @return strings to be replaced with empty strings.
	 */
	String[] replaceWithEmptyString()
}

class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//
	
	String username, password
	
	@Given("User access login page")
	def access_loginPage() {
		WebUI.openBrowser('https://www.saucedemo.com/')
	}

	@When("User enter (.*) and (.*)")
	def fillData(String username, String password) {
		if(username=="[blank]") {
			WebUI.setText(findTestObject('Sauce Demo Object/username_field'), "")
		}else {
			WebUI.setText(findTestObject('Sauce Demo Object/username_field'), username)
		}
		if(password=="[blank]") {
			WebUI.setText(findTestObject('Sauce Demo Object/password_field'), "")
		}else {
			WebUI.setText(findTestObject('Sauce Demo Object/password_field'), password)
		}
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
		if(username=="[blank]") {
			WebUI.verifyTextPresent("Epic sadface: Username is required", false)
			printIn("Username NULL")
		}else if(password=="[blank]"){
			WebUI.verifyTextPresent("Epic sadface: Password is required", false)
			printIn("Password NULL")
		}else if(username!="[blank]" && password!="[blank]"){
			WebUI.verifyTextPresent("Epic sadface: Username and password do not match any user in this service", false)
			printIn("Username and Password mismatch")
		}
		
		//Need check logic username and password mismatch
	}
}
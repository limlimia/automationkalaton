import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [('Username') : 'standard_user', ('Password') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Add_cart_backpack'))

WebUI.scrollToElement(findTestObject('Sauce Demo Object/Page_Swag Labs/Add_cart_shirt'), 3)

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Add_cart_shirt'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Remove_shirt'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Cart'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Remove_item_cart'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/button_Continue Shopping'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Add_cart_backpack'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/Cart'))

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Sauce Demo Object/Page_Swag Labs/Firstname_field'), firstName)

WebUI.setText(findTestObject('Sauce Demo Object/Page_Swag Labs/Lastname_field'), lastName)

WebUI.setText(findTestObject('Sauce Demo Object/Page_Swag Labs/Postalcode_field'), postalCode)

WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/button_Continue'))

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/button_Finish'), 3, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/button_Cancel'))
    WebUI.click(findTestObject('Sauce Demo Object/Page_Swag Labs/button_Continue Shopping'))
	
} else if (WebUI.verifyElementPresent(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/button_Finish'), 3, FailureHandling.OPTIONAL) == true) {
    WebUI.scrollToElement(findTestObject('Sauce Demo Object/Page_Swag Labs/button_Finish'), 3)
    WebUI.click(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/button_Finish'))
    WebUI.click(findTestObject('Object Repository/Sauce Demo Object/Page_Swag Labs/button_Back Home'))
}

WebUI.delay(3)


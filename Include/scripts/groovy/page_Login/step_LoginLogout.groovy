package page_Login
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



class step_LoginLogout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to CMS Login Page")
	def User_navigate_to_CMS_Login_Page() {
		WebUI.openBrowser(null)
		WebUI.navigateToUrl(GlobalVariable.url_login)
		WebUI.delay(2)
		
	}

	@When("User enter username valid")
	def User_enter_username_valid() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/Website/Login/txt_username'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Website/Login/txt_username'), GlobalVariable.username_web)
		WebUI.delay(2)
		
	}

	@When("User enter password valid")
	def User_enter_password_valid() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/Website/Login/txt_password'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Website/Login/txt_password'), GlobalVariable.password_web)
		WebUI.delay(2)
		
	}

	@When("User click button login")
	def I_check_for_the_value_in_stepp() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/Website/Login/btn_login'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Website/Login/btn_login'))
		WebUI.delay(2)
		
	}

	@Then("User should be successfully logged in")
	def I_verify_the_status_in_step() {

		WebUI.verifyElementPresent(findTestObject('Website/Login/verify_loginSuccess'), 20, FailureHandling.STOP_ON_FAILURE)
		
	}
}
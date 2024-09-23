import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.cucumber.keyword.internal.CucumberGlueGenerator as CucumberGlueGenerator
import org.openqa.selenium.remote.DesiredCapabilities

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */

	/*
	 * @BeforeTestCase def beforeTestCase(TestCaseContext testCaseContext) {
	 * CucumberGlueGenerator.addDefaultPackages();
	 * 
	 * }
	 */
	@BeforeTestSuite
	def setup() {
		// Desired capabilities for mobile testing
		DesiredCapabilities capabilities = new DesiredCapabilities()

		// Add the capability to auto-grant permissions
		capabilities.setCapability("autoGrantPermissions", true)

	}
	
	@BeforeTestCase
	def setupp() {
		// Desired capabilities for mobile testing
		DesiredCapabilities capabilities = new DesiredCapabilities()

		// Add the capability to auto-grant permissions
		capabilities.setCapability("autoGrantPermissions", true)

	}
}
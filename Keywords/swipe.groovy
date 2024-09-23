import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption


public class swipe {
	
	@Keyword
	def swipeDown(int times) {

		for(int i=0 ; i<times ; i++) {


			// Get the size of the device screen
			def driver = MobileDriverFactory.getDriver()


			// Define swipe start and end points dynamically
			int startX = 500
			int startY = 500
			int endX = 500
			int endY = 500

			// Perform swipe action
			new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(endX, endX)).release().perform()
			
		}
	}
	
	
}

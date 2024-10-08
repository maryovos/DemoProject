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
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption
import com.kms.katalon.core.exception.StepFailedException
import io.appium.java_client.touch.WaitOptions
import java.time.Duration


public class utils {

	@Keyword
	def swipeDown(int times) throws StepFailedException {

		for(int i=0 ; i<times ; i++) {


			// Get the size of the device screen
			def driver = MobileDriverFactory.getDriver()

			def dimension = driver.manage().window().getSize()

			int screenWidth = dimension.width

			int screenHeight = dimension.height
			println("screenWidth = " + screenWidth)
			println("screenHeight = " + screenHeight)



			// Define swipe start and end points dynamically
			int startX = screenWidth / 2
			int startY = screenHeight * 3/4 // 3/4th down the screen
			int endX = screenWidth / 2
			int endY = (screenHeight * 1/4)     // 1/4th up the screen
			long duration = 1000 // Duration of the swipe in milliseconds


			// Create a new TouchAction instance
			TouchAction action = new TouchAction(driver)

			// Perform the swipe action with a wait
			action.press(PointOption.point(startX, startY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))) // Set duration here
					.moveTo(PointOption.point(endX, endY)) // Corrected endY
					.release()
					.perform()


			// Perform swipe action
			// new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(endX, endX)).release().perform()
		}
	}

	@Keyword
	def swipeDown_Dropdown(int times) throws StepFailedException {

		for(int i=0 ; i<times ; i++) {


			// Get the size of the device screen
			def driver = MobileDriverFactory.getDriver()

			def dimension = driver.manage().window().getSize()

			int screenWidth = dimension.width

			int screenHeight = dimension.height
			println("screenWidth = " + screenWidth)
			println("screenHeight = " + screenHeight)



			// Define swipe start and end points dynamically
			int startX = screenWidth / 2
			int startY = screenHeight * 3/5 // 3/4th down the screen
			int endX = screenWidth / 2
			int endY = (screenHeight * 3/5) - 100     // 1/4th up the screen




			// Perform swipe action
			//			new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction().moveTo(PointOption.point(endX, endX)).release().perform()
			new TouchAction(driver).press(PointOption.point(500, 1670)).waitAction().moveTo(PointOption.point(500, 1350)).release().perform()
		}
	}
}

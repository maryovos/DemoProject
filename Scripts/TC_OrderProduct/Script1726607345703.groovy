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

Mobile.startApplication('8a5194e5-36a8-4288-a531-9a7e3a7764f3', true)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/Tab_OptionMenu'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/MenuItem_LogIn'), 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Username input field'), 'bob@example.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeSecureTextField - Password input field'), 
    '10203040', 0)

Mobile.getText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - bobexample.com-autofill'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - bobexample.com-autofill'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Login button'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Sauce Labs Backpack'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Add To Cart button'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeButton - tab bar option cart'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Proceed To Checkout button'), 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Full Name input field'), 
    'Rebecca Winter', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Address Line 1 input field'), 
    '', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Address Line 1 input field'), 
    'Mandorley 12', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Address Line 2 input field'), 
    'Entrance 1', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - City input field'), 'Truro', 
    0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - StateRegion input field'), 
    'Cornwall', 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeButton - Return'), 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Zip Code input field'), '89750', 
    0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Country input field'), 'United Kingdom', 
    0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeButton - Return'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - To Payment button'), 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Full Name input field (1)'), 
    'Rebecca Winter', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Card Number input field'), 
    '', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Card Number input field'), 
    '123456789876543', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Expiration Date input field'), 
    '03/25', 0)

Mobile.setText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeTextField - Security Code input field'), 
    '123', 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeStaticText - Security Code'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Review Order button'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Review Order button'), 0)

Mobile.tap(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeOther - Place Order button'), 0)

Mobile.getText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeStaticText - Checkout Complete'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Object_iOS_SwagLab/XCUIElementTypeStaticText - Checkout Complete'), 
    'Checkout Complete')

Mobile.closeApplication()


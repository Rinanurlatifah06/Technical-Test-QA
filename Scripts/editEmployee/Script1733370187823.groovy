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

WebUI.click(findTestObject('Page_OrangeHRM/button_icon edit'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/h6_Personal Details'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Employee Full Name (1)'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Employee Id (1)'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Other Id'), 5)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Other Id'), '123')

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Drivers License Number'), 5)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Drivers License Number'), '456')

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_License Expiry Date'), 5)

WebUI.setText(findTestObject('Page_OrangeHRM/input_License Expiry Date'), '2025-01-01')

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Nationality'), 5)

WebUI.click(findTestObject('Page_OrangeHRM/i_-- Select_Nationality'))

WebUI.scrollToElement(findTestObject('Page_OrangeHRM/div_Indonesian'), 5)

WebUI.click(findTestObject('Page_OrangeHRM/div_Indonesian'))

WebUI.scrollToElement(findTestObject('Page_OrangeHRM/input_Drivers License Number'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Marital Status'), 5)

WebUI.click(findTestObject('Page_OrangeHRM/i_-- Select marital'))

WebUI.click(findTestObject('Page_OrangeHRM/div_Single'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Date of Birth'), 5)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Date of Birth'), '2000-01-01')

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Gender'), 5)

WebUI.click(findTestObject('Page_OrangeHRM/span_Male'))

WebUI.click(findTestObject('Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Success'), 5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Page_OrangeHRM/div_Nationality'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/h6_Custom Fields'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Blood Type'), 5)

WebUI.click(findTestObject('Page_OrangeHRM/i_-- Select blood type'))

WebUI.click(findTestObject('Page_OrangeHRM/div_A'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Test_Field'), 5)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Test_Field'), 'Test Edit')

WebUI.click(findTestObject('Page_OrangeHRM/button_Save (1)'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Success'), 5)

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)


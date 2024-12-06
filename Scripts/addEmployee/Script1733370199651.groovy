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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.click(findTestObject('Page_OrangeHRM/a_PIM'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_PIM'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/h5_Employee Information'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/button_Add'), 5)

WebUI.click(findTestObject('Page_OrangeHRM/button_Add'))

addEmployeeUrl = WebUI.getUrl()

WebUI.verifyMatch('https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee', addEmployeeUrl, false)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/h6_Add Employee'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/label_Employee Full Name'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Employee Id'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/button_Cancel'), 5)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/button_Save'), 5)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Full Name_firstName'), 'Testing')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Full Name_middleName'), 'QA')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Full Name_lastName'), 'Automation')

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Employee Id'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_OrangeHRM/input_Employee Id'), '12345')

filePath = (RunConfiguration.getProjectDir() + '\\Files\\foto.jpg')

WebUI.uploadFile(findTestObject('Page_OrangeHRM/button_Add Employee Picture'), filePath)

WebUI.click(findTestObject('Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Success'), 5)

WebUI.takeScreenshot()

WebUI.waitForPageLoad(5)


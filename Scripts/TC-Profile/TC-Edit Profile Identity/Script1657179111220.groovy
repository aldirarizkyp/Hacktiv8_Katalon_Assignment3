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

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('NavBar_Object/btn_Profile'), 0)

Mobile.tap(findTestObject('NavBar_Object/btn_Profile'), 0)

Mobile.waitForElementPresent(findTestObject('ProfilePage_Object/btn_EDIT'), 0)

Mobile.tap(findTestObject('ProfilePage_Object/btn_EDIT'), 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/RelativeLayout_Name'), 0)

Mobile.clearText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), name, 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/btn_OK'), 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/RelativeLayout_Email'), 0)

Mobile.clearText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), 0)

Mobile.setText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), email, 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/btn_OK'), 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/RelativeLayout_PhoneNumber'), 0)

Mobile.clearText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), 0)

Mobile.setText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), phonenumber, 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/btn_OK'), 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/RelativeLayout_Address'), 0)

Mobile.clearText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), 0)

Mobile.setText(findTestObject('ProfilePage_Object/Profile-Identity_Object/txtField_EmptyField'), address, 0)

Mobile.tap(findTestObject('ProfilePage_Object/Profile-Identity_Object/btn_OK'), 0)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('ProfilePage_Object/txt_viewName'), name)

Mobile.verifyElementText(findTestObject('ProfilePage_Object/txt_viewEmail'), email)

Mobile.verifyElementText(findTestObject('ProfilePage_Object/txt_viewPhoneNumber'), phonenumber)

Mobile.verifyElementText(findTestObject('ProfilePage_Object/txt_viewAddress'), address)

'back to the main page'
Mobile.tap(findTestObject('NavBar_Object/btn_Recent'), 0)


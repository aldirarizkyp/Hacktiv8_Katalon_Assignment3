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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('RecentPage_Object/imgView_Apple watch'), 0)

Mobile.tap(findTestObject('RecentPage_Object/imgView_Apple watch'), 0)

Mobile.verifyElementVisible(findTestObject('RecentPage_Object/ItemInfo_Object/txtView_Apple watch series 3 GPS 42mm Black'), 
    30)

Mobile.tap(findTestObject('RecentPage_Object/ItemInfo_Object/btn_ADD TO CART'), 0)

Mobile.setText(findTestObject('RecentPage_Object/ItemInfo_Object/txtField_Number of Order'), '8', 0)

Mobile.tap(findTestObject('RecentPage_Object/ItemInfo_Object/btn_ADD'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

//using xpatch to get the element of toast with text key
def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Stock is not enough\']')

println('Toast element: ' + toast)

'Back to the main page\r\n'
Mobile.pressBack()


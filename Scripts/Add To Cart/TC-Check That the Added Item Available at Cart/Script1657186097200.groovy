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

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('RecentPage_Object/imgView_Apple watch'), 0)

Mobile.tap(findTestObject('RecentPage_Object/imgView_Apple watch'), 0)

Mobile.waitForElementPresent(findTestObject('RecentPage_Object/ItemInfo_Object/txtView_Apple watch series 3 GPS 42mm Black'), 
    20)

Mobile.tap(findTestObject('RecentPage_Object/ItemInfo_Object/btn_ADD TO CART'), 0)

Mobile.setText(findTestObject('RecentPage_Object/ItemInfo_Object/txtField_Number of Order'), '1', 0)

Mobile.tap(findTestObject('RecentPage_Object/ItemInfo_Object/btn_ADD'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

//find element by xpath to get the element of toast with text key
def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Success add Product to cart\']')

println('Toast element: ' + toast)

Mobile.tap(findTestObject('Cart_Object/btn_Cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart_Object/ShoppingCart_Object/layout_Item1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('NavBar_Object/btn_Recent'), 0)


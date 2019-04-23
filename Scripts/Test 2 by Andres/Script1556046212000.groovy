import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://extranet.bookit-qa6.com/')

WebUI.setText(findTestObject('Object Repository/Page_BookItcom Book Online You Know What to Do/input_Username_userName'), 
    'andres.jaramillo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BookItcom Book Online You Know What to Do/input_Password_userPassword'), 
    'MHyHkLtcta7TNLYhZcwgjw==')

WebUI.click(findTestObject('Object Repository/Page_BookItcom Book Online You Know What to Do/input_Password_button'))

WebUI.click(findTestObject('Object Repository/Page_/a_Manage Property'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Property/input_or_hotelDisplayName'), '10006')

WebUI.click(findTestObject('Object Repository/Page_Manage Property/input_or_text'))

WebUI.click(findTestObject('Object Repository/Page_Manage Property/span_Please select a hotel from the list'))

WebUI.click(findTestObject('Object Repository/Page_Manage Property/li_Cheese 10006 Resort  2  Cheese 10006 Resort  2 (ChampaignUrbana Illinois US) - (Extranet)'))

WebUI.click(findTestObject('Object Repository/Page_Manage Property/input_OYO 10006 Hotel Blue Bay  OYO 10006 Hotel Blue Bay (  ) - (EAN EAN)_Modify Hotel'))

WebUI.click(findTestObject('Object Repository/Page_Manage Property/a_Manage Rooms'))

WebUI.switchToWindowTitle('Manage Rooms')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage Rooms/select_active Suite Cheese 10006 Test 1active Suite Cheese 10006 Test 2active Suite Cheese 10006 Test 3active Suite Cheese 10006 Test 4active Suite Cheese 10006 Test 5'), 
    '2392385483', true)

WebUI.click(findTestObject('Object Repository/Page_Manage Rooms/input_Property Rooms_submit'))


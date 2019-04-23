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

WebUI.navigateToUrl('https://bookit-qa6.com/')

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Departing_ember532-fd'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Returning_ember532-td'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/span_Flight_tp-icon icon-checkbox'))

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Check In_ember532-fd'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Check Out_ember532-td'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Going to_ember584-input'), 
    'Cheese')

WebUI.click(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/div_Cheese City IL US'))

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Check In_ember532-fd'), 
    '05/01/2019')

WebUI.setText(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/input_Check Out_ember532-td'), 
    '05/08/2019')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/select_0123456'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/select_Age    Under 2234567891011121314151617'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_Vacation Deals All Inclusive Cheap Flight Tickets  BookItcom/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Best Cheese Test Market IL Hotel Deals  Discount Hotels  BookItcom/a_Select Hotel'))

WebUI.switchToWindowTitle('Cheese BK10111 Resort')

WebUI.click(findTestObject('Object Repository/Page_Cheese BK10111 Resort/a_Select'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Packages  Vacation Deals  Travel Specials  BookItcom/button_CONTINUE'))

WebUI.closeBrowser()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://euw1-20swi10315-iam.3dx-staging.3ds.com/cas/login?serverId=FRONT_0&service=https%3A//euw1-20swi10315-ifwe.3dx-staging.3ds.com/')

WebUI.setText(findTestObject('mysearchtest/Page_3DPassport - Login/input_username'), 'technoqa')

WebUI.setText(findTestObject('mysearchtest/Page_3DPassport - Login/input_password'), 'Techno2016#')

WebUI.click(findTestObject('mysearchtest/Page_3DPassport - Login/input_uwa-submit uwa-submit-ro'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/span_ds-coachmark-close'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_My Favorite Searches'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_My Content'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_How To Search'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_Search'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_Advanced Search'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_Where To Search'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_Where To Search'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_DS - DSQAL081 euw1'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_DS - DSQAL062 apt2'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/a_Help On Type Shortcuts'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/div_Select Predefined Query3DS'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/span_close fonticon fonticon-c'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/div_btn_tag_nav'))

WebUI.click(findTestObject('mysearchtest/Page_My First Dashboard/div_run_ctn_search ctn_search'))

WebUI.closeBrowser()


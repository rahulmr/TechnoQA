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

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/input_uwa-autocomplete nv-auto'), 10)

WebUI.click(findTestObject('SearchData/Page_SearchData/input_uwa-autocomplete nv-auto'))

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/Page_SearchMenu/a_Search'), 10)

WebUI.click(findTestObject('SearchData/Page_SearchData/Page_SearchMenu/a_Search'))

WebUI.click(findTestObject('SearchData/Page_SearchData/input_uwa-autocomplete nv-auto'))

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/Page_SearchMenu/a_DS - DSQAL096 euw1'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SearchData/Page_SearchData/Page_SearchMenu/a_DS - DSQAL096 euw1'), FailureHandling.OPTIONAL)

'Give the test in the text area of the search bar'
WebUI.setText(findTestObject('SearchData/Page_SearchData/input_uwa-autocomplete nv-auto'), 'rennes2015')

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/div_run_btn_search fonticon fo'), 10)

'Click on search icon'
WebUI.click(findTestObject('SearchData/Page_SearchData/div_run_btn_search fonticon fo'))

not_run: WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/span_fonticon fonticon-view-sm'), 120)

not_run: WebUI.click(findTestObject('SearchData/Page_SearchData/span_fonticon fonticon-view-sm'))

not_run: WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/span_fonticon fonticon-view-li'), 120)

not_run: WebUI.click(findTestObject('SearchData/Page_SearchData/span_fonticon fonticon-view-li'))

WebUI.waitForElementVisible(findTestObject('Data/Page_Test JCN9 auto/div_rennes2015_widget'), 30)

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/span_preview-icon fonticon fon'), 20)

WebUI.click(findTestObject('SearchData/Page_SearchData/span_preview-icon fonticon fon'))

WebUI.click(findTestObject('SearchData/Page_SearchData/button_Add'))

'Verify the data is present'
WebUI.verifyElementPresent(findTestObject('Data/Page_Test JCN9 auto/div_rennes2015_widget'), 20)


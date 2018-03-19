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

WebUI.callTestCase(findTestCase('NavigateURLR2018x'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginToPod'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CompassFunctions/SmallCompassNorth'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForPageLoad(20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_compass-search-button font'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/input_compass-search-text form'), 
    '3DSpace', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_settings-img fonticon font'), 
    30, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_settings-img fonticon font'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/span_DS - DSQAL038 euw1'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_CityReferentialWidget/div_wp-tabview-panel'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

not_run: WebUI.waitForElementVisible(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_Success'), 
    30, FailureHandling.OPTIONAL)

not_run: WebUI.waitForElementPresent(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/div_3DSpace'), 
    20)

not_run: WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/div_3DSpace'))

not_run: WebUI.waitForElementPresent(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_ClickOnCollabSpace'), 
    20)

not_run: WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_ClickOnCollabSpace'))

WebUI.callTestCase(findTestCase('3DspaceFunctions/Launch3Dspace'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/div_breadcrumb__elem-icon font'))

WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_New Collaborative Space'))

WebUI.setText(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/input_newContainerName'), ' Techno2018')

WebUI.setText(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/input_description'), 'technoqa technoqa')

WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/button_Create'))

WebUI.waitForElementVisible(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_fonticon fonticon-layout'), 
    30)

WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_fonticon fonticon-layout'))

WebUI.waitForElementPresent(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_fonticon fonticon-th-list'), 
    30)

WebUI.click(findTestObject('3DSpace/CreateNewCollabSpace/Page_CreateNewCollabSpace/span_fonticon fonticon-th-list'))


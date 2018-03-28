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

WebUI.waitForPageLoad(30, FailureHandling.CONTINUE_ON_FAILURE)

'click on search icon on the open compass west'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_compass-search-button font'), FailureHandling.CONTINUE_ON_FAILURE)

'Type test to search app  3DCity illustration'
WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/input_compass-search-text form'), 
    'city illustration', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_settings-img fonticon font'), 
    30, FailureHandling.OPTIONAL)

'Click on arrow in front on app to select the tenant'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_settings-img fonticon font'), FailureHandling.OPTIONAL)

'Select the tenant'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/span_DS - DSQAL038 euw1'), FailureHandling.OPTIONAL)

'Click on tab panel to have sucess message '
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_CityReferentialWidget/div_wp-tabview-panel'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/div_Success'), 10, FailureHandling.OPTIONAL)

'Drag and drop City illustration widget to the Dashboard'
WebUI.dragAndDropToObject(findTestObject('Techno_CityIllustration/Page_CityIllustration/li_City Illustration'), findTestObject(
        'Techno_CityIllustration/Page_CityIllustration/div_wp-tabview-panel'), FailureHandling.CONTINUE_ON_FAILURE)

'Expand the widget'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/span_fonticon fonticon-resize-'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.CONTINUE_ON_FAILURE)


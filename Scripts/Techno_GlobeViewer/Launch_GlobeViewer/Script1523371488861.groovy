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

'Type text to search Globe Viewer App'
WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/input_compass-search-text form'), 
    'Globe Viewer', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(20, FailureHandling.CONTINUE_ON_FAILURE)

'Drag and drop Globe Viewer widget to the Dashboard'
WebUI.dragAndDropToObject(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/li_Globe Viewer'), findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_wp-tabview-panel'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Expand the widget'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/span_fonticon fonticon-resize-'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.CONTINUE_ON_FAILURE)


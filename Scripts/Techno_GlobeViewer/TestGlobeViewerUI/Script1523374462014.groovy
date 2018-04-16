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

WebUI.waitForPageLoad(10)

'Select  Preferences '
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/span_Preferences'))

WebUI.rightClick(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/span_Preferences'))

'Display property labels'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/li_Show labels'), FailureHandling.OPTIONAL)

'Select Theme Options'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Theme Options'))

WebUI.delay(5)

'modify theme dark\r\n'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_theme_Dark'))

'modify theme minimal\r\n'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_theme_minimal'))

'modify theme natural\r\n'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_theme_natural'))

'Select Interactions Options'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Interaction Options'))

'select Advanced Options'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Advanced Options'))

'Select Markers'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/span_Markers'))

'Activate Add Markers'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_AddEdit Marker'))

'click on a zone on globe'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_globe'))

'click on a zone on globe'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_globe2'))

'Activate Delete Markers'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Delete Marker'))

'find zone to unmark'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_globeMarkedR'))

'unmark zone on globe'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_globeMarkedB'))

'Select Areas'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/span_Areas'), FailureHandling.CONTINUE_ON_FAILURE)

'Activate Add Colors'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_ColorEdit Area'))

'click on a zone on globe'
WebUI.clickImage(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/image_globe'))

'Activate Delete Colors'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Delete Color'))

'Select Manage'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/span_Manage'), FailureHandling.CONTINUE_ON_FAILURE)

'Activate Load Data'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Load Data'))

'Activate Reset Markers and Areas'
not_run: WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Reset Markers and Areas'))

'Activate Save'
WebUI.click(findTestObject('Techno_GlobeViewer/Page_GlobeViewer/div_Save'))


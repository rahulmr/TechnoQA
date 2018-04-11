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

WebUI.waitForPageLoad(30)

'Expand the widget'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/Page_SearchAppInCompass/span_fonticon fonticon-resize-'), FailureHandling.CONTINUE_ON_FAILURE)

'Click on View tab in the action bar'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Click on Settings tab in the action bar'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_Settings'))

'Click on Tool tab in the action bar'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_Tools'))

'Click on Referential tab action bar'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_Referential'))

'Click on Experience tab in the action bar'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_Experience'))

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Right click on view tab in the action bar'
WebUI.rightClick(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Click on Show lables'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/li_Show labels'))

'click on city referential icon inside view tab'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/div_City Referential'), 
    FailureHandling.OPTIONAL)

'Verifing that City referential panel is open'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/h5_Available City Datasets'), 
    FailureHandling.OPTIONAL)


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

WebUI.waitForElementPresent(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'), 
    10)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Right click on view tab in the action bar'
WebUI.rightClick(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Click on Show lables'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/li_Show labels'))

'Click on Tool tab in the action bar'
WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_Tools'))

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/Page_Test JCN9 auto/div_Share Snapshot'))

WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto/input_wux-ui-state-undefined'), 
    'auto city referential ')

WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto/textarea_wux-ui-state-undefine'), 
    'Auto city referential share to swym')

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto (1)/span_wux-ui-3ds wux-ui-3ds-exp'))

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto (1)/li_techno'))

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto/div_Ok'))


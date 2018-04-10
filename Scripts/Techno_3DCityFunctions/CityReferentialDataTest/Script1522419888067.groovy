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
import org.sikuli.script.FindFailed as FindFailed
import org.sikuli.script.Screen as Screen
import org.sikuli.script.Pattern as Pattern

not_run: WebUI.callTestCase(findTestCase('Techno_3DCityFunctions/DragDropCityReferentialWidget'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('3DSearch/SearchData'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SearchData/CloseSearch/Page_closeSearch/span_tagger-close fonticon fon'), 10)

WebUI.click(findTestObject('SearchData/CloseSearch/Page_closeSearch/span_tagger-close fonticon fon'))

WebUI.waitForPageLoad(30)

Screen s = new Screen()

Pattern p = new Pattern()

s.find('Object Repository/Images/drag.png')

System.out.println('Source image found')

s.find('Object Repository/Images/drop.png')

System.out.println('target image found')

s.dragDrop('Object Repository/Images/drag.png', 'Object Repository/Images/drop.png')

WebUI.waitForElementPresent(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/Page_Test JCN9 auto (1)/span_City Referential - Rennes'), 
    20)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/Page_Test JCN9 auto (1)/span_fonticon fonticon-resize-'))

WebUI.waitForElementPresent(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/Page_Test JCN9 auto/span_xCity-info-icons xCity-po'), 
    30)

WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/Page_Test JCN9 auto/span_xCity-info-icons xCity-po'))

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Right click on view tab in the action bar'
not_run: WebUI.rightClick(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_View'))

'Click on Show lables'
not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/li_Show labels'))

'Click on Tool tab in the action bar'
not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/TestCityReferentialUI/Page_CityReferentialUI/span_Tools'))

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/Page_Test JCN9 auto/div_Share Snapshot'))

not_run: WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto/input_wux-ui-state-undefined'), 
    'auto city referential ')

not_run: WebUI.setText(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto/textarea_wux-ui-state-undefine'), 
    'Auto city referential share to swym')

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto (1)/span_wux-ui-3ds wux-ui-3ds-exp'))

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto (1)/li_techno'))

not_run: WebUI.click(findTestObject('Techno_3Dcity_DDCityReferential/DataTest/swymInput/Page_Test JCN9 auto/div_Ok'))


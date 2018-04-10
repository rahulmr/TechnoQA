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
import org.sikuli.script.FindFailed as FindFailed
import org.sikuli.script.Screen as Screen
import org.sikuli.script.Pattern as Pattern

WebUI.callTestCase(findTestCase('NavigateURLR2018x'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginToPod'), [('UserName') : 'technoqa', ('Password') : 'Techno2016#'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CompassFunctions/SmallCompassNorth'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Techno_RenderingStudio/Launch_RenderingStudio'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SearchData/Page_SearchData/input_uwa-autocomplete nv-auto'), 'prd')

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/div_run_btn_search fonticon fo'), 10)

WebUI.click(findTestObject('SearchData/Page_SearchData/div_run_btn_search fonticon fo'))

WebUI.waitForElementPresent(findTestObject('SearchData/Page_SearchData/span_preview-icon fonticon fon'), 20)

WebUI.click(findTestObject('SearchData/Page_SearchData/span_preview-icon fonticon fon'))

WebUI.click(findTestObject('SearchData/Page_SearchData/button_Add'))

Screen s = new Screen()

Pattern p = new Pattern()

s.find('Object Repository/Images/drag.png')

System.out.println('Source image found')

s.find('Object Repository/Images/drop.png')

System.out.println('target image found')

s.dragDrop('Object Repository/Images/drag.png', 'Object Repository/Images/drop.png')


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

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_profile-picture'), 10)

'Click on profile picture'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_profile-picture'))

'Verify My roles sub menu in Profile picture menu'
WebUI.verifyElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/span_My Roles'), 10)

'Click on notification icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_notification topbar-menu-i'))

WebUI.waitForPageLoad(20)

'Close the notification'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_notification topbar-menu-i_1'))

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_add topbar-menu-item topba'), 10)

'Click on Plus icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_add topbar-menu-item topba'))

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_Topbar/span_Tab'), 10)

'Verify the tab menu on plus icon'
WebUI.verifyElementPresent(findTestObject('3DD_TopBar/Page_Topbar/span_Tab'), 10)

WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_add topbar-menu-item topba_1'))

WebUI.waitForPageLoad(20)

'Click on Share icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_share topbar-menu-item top'))

'Verify the share icon'
WebUI.verifyElementPresent(findTestObject('3DD_TopBar/Page_Topbar/span_Share Tab'), 10)

WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_share topbar-menu-item top_1'))

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_content topbar-menu-item t'), 10)

'Click on Drive icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_content topbar-menu-item t'))

WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_content topbar-menu-item t_1'))

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_social topbar-menu-item to'), 10)

'Click on Swym icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_social topbar-menu-item to'))

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_social topbar-menu-item to_1'), 10)

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_help topbar-menu-item topb'), 10)

'Click on Help Icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_help topbar-menu-item topb'))

WebUI.waitForElementPresent(findTestObject('3DD_TopBar/Page_3DDTopBar/div_help topbar-menu-item topb_1'), 10)

'Close the help icon'
WebUI.click(findTestObject('3DD_TopBar/Page_3DDTopBar/div_help topbar-menu-item topb_1'))


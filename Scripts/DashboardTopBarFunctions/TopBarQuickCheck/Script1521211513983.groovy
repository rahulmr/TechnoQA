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

'check dashboard down arrow'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/div_dashboard-actions-holder f'))

'check search tags'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarSearch/div_btn_tag_nav'))

'check profile icon'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarProfile/div_profile-picture'))

'check notification icon\r\n'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarNotification/div_notification topbar-menu-i'))

'check add icon'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarAdd/div_add topbar-menu-item topba'))

'check share icon'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarShare/div_share topbar-menu-item top'))

'check content icon'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarContent/div_content topbar-menu-item t'))

'check communities icon'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarCommunities/div_social topbar-menu-item to'))

'check help icon'
WebUI.verifyElementVisible(findTestObject('TopBar/Page_TopBar/Page_TopBarHelp/div_help topbar-menu-item topb'))


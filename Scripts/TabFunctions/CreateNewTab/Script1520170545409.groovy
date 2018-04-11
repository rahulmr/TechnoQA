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

WebUI.waitForElementPresent(findTestObject('CreateNewTab/Page_Tab/Page_New Dashboard/span_icon fonticon fonticon-pl'), 10)

WebUI.click(findTestObject('CreateNewTab/Page_Tab/Page_New Dashboard/span_icon fonticon fonticon-pl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('CreateNewTab/Page_Tab/Page_New Dashboard/span_New Tab 1'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CreateNewTab/Page_Tab/Page_New Dashboard/span_New Tab 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('CreateNewTab/Page_CreateNewTab/input_edit-in-place edit-in-pl'), 'Techno', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('CreateNewTab/Page_CreateNewTab/input_edit-in-place edit-in-pl'), Keys.chord(Keys.ENTER), 
    FailureHandling.CONTINUE_ON_FAILURE)


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

WebUI.callTestCase(findTestCase('NavigateURLR2018x'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginToPod'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CompassFunctions/SmallCompassNorth'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('3DspaceFunctions/Launch3Dspace'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_DS - DSQAL111 euw1'), 
    30)

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_DS - DSQAL111 euw1'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_wux-layouts-treeview-expand'), 
    20)

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_wux-layouts-treeview-expand'))

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_Techno2018'), 20)

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_Techno2018'))

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/div_breadcrumb__elem-icon font'), 
    20)

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/div_breadcrumb__elem-icon font'))

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_Add content'))

WebUI.uploadFile(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_Add content'), 'C:\\Users\\jcn9\\git\\TechnoQA\\Data Files\\city_experience.json')

WebUI.sendKeys(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_Add content'), 'C:\\Users\\jcn9\\git\\TechnoQA\\Data Files\\city_experience.json')

'Capturing the file name after upload and storing it in a variable'
FilePath = WebUI.getAttribute(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_Add content'), 
    'value')

WebUI.acceptAlert()


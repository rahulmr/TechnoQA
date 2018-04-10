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

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_DS - DSQAL111 euw1'), 
    10)

not_run: WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_DS - DSQAL111 euw1'), 
    FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_wux-layouts-treeview-expand'), 
    10)

'Click on expand tree icon in 3dspace '
WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_wux-layouts-treeview-expand'))

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_Techno2018'), 10)

'Click on 3dspace which is created'
WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/li_Techno2018'))

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Upload/Page_My First Dashboard/a_Techno2018'))

WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Upload/Page_My First Dashboard/a_Techno2018'))

WebUI.waitForElementPresent(findTestObject('3DSpace/UploadFileInCollabSpace/Upload/Page_My First Dashboard/div_breadcrumb__elem-icon font'), 
    30, FailureHandling.OPTIONAL)

'Click on dropdown arrow on selected 3DSpace'
WebUI.click(findTestObject('3DSpace/UploadFileInCollabSpace/Upload/Page_My First Dashboard/div_breadcrumb__elem-icon font'))

'Upload data in 3DSpace'
CustomKeywords.'upload.uploadFiles.uploadFile'(findTestObject('3DSpace/UploadFileInCollabSpace/Page_My First Dashboard/span_Add content'), 
    'C:\\Users\\jcn9\\git\\TechnoQA\\Data Files\\rennes2015_widget.json')

Thread.sleep(2000)


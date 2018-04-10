package dnd

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

 
public class DragAndDropHelper {
private static String getJsDndHelper() {
return '''
function simulateDragDrop(sourceNode, destinationNode) {
var EVENT_TYPES = {
DRAG_END: 'dragend',
DRAG_START: 'dragstart',
DROP: 'drop'
}
 
function createCustomEvent(type) {
var event = new CustomEvent("CustomEvent")
event.initCustomEvent(type, true, true, null)
event.dataTransfer = {
data: {
},
setData: function(type, val) {
this.data[type] = val
},
getData: function(type) {
return this.data[type]
}
}
return event
}
 
function dispatchEvent(node, type, event) {
if (node.dispatchEvent) {
return node.dispatchEvent(event)
}
if (node.fireEvent) {
return node.fireEvent("on" + type, event)
}
}
 
var event = createCustomEvent(EVENT_TYPES.DRAG_START)
dispatchEvent(sourceNode, EVENT_TYPES.DRAG_START, event)
 
var dropEvent = createCustomEvent(EVENT_TYPES.DROP)
dropEvent.dataTransfer = event.dataTransfer
dispatchEvent(destinationNode, EVENT_TYPES.DROP, dropEvent)
 
var dragEndEvent = createCustomEvent(EVENT_TYPES.DRAG_END)
dragEndEvent.dataTransfer = event.dataTransfer
dispatchEvent(sourceNode, EVENT_TYPES.DRAG_END, dragEndEvent)
}
 
''';
}
 
@Keyword
def dragAndDrop(TestObject sourceObject, TestObject destinationObject) {
WebElement sourceElement = WebUiBuiltInKeywords.findWebElement(sourceObject);
WebElement destinationElement = WebUiBuiltInKeywords.findWebElement(destinationObject);
WebDriver webDriver = DriverFactory.getWebDriver();
((JavascriptExecutor) webDriver).executeScript(getJsDndHelper() + "simulateDragDrop(arguments[0], arguments[1])", sourceElement, destinationElement)
}
}



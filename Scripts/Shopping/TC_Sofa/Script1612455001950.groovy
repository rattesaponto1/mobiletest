import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('Object Repository/Wishlist/furniture/android.widget.TextView - SKIP LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/Wishlist/furniture/android.widget.ImageView'), 0)


switch (sofa.toString()) {
	
	case '1':
	
		Mobile.tap(findTestObject('Wishlist/furniture/sofa satu'), 0)
	
		break
		
		
	case '2':
	
		Mobile.tap(findTestObject('Object Repository/Wishlist/furniture/sofa dua'), 0)
		
		break
		
		
	case '3':
	
		Mobile.tap(findTestObject('Object Repository/Wishlist/furniture/sofa tiga'), 0)
		
		break
	
}

Mobile.tap(findTestObject('Wishlist/furniture/wishlist'), 0)

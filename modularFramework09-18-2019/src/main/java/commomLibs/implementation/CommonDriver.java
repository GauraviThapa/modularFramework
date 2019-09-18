package commomLibs.implementation;

import org.openqa.selenium.WebDriver;

import commomLibs.contract.IDriver;

public class CommonDriver implements IDriver {
private WebDriver driver;
private int pageloadTimeout;
private int elementDetectionTimeout;
@Override
public void navigateToFirstUrl(String url) throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public String getTitle() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String getCurrentUrl() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String getPageSource() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void navigateToUrl(String url) throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public void navigateForward() throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public void navigateBackward() throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public void refresh() throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public void closeBrowser() throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public void closeAllBrowsers() throws Exception {
	// TODO Auto-generated method stub
	
}


}

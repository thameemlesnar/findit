package base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base_page_driver {

	// WebDriver gojo;
	
	public base_page_driver(WebDriver gojo) {
		
		//	this.gojo=gojo;
			
			PageFactory.initElements(gojo,this);
		
	}
	
	
	
	
	
	
	
	
	
	
}

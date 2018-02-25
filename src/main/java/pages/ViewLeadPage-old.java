/*package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage-old extends ProjectMethods{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleFNVerify;
	public ViewLeadPage verifyFName(String data) {
	verifyExactText(eleFNVerify, data);
	return this;
	}
	
}
*/
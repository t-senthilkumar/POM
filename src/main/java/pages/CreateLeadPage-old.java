/*package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage-old extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	private WebElement eleCName;
	public CreateLeadPage enterCName(String data) {
	type(eleCName, data);
	return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	private WebElement eleFName;
	public CreateLeadPage enterFName(String data) {
	type(eleFName, data);
	return this;
	}
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	private WebElement eleLName;
	public CreateLeadPage enterLName(String data) {
	type(eleLName, data);
	return this;
	}

	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	private WebElement eleCreLead;
	public ViewLeadPage clickCreLead() {
	click(eleCreLead);
		return new ViewLeadPage();
	}
	
}
*/
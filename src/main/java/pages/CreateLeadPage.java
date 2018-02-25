package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_companyName")
	private WebElement eleComName;
	public CreateLeadPage enterCompanyName(String data)
	{
		type(eleComName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String data)
	{
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String data)
	{
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.NAME, using= "submitButton")
	private WebElement eleCreateLead;
	public ViewLeadpage clickCreateLead()
	{
	click(eleCreateLead);	
	return new ViewLeadpage();
	}
}

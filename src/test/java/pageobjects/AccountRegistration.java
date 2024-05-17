package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration  extends BasePage{
	 
		
			public AccountRegistration (WebDriver driver){
				super(driver);
			}

			//Elements
			@FindBy(xpath="//input[@id='input-firstname']")
			WebElement txtfristname;
			
			@FindBy(xpath="//input[@id='input-lastname']")
			WebElement txtlastname;
			
			@FindBy(xpath="//input[@id='input-email']")
			WebElement txtemail;
			@FindBy(xpath="//input[@id='input-telephone']")
			WebElement tele;
			
			@FindBy(xpath="//input[@id='input-password']")
			WebElement txtpassword;
			
			@FindBy(xpath="//input[@id='input-confirm']")
			WebElement conpass;
			
	      @FindBy(xpath="//input[@name='agree']")
			WebElement buttnagree;
			
			@FindBy(xpath="//input[@value='Continue']")
			WebElement btnsubmit;
			////input[@value='Continue']
			
			@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
			WebElement msgconformation;
			
			//Action Methods on elements
			
			public void setFtistName(String fname) {
				txtfristname.sendKeys(fname);
			}
			
			public void setLasttName(String lname) {
				 txtlastname.sendKeys(lname);
			}
			////input[@name='agree']
			public void setEmail(String mail) {
				txtemail.sendKeys(mail);
			}
			public void settele(String num) {
				tele.sendKeys(num);
			}
			
			public void setPassword(String pwd) {
				txtpassword.sendKeys(pwd);
			}
			public void conpass(String pwd) {
				conpass.sendKeys(pwd);
				
			}
		
			public void clickagree() throws  InterruptedException {
				
				
				buttnagree.click();
				
				}
			
			public void  clicksubmitt() throws InterruptedException {
				 btnsubmit.click();

				
					
				
				
			}
			
			public String massage() {
				try {
				return (msgconformation.getText());
				}
				catch(Exception e) {
					return(e.getMessage());
				}
			}
			
			

}

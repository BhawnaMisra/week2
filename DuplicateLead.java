package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DuplicateLead {
		
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//Click on Leads Button
			driver.findElement(By.linkText("Leads")).click();
			
			//Click on My Lead
			driver.findElement(By.linkText("My Leads")).click();
			
			//click on Create Lead
			driver.findElement(By.linkText("Create Lead")).click();
			
			// Enter CompanyName Field Using id Locator
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ameriprise");
			
			// Enter FirstName Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhawna");
			
			//Enter LastName Field Using id Locator
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Misra");
			
			//Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ninza");
			
			
				//11. Enter Department Field Using any Locator of Your Choice
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			
			 	// 12. Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello There");
			
			  //13. Enter your email in the E-mail address Field using the locator of your choice
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ABC@gmail.com");
			
			
		
			  //14. Select State/Province as NewYork Using Visible Text
			WebElement statepDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select ddsp = new Select(statepDropDown);
			ddsp.selectByVisibleText("New York");
			
					 		
			//Click on Create Button
			driver.findElement(By.name("submitButton")).click();
			
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			//Click on Duplicate Lead
			driver.findElement(By.linkText("Duplicate Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CSC");
			
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
			
			driver.findElement(By.name("submitButton")).click();
			
			
	
}
	}
	

	
	
	
	



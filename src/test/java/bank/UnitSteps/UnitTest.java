package bank.UnitSteps;

public class UnitTest {
	
	public static void main(String[] args) {
		
		WebDriverManager.
		
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']")).click();
		
		// Select Country
		
		Select country = new Select(driver.findElement(By.xpath("//*[@name='lst_countryS']")));
		country.selectByVisibleText("INDIA");
		
		// Select State
		
		Select state = new Select(driver.findElement(By.xpath("lst_stateS")));
		state.selectByVisibleText("Andhra Pradesh");
		
		// Select City
		
		Select city = new Select(driver.findElement(By.xpath("lst_cityS")));
		city.selectByVisibleText("Hyderabad");
		
	}

}

package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {

		// WebDriver is Launch

		WebDriver driver = new ChromeDriver();

		// Maximize the window

		driver.manage().window().maximize();

		// Open the URL

		driver.get("https://www.facebook.com/");

		// wait for 5 seconds

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// If else condition to redirect

		if (driver.getCurrentUrl().equals("https://www.facebook.com/"))
			;

		System.out.println("Page is been redirected to the homepage");

		// Click the create new account

		WebElement createAccount = driver.findElement(By.linkText("Create new account"));

		createAccount.click();

		// WebElement for FirstName with explicit wait for 10 second

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='firstname']"))))
				.sendKeys("Test");

		// WebElement for LaststName

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));

		lastName.sendKeys("User");

		// WebElement for email id

		WebElement emailId = driver.findElement(By.xpath("//input[@name='reg_email__']"));

		emailId.sendKeys("sureshkarthik21@gmail.com");

		// WebElement for re-confirmation email id

		WebElement re_emailId = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

		re_emailId.sendKeys("sureshkarthik21@gmail.com");

		// WebElement for password

		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		password.sendKeys("User@123456");

		// Drop down action is performed for selection of day

		WebElement day = driver.findElement(By.xpath("//Select[@id='day']"));

		Select selectDay = new Select(day);

		selectDay.selectByVisibleText("11");

		// Drop down action is performed for selection of Month

		WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));

		Select selectMonth = new Select(month);

		selectMonth.selectByVisibleText("May");

		// Drop down action is performed for selection of year

		WebElement year = driver.findElement(By.xpath("//Select[@id='year']"));

		Select selectYear = new Select(year);

		selectYear.selectByVisibleText("1985");

		// radio button gender selection

		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));

		gender.click();

		// SignUp button

		WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));

		signUp.click();

		// Verify the redirection

		if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {

			System.out.println("Facebook is registered and redirected to homepage ");
		} else {
			System.out.println("Not Redirected to homepage");
		}

		// Close window
		 driver.quit();

	}

}

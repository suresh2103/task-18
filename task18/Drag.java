package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {

		// Importing the WebDriver which implements the chromeDriver

		WebDriver driver = new ChromeDriver();

		// Maximize the Window

		driver.manage().window().maximize();

		// Navigate to the URL

		driver.get("https://jqueryui.com/droppable/");

		// Switch to another frame

		driver.switchTo().frame(0);

		// Finding the Element for drag

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		// Finding the Element for drop

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		// Before the drop text

		System.out.println("Before Drop =" + drop.getText());

		// Before the drop the CSS Value

		System.out.println("Before drop CSS Value =" + drop.getCssValue("color"));

		// Actions class is implemented

		Actions action = new Actions(driver);

		// drag & drop action is performed

		action.dragAndDrop(drag, drop).build().perform();

		// After the drop action

		System.out.println("After dropped CSS Value = " + drop.getCssValue("color"));

		if (drop.getText().endsWith("Dropped")) {

			System.out.println("After dropped the text is = " + drop.getText());
		} else {

			System.out.println("Drop and drag operation is not carried out");
		}

		// close the window

		driver.quit();

	}

}



/* OutPut

Before Drop =Drop here
Before drop CSS Value =rgba(51, 51, 51, 1)
After dropped CSS Value = rgba(119, 118, 32, 1)
After dropped the text is = Dropped  */



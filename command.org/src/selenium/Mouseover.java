package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		/*WebElement ele = driver.findElement(By.xpath("xpath"));
		//Create object 'action' of an Actions class
		Actions action = new Actions(driver);
		//Mouseover on an element
		action.moveToElement(ele).perform();*/
		
		//Main Menu
		WebElement mainMenu = driver.findElement(By.linkText("main_menu_link"));
		//Create object 'action' of an Actions class
		Actions actions = new Actions(driver);
		//To mouseover on main menu
		actions.moveToElement(mainMenu);
		 
		//Sub Menu
		WebElement subMenu = driver.findElement(By.linkText("sub_menu_link"));
		//To mouseover on sub menu
		actions.moveToElement(subMenu);
		//build() method is used to compile all the actions into a single step 
		actions.click().build().perform();
	}

}

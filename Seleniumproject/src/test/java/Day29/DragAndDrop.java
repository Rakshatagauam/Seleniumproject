package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		//seoul==> spain
		WebElement seoul =driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement spain= driver.findElement(By.xpath("//div[@id='box107']"));
		
		act.dragAndDrop(seoul, spain).perform();
		
		//rome===> Italy
		WebElement rome=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome, Italy).perform();
		

	}

}

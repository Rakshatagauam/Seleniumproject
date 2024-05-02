package Day23;






public class FluentWaitDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     // ChromeDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	       .withTimeout(Duration.ofSeconds(30L))
    	       .pollingEvery(Duration.ofSeconds(5L))
    	       .ignoring(NoSuchElementException.class);
     
    
     WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
         public WebElement apply(WebDriver driver) {
           return driver.findElement(By.id("foo"));
    
     
     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
     
	}

}

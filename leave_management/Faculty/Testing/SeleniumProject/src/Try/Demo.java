package Try;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\B Tech AMRITA\\7th Semester\\NCP\\leave_management\\Faculty\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("mahalaxmi.muthuvel@gmail.com");
		driver.findElement(By.className("qhFLie")).click();
		String at=driver.getTitle();
		String et="gmail";
		Thread.sleep(1000);
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test UnSuccessful");
		}		
		
	}

}

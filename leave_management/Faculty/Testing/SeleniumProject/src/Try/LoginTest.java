package Try;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\B Tech AMRITA\\7th Semester\\NCP\\leave_management\\Faculty\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B%20Tech%20AMRITA/7th%20Semester/NCP/leave_management/Faculty/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserNameHolder")).sendKeys("cb.en.u4cse17233");
		driver.findElement(By.id("PasswordHolder")).sendKeys("balaji2k.");
		driver.findElement(By.id("SubmitButton")).click();
		String at=driver.getTitle();
		System.out.println(at);
	}
}

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Pranav");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.close();
	}

}

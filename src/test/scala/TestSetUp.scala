import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val EMAIl = "12ps93r@gmail.com"
  val password = "12dec1993"
  System.setProperty("webdriver.chrome.driver", "/home/prashant/Desktop/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
}

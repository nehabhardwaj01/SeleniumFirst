import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val EMAIl = "7838243081"
  val password = "neha3f659"
  System.setProperty("webdriver.chrome.driver", "/home/neha/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
}

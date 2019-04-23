import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) {
        login();
        register();
    }

    public static void login() {
//        System.setProperty("webdriver.chrome.driver","resources/chromedriver2.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://fasttrackit.org/selenium-test/");
//        driver.findElement(By.cssSelector("a.skip-account .label")).click();
//        driver.findElement(By.cssSelector("a[href*= 'login'")).click();
//        driver.findElement(By.id("email")).sendKeys("Email@email.com");
//        driver.findElement(By.id("pass")).sendKeys("Parola.11");
//        sleep(3);
//        driver.findElement(By.id("send2")).click();
//        driver.close();
    }

    public static void register() {
//        System.setProperty("webdriver.chrome.driver","resources/chromedriver2.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.firstkid.ro");
//        driver.findElement(By.cssSelector("a[class='my-account-link'")).click();
//        driver.findElement(By.cssSelector("a.mini-my-account-create-account")).click();
//        driver.findElement(By.id("firstname")).sendKeys("Serbanescu");
//        driver.findElement(By.id("lastname")).sendKeys("Radu");
//        driver.findElement(By.id("email_address")).sendKeys("email@email.com");
//        driver.findElement(By.id("day")).sendKeys("30");
//        driver.findElement(By.id("month")).sendKeys("9");
//        driver.findElement(By.id("year")).sendKeys("1977");
//        driver.findElement(By.id("password")).sendKeys("Parola.11");
//        driver.findElement(By.id("confirmation")).sendKeys("Parola.11");
//        driver.findElement(By.cssSelector("button.button[title='Trimite'")).click();
//        sleep(5);
//        driver.close();
    }

//    public static void addToCart() {
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver2.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.firstkid.ro");
//        driver.findElement(By.cssSelector("a[class='my-account-link'")).click();
//        driver.findElement(By.cssSelector("a.top-mini-my-account-login")).click();
//        driver.findElement(By.id("email")).sendKeys("email@email.com");
//        driver.findElement(By.id("pass")).sendKeys("Parola.11");
//        driver.findElement(By.id("send2")).click();
//        driver.findElement(By.cssSelector("div.menu-container")).click();
//        driver.findElement(By.cssSelector("a[href = 'https://www.firstkid.ro/alimentatia-copilului'")).click();
//        driver.findElement(By.cssSelector(" a[href = 'https://www.firstkid.ro/biberoane'")).click();
//        driver.findElement(By.cssSelector("img[alt* ='Biberonul-anti-colici-cu-gat-larg-BabyOno-403-240ml'")).click();
//        driver.findElement(By.id("qty")).sendKeys("2");
//        driver.findElement(By.cssSelector("button[onclick= 'productAddToCartForm.submit(this)'")).click();
//        sleep(5);
//        driver.close();
//    }
//
    public static void registerAddToCartCheckout(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("a.skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("a[title='Log In'")).click();
        driver.findElement(By.cssSelector("a[title='Create an Account'")).click();
        driver.findElement(By.id("firstname")).sendKeys("Serbanescu");
        driver.findElement(By.id("lastname")).sendKeys("Radu");
        driver.findElement(By.id("email_adress")).sendKeys("email@email.com");
        driver.findElement(By.id("password")).sendKeys("Parola.11");
        driver.findElement(By.id("confirmation")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("button.button.validation-passed")).click();
        driver.findElement(By.cssSelector("li.level0.nav-2.parent a.level0.has-children")).click();
        driver.findElement(By.cssSelector("li.level1.nav-2-2 a.level1")).click();
        driver.findElement(By.cssSelector("a[title *='Plaid Cotton Shirt'")).click();
        driver.findElement(By.cssSelector("img[alt='Charcoal'")).click();
        driver.findElement(By.cssSelector("a[title='M'")).click();
        driver.findElement(By.id("qty")).sendKeys("2");
        driver.findElement(By.cssSelector("div.add-to-cart button.button.btn-cart")).click();
        driver.findElement(By.cssSelector("ul.checkout-types.top button.button.btn-proceed-checkout.btn-checkout")).click();
        sleep(10);
        driver.close();




    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
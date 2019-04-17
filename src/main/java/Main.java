import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) {
        login();
        register();
    }

    public static void login(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("Email@email.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        sleep(3);
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.close();
    }

    public static void register(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.firstkid.ro");
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header.container > div.header-liks > div.my-account-area > div > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header.container > div.header-liks > div.my-account-area > div > div > div > p > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Serbanescu");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Radu");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("#day")).sendKeys("30");
        driver.findElement(By.cssSelector("#month")).sendKeys("9");
        driver.findElement(By.cssSelector("#year")).sendKeys("1977");
        driver.findElement(By.cssSelector("#password")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        sleep(5);
        driver.close();
    }

    public static void addToCart(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.firstkid.ro");
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header.container > div.header-liks > div.my-account-area > div > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header.container > div.header-liks > div.my-account-area > div > div > div > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header-wrapper > div > div > div.dropdown-menu > div > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header-wrapper > div > div > div.dropdown-menu > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.main-container.col2-left-layout > div > div.row > div.col-left.sidebar.f-left.col-sm-3 > div.block.block-category-nav > div.block-content > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.main-container.col2-left-layout > div > div.row > div.col-main.col-sm-9.f-right > div.category-products > ul > li:nth-child(2) > div > div.product-image-area > a > img")).click();
        driver.findElement(By.cssSelector("#qty")).sendKeys("2");
        driver.findElement(By.cssSelector("#product_addtocart_form > div.row > div.product-shop.col-sm-7 > div.add-to-box > div > button > span > span")).click();
        sleep(5);
        driver.close();
    }

    public static void checkout(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.firstkid.ro");
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header.container > div.header-liks > div.my-account-area > div > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header.container > div.header-liks > div.my-account-area > div > div > div > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header-wrapper > div > div > div.dropdown-menu > div > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.header-container.type10 > div.header-wrapper > div > div > div.dropdown-menu > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.main-container.col2-left-layout > div > div.row > div.col-left.sidebar.f-left.col-sm-3 > div.block.block-category-nav > div.block-content > ul > li:nth-child(7) > a")).click();
        driver.findElement(By.cssSelector("body > div.wrapper > div > div.main-container.col2-left-layout > div > div.row > div.col-main.col-sm-9.f-right > div.category-products > ul > li:nth-child(2) > div > div.product-image-area > a > img")).click();
        driver.findElement(By.cssSelector("#qty")).sendKeys("1");
        driver.findElement(By.cssSelector("#product_addtocart_form > div.row > div.product-shop.col-sm-7 > div.add-to-box > div > button > span > span")).click();
        driver.findElement (By.cssSelector("body > div.wrapper > div > div.main-container.col1-layout > div > div > div.cart > div.page-title.title-buttons > ul > li > button > span > span")).click();
        sleep(5);
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
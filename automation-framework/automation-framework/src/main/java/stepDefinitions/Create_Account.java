package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Create_Account {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();

    }
    @Given("I access Jumia Page")
    public void i_access_jumia_page()  {
        driver.get("https://www.jumia.com.eg/");

    }
    @When("I close the popup")
    public void i_close_the_popup() throws InterruptedException {
            driver.findElement(By.xpath("(//button[@class=\"cls\"])[2]")).click();
        Thread.sleep(3000);

    }
    @And("I click on Account drop down menu")
    public void i_click_on_account_drop_down_menu()  {
        driver.findElement(By.xpath("(//*[@viewBox=\"0 0 24 24\"])[6]")).click();


    }
    @And("I click on Sign in button")
    public void i_click_on_sign_in_button() {
        driver.findElement(By.xpath("//*[@href=\"/customer/account/login/?return=%2F\"]")).click();

    }
    @And("I wait till Welcome to Jumia text appears")
    public void i_wait_till_welcome_to_jumia_text_appears() throws InterruptedException {
        Thread.sleep(10000);

    }
    @And("I enter the e-mail")
    public void i_enter_the_e_mail() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"input_identifierValue\"]")).sendKeys("martell77320@jwo4qaa.cashbenties.com");
        Thread.sleep(3000);

    }
    @And("I press on Continue button")
    public void i_press_on_continue_button()  {
        driver.findElement(By.xpath("(//span[@class=\"mdc-button__touch\"])[1]")).click();
    }
    @And("I press Skip for now in the page of Secure your account")
    public void i_press_skip_for_now_in_the_page_of_secure_your_account() {
        driver.findElement(By.xpath("(//span[@class=\"mdc-button__touch\"])[2]")).click();
    }

    @And("I wait for Password field to be available")
    public void i_wait_for_password_field_to_be_available() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("I put password")
    public void i_put_password() {
        driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Jumia@123");
    }

    @And("I put the password again to confirm password")
    public void i_put_the_password_again_to_confirm_password() {
        driver.findElement(By.xpath("//input[@aria-labelledby=\"confirm-password\"]")).click();
        driver.findElement(By.xpath("//input[@aria-labelledby=\"confirm-password\"]")).sendKeys("Jumia@123");
    }
    @And("I click on Continue button")
    public void i_click_on_continue_button()  {
        driver.findElement(By.xpath("(//span[@class=\"mdc-button__touch\"])[1]")).click();
    }
    @And("I put First name")
    public void i_put_first_name() {
        driver.findElement(By.xpath("//input[@id=\"input_first_name\"]")).sendKeys("FirstName");
    }

    @And("I put Last name")
    public void i_put_last_name() {
        driver.findElement(By.xpath("//input[@id=\"input_last_name\"]")).sendKeys("LastName");
    }

    @And("I put the phone number")
    public void i_put_the_phone_number() {
        driver.findElement(By.xpath("//input[@name=\"phone[number]\"]")).sendKeys("01091093412");
    }

    @And("I press Continue button")
    public void i_press_continue_button() {
        driver.findElement(By.xpath("(//span[text()=\"Continue\"])[2]")).click();
    }
    @And("I press on Gender field")
    public void i_press_on_gender_field() {
        driver.findElement(By.xpath("//input[@id=\"input_gender\"]")).click();

    }
    @And("I select Female")
    public void i_select_female() {
        driver.findElement(By.xpath("//li[@data-value=\"F\"]")).click();
    }
    @And("I double click on birthday field")
    public void i_double_click_on_birthday_field() {
        driver.findElement(By.xpath("//input[@id=\"input_birth_date\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"input_birth_date\"]")).click();

    }
    @And("I write {int}")
    public void i_write(Integer int1) {
        driver.findElement(By.xpath("//input[@id=\"input_birth_date\"]")).sendKeys("01011999");

    }
    @And("I put check mark on the Terms and Conditions")
    public void i_put_check_mark_on_the_terms_and_conditions() {
        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
    }
    @And("I press on Continue")
    public void i_press_on_continue() {
        driver.findElement(By.xpath("//button[@id=\"confirmBtn\"]")).click();
    }
    @Then("I should receive a confirmation message: Your account has been created")
    public void i_should_receive_a_confirmation_message_your_account_has_been_created() {
    WebElement CreateAccount_Submission_Message = driver.findElement(By.xpath("//*[text()='Your account has been created']"));
    Assert.assertEquals(CreateAccount_Submission_Message.getText(),"Your account has been created");
    }
}

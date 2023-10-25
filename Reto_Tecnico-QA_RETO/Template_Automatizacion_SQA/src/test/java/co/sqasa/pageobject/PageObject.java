package co.sqasa.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
    private WebDriver driver;
    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    private By primerProducto = By.xpath("//div[@data-product-id='4100']");
    private By AniadirCarrito = By.xpath("//button[@value='4100']");
    private By segundoProducto = By.xpath("//div[@data-product-id='4084']");
    private By AniadirCarritoDos = By.xpath("//button[@value='4084']");

    public void ClickProducto(){
        this.driver.findElement(primerProducto).click();
    }
    public void ClickCarrito(){
        this.driver.findElement(AniadirCarrito).click();
    }
    public void ClickProductoDos(){
        this.driver.findElement(segundoProducto).click();
    }
    public void ClickCarritoDos(){
        this.driver.findElement(AniadirCarritoDos).click();
    }

    public void go(String url){
        this.driver.get(url);
    }
}

package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	public By organize = By.xpath("//select[@class='product_sort_container']");
    public By preco = By.xpath("//option[@value='lohi']");
    public By produto = By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
    public By carrinho = By.xpath("//a[@class='shopping_cart_link']");
    public By checkout = By.id("checkout");
    public By firstname = By.id("first-name");
    public By lastname = By.id("last-name");
    public By postalcode = By.id("postal-code");
    public By confirmar = By.id("continue");
    public By finish = By.id("finish");
    public By backtoproducts = By.id("back-to-products");
}

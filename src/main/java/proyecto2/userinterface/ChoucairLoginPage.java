package proyecto2.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {

    //public static final Target LOGIN_BUTTON=Target.the("button that shows us the form to login").located(By.id("yui_3_17_2_1_1613676585903_32"));
    public static final Target LOGIN_BUTTON=Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER=Target.the("where do we write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD=Target.the("where do we write the user").located(By.id("password"));
    public static final Target ENTER_BUTTON=Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));


}

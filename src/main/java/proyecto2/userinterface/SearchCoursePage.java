package proyecto2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target CLICKSELECTION = Target.the("Entramos para buscar el curso").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUTCOURSE=Target.the("Buscamos el curso").located(By.id("coursesearchbox"));
    public static final Target CLICKCURSO=Target.the("Click para buscar").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE=Target.the("Workshop de Automatización").located(By.xpath("//div[@class='search-results']//a[contains(text(),'Workshop de Automatización')]"));
    public static final Target NAME_COURSE=Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Workshop de Automatización')]"));


}

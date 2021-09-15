package co.com.choucair.BanistmoReto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BanistmoPage {

    public static final Target PAGINA_PRINCIPAL = Target.the("where the user click to go to the page")
            .located(By.xpath("//*[@id=\"modal-prehome-fenix\"]/div/div/div[2]/button"));
    public static final Target PERSONAS_BUTTON = Target.the("where the user click the personas button")
            .located(By.id("header-personas"));
    public static final Target SOLICITUD_PRODUCTOS_BUTTON = Target.the("where the user click the Solicitud de productos")
            .located(By.id("header-solicitud-productos"));
    public static final Target INVERSIONES_BUTTON = Target.the("where the user click the Inversiones Button")
            .located(By.id("filtro-inversiones"));
    public static final Target MOSTRAR_FILTROS_ARROW = Target.the("where the user click the Arrow to show the options")
            .located(By.id("mostrar-filtros"));
    public static final Target MONTO_INVERSION_BUTTON = Target.the("where the user click the Monto 500$")
            .located(By.id("tag-catMontoMinimo500000 icon-cash"));
    public static final Target CONOCE_MAS_BUTTON = Target.the("where the user click the Conoce mas button")
            .located(By.id("filtrado-conoce-inversion-0"));
    public static final Target DOCUMENTOS_BUTTON  = Target.the("where the user click the Documentos Button")
            .located(By.xpath("//*[@id=\"tabs\"]/div/ul/li[4]/a"));
    public static final Target REGLAMENTO_INVERSION_VIRTUAL_BUTTON = Target.the("where the user click the button that shows the PDF")
            .located(By.xpath("//*[@id=\"tab4\"]/button/a"));
}

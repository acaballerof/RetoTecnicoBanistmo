package co.com.choucair.BanistmoReto.tasks;

import co.com.choucair.BanistmoReto.interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static  co.com.choucair.BanistmoReto.userinterface.BanistmoPage.*;

public class Search implements Task {

    public static Search toThe() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PAGINA_PRINCIPAL),
                Click.on(PERSONAS_BUTTON),
                Click.on(SOLICITUD_PRODUCTOS_BUTTON),
                Click.on(INVERSIONES_BUTTON),
                Click.on(MOSTRAR_FILTROS_ARROW),
                Click.on(MONTO_INVERSION_BUTTON),
                Click.on(CONOCE_MAS_BUTTON),
                Click.on(DOCUMENTOS_BUTTON),
                Click.on(REGLAMENTO_INVERSION_VIRTUAL_BUTTON),
                SwitchWindows.setWindow());
    }
}

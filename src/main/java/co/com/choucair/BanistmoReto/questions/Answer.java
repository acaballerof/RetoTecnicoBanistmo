package co.com.choucair.BanistmoReto.questions;

import co.com.choucair.BanistmoReto.model.BanistmoData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean>{
    BanistmoData banistmoData;

    public Answer(BanistmoData banistmoData) {
        this.banistmoData = banistmoData;
    }

    public static Answer toThe(BanistmoData banistmoData) {return new Answer(banistmoData); }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        if (currentUrl.contains(banistmoData.getUrlContratoInversionVirtual())){
            result = true;
        }
        return result;
    }
}

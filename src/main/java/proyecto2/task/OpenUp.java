package proyecto2.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Open;
import proyecto2.userinterface.ChoucairAcademyPage;


public class OpenUp implements Task{
    private ChoucairAcademyPage choucairAcademyPage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}

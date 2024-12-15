package BehavioralDP.MediatorDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class Runner {

    public static void main(String[] args) {

        MessageMediator mediator = new MessageMediator();

        Actor actor1 = new Professor("Prof. Math", mediator);
        Actor actor2 = new Professor("Prof. Chem", mediator);
        Actor actor3 = new Professor("Prof. IT", mediator);

        mediator.register("Math", actor1);
        mediator.register("Chem", actor2);
        mediator.register("IT", actor3);


        System.out.println(PURPLE + "Questions from Prof.Math ?!?" + RESET);
        actor1.sendMessage("Chem","What is Chem?");
        actor1.sendMessage("IT","What is IT?");

        System.out.println();

        System.out.println(RED + "Questions from Prof.IT ?!?" + RESET);
        actor3.sendMessage("Math","What is Math?");


    }
}

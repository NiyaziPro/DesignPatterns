package BehavioralDP.MediatorDP;

import static CreationalDP.AbstractFactoryDP.Color.BLUE;
import static CreationalDP.AbstractFactoryDP.Color.RESET;

public class Professor implements Actor {

    public String name;

    public Mediator mediator;

    public Professor() {

    }

    public Professor(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(BLUE + this.name + " : received the message, answering the question : " + message + RESET);
    }

    @Override
    public void sendMessage(String topic, String message) {
        mediator.dispatch(topic,message);
    }
}

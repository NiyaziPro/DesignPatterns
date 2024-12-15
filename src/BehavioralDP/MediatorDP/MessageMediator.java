package BehavioralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

import static CreationalDP.AbstractFactoryDP.Color.RESET;
import static CreationalDP.AbstractFactoryDP.Color.YELLOW;

public class MessageMediator implements Mediator {

    Map<String, Actor> registeredActors = new HashMap<>();

    public void register(String topic, Actor actor) {
        registeredActors.put(topic, actor);
    }

    @Override
    public void dispatch(String topic, String message) {

        Actor actor = registeredActors.get(topic);

        if (actor == null) {
            System.out.println(YELLOW + "We do not have an expert on this subject." + RESET);
        }else {
            actor.receiveMessage(message);
        }

    }
}

package CreationalDesignPattern.SingeltonDP;

public class Runner {

    /*
    Singleton Pattern (Creational)
Purpose: Ensure a class has only one instance and provides a global access point to it.
Use case: Logging, caching, configurations, or connection pools.
Example: A configuration manager class that loads settings only once and provides access to these settings throughout the application.

Singleton-Muster (Erzeugungsmuster)
Zweck: Sicherstellen, dass eine Klasse nur eine Instanz hat und einen globalen Zugriffspunkt darauf bereitstellt.
Anwendungsfall: Protokollierung, Zwischenspeicherung, Konfigurationen oder Verbindungs-Pools.
Beispiel: Eine Konfigurationsmanager-Klasse, die Einstellungen nur einmal lädt und diese im gesamten Anwendungskontext bereitstellt.
     */
    public static void main(String[] args) {

        /*SingeltonObject object1=new SingeltonObject();
        SingeltonObject object2=new SingeltonObject();
        System.out.println(object1==object2); // false*/

        SingeltonObject object3 = SingeltonObject.getInstance();
        SingeltonObject object4 = SingeltonObject.getInstance();
        System.out.println(object3==object4); // true

        System.out.println( object3.message); // Hello
        object3.changeMessage();
        System.out.println(object3.message); // Hello Design Pattern :)

        System.out.println(object4.message); // Hello Design Pattern :)

        //SingeltonObject object5 = new SingeltonObject();
    }
}

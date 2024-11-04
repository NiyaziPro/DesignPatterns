package CreationalDP.PrototypeDP;

public class Runner {

    /*
    Prototype Pattern (Creational)
Purpose: Specify the kinds of objects to create using a prototypical instance and create new objects by copying this prototype.
Use case: When creating an object is costly, and you want to avoid creating objects from scratch.
Example: A game character creation system where new characters can be based on an existing character template.
     */
    public static void main(String[] args) {

        Soldier soldierAvailable = new Soldier(100,20,60,"sword",true); // 80
        Soldier soldierNotAvailable = new Soldier(100,20,60,"sword",false); // 20
        Soldier soldierWeapon = new Soldier(100,20,60,"crossbow",true); // 30

        Soldier soldier4 = soldierAvailable.clone();

        System.out.println("soldierAvailable : ");
        soldierAvailable.printInfo();
        System.out.println("cloneSoldier : ");
        soldier4.printInfo();

        Soldier soldier5 = soldierAvailable.clone();
        soldier5.setAvailable(false);
        soldier5.printInfo();

        Soldier soldier6 = soldierNotAvailable.clone();

        soldier6.printInfo();
        soldier6.setAvailable(true);
        soldier6.printInfo();

        soldierWeapon.printInfo();

    }
}

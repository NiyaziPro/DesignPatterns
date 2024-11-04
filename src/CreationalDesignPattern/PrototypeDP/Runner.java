package CreationalDesignPattern.PrototypeDP;

public class Runner {
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

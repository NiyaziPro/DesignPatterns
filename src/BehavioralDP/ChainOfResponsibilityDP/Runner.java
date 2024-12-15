package BehavioralDP.ChainOfResponsibilityDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class Runner {
    public static void main(String[] args) {

        Approver generalManager = new GeneralManager();
        Approver manager = new Manager(generalManager);
        Approver officer = new Officer(manager);

        System.out.println(YELLOW + "Credit approval limits:" + RESET);
        System.out.println(YELLOW + "Officer max. : 5000" + RESET);
        System.out.println(YELLOW + "Manager max. : 10000" + RESET);
        System.out.println(YELLOW + "General Manager max. : without Limit" + RESET);
        System.out.println(YELLOW + "******************************************" + RESET);
        System.out.println(BLUE+"The amount requested by the customer from the officer: 1000");
        officer.approveLoan(1000);
        System.out.println(BLUE+"The amount requested by the customer from the officer: 7000");
        officer.approveLoan(7000);
        System.out.println(BLUE+"The amount requested by the customer from the officer: 15000");
        officer.approveLoan(15000);





    }
}

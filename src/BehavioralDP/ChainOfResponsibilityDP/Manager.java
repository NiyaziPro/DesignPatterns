package BehavioralDP.ChainOfResponsibilityDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class Manager extends Approver{


    public Manager(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 10000) {
            System.out.println(GREEN + "The Manager approved the request :)" + RESET);
            System.out.println(YELLOW + "******************************************" + RESET);
            return true;
        } else if (chief != null) {
            System.out.println(RED + "The amount exceeds the manager's limit! Referring to the General Manager..."+RESET);
            return chief.approveLoan(amount);
        }

        return false;

    }
}

package BehavioralDP.ChainOfResponsibilityDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class Officer extends Approver {

    public Officer(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 5000) {
            System.out.println(GREEN + "The officer approved the request :)" + RESET);
            System.out.println(YELLOW + "******************************************" + RESET);
            return true;
        } else if (chief != null) {
            System.out.println(RED + "The amount exceeds the officer's limit! Referring to the Manager..." + RESET);
            return chief.approveLoan(amount);
        }

        return false;
    }
}

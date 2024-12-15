package BehavioralDP.ChainOfResponsibilityDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class GeneralManager extends Approver{
    public GeneralManager() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println(GREEN + "The GeneralManager approved the request :)" + RESET);
        System.out.println(YELLOW + "******************************************" + RESET);
        return false;
    }
}

package BehavioralDP.ChainOfResponsibilityDP;

public abstract class Approver {

    public Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);

}

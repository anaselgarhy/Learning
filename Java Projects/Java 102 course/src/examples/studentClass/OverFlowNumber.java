package examples.studentClass;

public class OverFlowNumber extends Exception {
    public OverFlowNumber(float number){
        super("The " + number + ", are over flow value!");
    }
}

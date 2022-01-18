package dio.com.br;

public class Results {
    public static void main(String[] args) {
    //methodCalc results
        System.out.println("methodCalc Results");
        System.out.println("__________________");
        methodCalc.sum(2,5);
        methodCalc.subtract(15,2.6);
        methodCalc.multiply(3,7.5);
        methodCalc.divide(30, 10);
        System.out.println("__________________");


    //message Results
        System.out.println("Message Results");
        System.out.println("__________________");
        Message.newMessage(6);
        Message.newMessage(13);
        Message.newMessage(0);
        System.out.println("__________________");

    //Enhanced Switch Message Results

        System.out.println("Enhanced Switch Message Results");
        System.out.println("__________________");
        messageEnhancedSwitch.newMessage(8);
        messageEnhancedSwitch.newMessage(17);
        messageEnhancedSwitch.newMessage(4);
        System.out.println("__________________");
    //Loan Results

        System.out.println("Loan Results");
        System.out.println("__________________");
        Loan.calculator(1000, Loan.getTwoParcels());
        Loan.calculator(1000, Loan.getThreeParcels());
        Loan.calculator(1000, Loan.getFourParcels());





    }


}

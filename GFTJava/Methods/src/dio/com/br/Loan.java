package dio.com.br;

public class Loan {
    public static int getTwoParcels(){
        return 2;

    }
    public static int getThreeParcels(){
        return 3;

    }
    public static int getFourParcels(){
        return 4;
    }

    public static double getTwoParcelsTax(){
        return 0.3;

    }

    public static double getThreeParcelsTax(){
        return 0.45;

    }
    public static double getFourParcelsTax(){
        return 0.60;
    }

    public static void calculator(double value, int parcels){
        if (parcels == 2){

            double finalValue = value + (value * getTwoParcelsTax());

            System.out.println("Your loan final value is: $" + finalValue);
        } else if (parcels == 3){

            double finalValue = value + (value * getThreeParcelsTax());

            System.out.println("Your loan final value is: $" + finalValue);
        } else if (parcels == 4){

            double finalValue = value + (value * getFourParcelsTax());

            System.out.println("Your loan final value is: $" + finalValue);

        } else {
            System.out.println("Error. Invalid number of parcels.");
        }

    }

}

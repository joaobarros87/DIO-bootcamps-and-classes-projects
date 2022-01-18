package dio.com.br;

public class messageEnhancedSwitch {
    public static void newMessage(int hour){

        switch (hour) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> messageGoodMorning();
            case 13, 14, 15, 16, 17 -> messageGoodAfternoon();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> messageGoodNight();
            default -> System.out.println("Invalid hour.");
        }

    }

    public static void messageGoodMorning(){
        System.out.println("Good Morning Sunshine!");
    }

    public static void messageGoodAfternoon(){
        System.out.println("Good Afternoon!");
    }

    public static void messageGoodNight(){
        System.out.println("Good Night!");
    }

}

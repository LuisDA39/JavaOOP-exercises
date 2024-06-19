public class MainEx {

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.roll();
        System.out.println(dice1.displayValue());

        Roulette roulette1 = new Roulette();
        roulette1.addOption("Red");
        roulette1.addOption("Blue");
        roulette1.addOption("Green");
        roulette1.addOption("Yellow");
        roulette1.addOption("Brown");
        roulette1.addOption("Black");
        roulette1.addOption("White");
        System.out.println(roulette1.spin());
    }
}

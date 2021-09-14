package se.iths.java21.objects.interfaces.dice;

public class Dice {
    public static void main(String[] args) {
        Die die1 = new CheatingSixSidedDie();
        for (int i = 0; i < 10; i++) {
            die1.roll();
            System.out.println(die1.value());
            die1.roll();
            System.out.println(die1.value());
        }
        Die die2 = createDie();
        rollYourDice(die2);
    }


    public static void rollYourDice(Die die){
        die.roll();
        System.out.println(die.value());
    }

    public static Die createDie(){
        return new SixSidedDie();
    }


}

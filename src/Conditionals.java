import java.util.Random;

public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();

    }

    public Conditionals(){

        String question ="Im I getting an A on this assignement";
        System.out.println(question);
        int randomInt =  (int) (Math.random() * 11);

        if (randomInt == 0 || randomInt == 1) {
            System.out.println("an A+");
        } else if (randomInt == 2 || randomInt == 3) {
            System.out.println("Yes");

        } else if (randomInt == 4 || randomInt == 5) {
            System.out.println("No");
        } else if(randomInt == 6 || randomInt == 7){
            System.out.println("Maybe");
        } else if (randomInt == 8 || randomInt == 9) {
            System.out.println("I'm not sure");
        } else if (randomInt ==10 ) {
            System.out.println("I don't know");



        }
    }
}




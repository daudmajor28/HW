public class Loops {
    public static void main(String[] args) {
        Loops myCount= new Loops();
    }// main method

    public Loops() {
        countUp();
        countByThrees();
        countDown();
        nestedLoop();
        challengeLoop();
        //counting method in here
    }
        public void countUp () {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }

public void countByThrees() {
    for (int i = 3; i <= 15; i+=3) {
        System.out.print(i +" ");
        //define counting methods down here
    }
    System.out.println("");
}
    public void countDown() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i +", ");


}
        System.out.println("Happy Loop Year!!");
    }

    public void nestedLoop() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
public void challengeLoop(){

        for (int i = 1; i <= 4; i++) {
        for (int j =1; j<=i; j++) {
            System.out.print(j+ " ");
        }
            System.out.println();
            {




        }

    }
}}
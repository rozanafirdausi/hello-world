import java.util.Random;
public class Randomnumber {
    public static void main(String[] args ) {
        Random dice = new Random();
        int dadu =dice.nextInt(6);
        System.out.println(dadu);
    }
}

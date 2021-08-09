import java.util.ArrayList;
import java.util.Random;


public class PuzzlingTester {
    public static void main(String[] args) {
        Puzzling generator = new Puzzling();

        System.out.println(generator.tenRolls());
        System.out.println(generator.rndLetter());
        System.out.println(generator.password());
        System.out.println(generator.getNewPass(3));
    }
}

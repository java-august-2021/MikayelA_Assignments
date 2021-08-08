import java.util.ArrayList;
import java.util.Random;

public class PuzzlingTester {
    public static void main(String[] args) {
        Puzzling generator = new Puzzling();

        ArrayList<Integer> rndRolls = generator.tenRolls();
        System.out.println(rndRolls);
        
        System.out.println(generator.rndLetter());
        System.out.println(generator.password());
        System.out.println(generator.getNewPass(3));
    }
}

import java.util.ArrayList;
import java.util.Random;

public class Puzzling {
    
    public ArrayList tenRolls() {
        ArrayList<Integer> rand10 = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 1; i<=10; i++) {
            rand10.add(rnd.nextInt(20));
        }
        return rand10;
    }

    public char rndLetter() {
        Random rnd = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char letter = alphabet[rnd.nextInt(26)];
        return letter;
        }

    public String password(){
    String pswrd = "";
        for(int i = 0; i < 8; i++){
            pswrd = pswrd + rndLetter();
        }
        return pswrd;
    }

    public ArrayList<String> getNewPass(int length) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            newPassword.add(password());
        }
        return newPassword;
    }

}

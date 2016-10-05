import java.util.Random;

public class PasswordRandomizer {

    // Define the variables

    private int passwordLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
        this.random = new Random();
    }

    public String createPassword() {
       
        int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newPassword = "";
        while (i < this.passwordLength) {
            newPassword = newPassword + alphabet.charAt(this.random.nextInt(26));
            i++;
        }
        return newPassword;
    }
}
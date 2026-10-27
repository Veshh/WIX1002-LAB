import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6); // Generates a random integer from 0 to 5
        
        String word = "";
        switch (num) {
            case 0: word = "zero"; break;
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
        }
        
        System.out.println(num + " is " + word + ".");
    }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numbers[] = new int[6];

        for (int i = 0; i < 6; i++) {
            int number = rand.nextInt(60);
            numbers[i] = number;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
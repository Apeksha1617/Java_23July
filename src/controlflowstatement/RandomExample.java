package controlflowstatement;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        int num, randomNo;
        Scanner scanner = new Scanner(System.in);

        randomNo = (int) (Math.random()* 100)+1;
        System.out.println(randomNo);

        do{
            System.out.println("Enter value:");
            num = scanner.nextInt();
            if(randomNo>num) {
                System.out.println("Random no is greater");
            }
            else if(randomNo<num) {
                System.out.println("Random no is smaller");
            }
            else {
                System.out.println("Random no is correct");
            }

        } while(randomNo != num);
    }
}
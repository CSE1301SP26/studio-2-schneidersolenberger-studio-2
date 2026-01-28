import java.util.Scanner;

public class Ruin {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		int winLimit = in.nextInt();
        System.out.println("How many days?");
		int totalSimulations = in.nextInt();


        double count = startAmount;
        while (count < winLimit && count > 0 && count != 0) { 
            if (Math.random() <= winChance) {
                count++;
            } 
            else {
                count--;
            }
        }
     int countDays = 0;
        while (countDays == totalSimulations) {
            if (count < winLimit && count > 0 && count != 0) {
            countDays++;
               System.out.println(countDays);
            }
       }
}
}

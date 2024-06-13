package basic2;
import java.util.Random;
import java.util.Scanner;

class Dice {
    Scanner id = new Scanner(System.in);
    int num, dice;
    int[] sum = new int[5];  

    void cal() {
        Random rn = new Random();
        dice = rn.nextInt(6) + 1;  
    }

    void set() {
        System.out.println("Enter the number of players who want to play?");
        System.out.println("Limit: Min ->2 & Max ->4");
        num = id.nextInt();
        id.nextLine();

        if (num < 2 || num > 4) {
            System.out.println("Invalid input");
        } else {
            while (true) {
                for (int i = 1; i <= num; i++) {
                    if (sum[1] != 100 && sum[2] != 100 && sum[3] != 100 && sum[4] != 100) {
                        do {
                            System.out.println();
                            System.out.println("Player " + i + ", roll the dice.");
                            id.nextLine();  
                            cal();
                            sum[i] += dice;

                            System.out.println("Player " + i + " moves " + dice + " steps forward");

                            if (sum[i] < 100) {
                                System.out.println("Player " + i + " is on step " + sum[i]);
                            } else if (sum[i] > 100) {
                                System.out.println("Player " + i + ", you can't move.");
                                sum[i] -= dice;
                            } else {
                                System.out.println("Player " + i + ", you won the game!");
                                return;  
                            }

                            switch (sum[i]) {
                                case 1:
                                    System.out.println("Yay! You got a ladder");
                                    sum[i] += 37;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 4:
                                    System.out.println("Yay! You got a ladder");
                                    sum[i] += 10;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 28:
                                    System.out.println("Yay! You got a ladder");
                                    sum[i] += 56;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 51:
                                    System.out.println("Yay! You got a ladder");
                                    sum[i] += 16;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 80:
                                    System.out.println("Yay! You got a ladder");
                                    sum[i] += 19;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 17:
                                    System.out.println("Oops! You got a snake");
                                    sum[i] -= 10;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 54:
                                    System.out.println("Oops! You got a snake");
                                    sum[i] -= 20;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 62:
                                    System.out.println("Oops! You got a snake");
                                    sum[i] -= 50;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                                case 98:
                                    System.out.println("Oops! You got a snake");
                                    sum[i] -= 11;
                                    System.out.println("Player " + i + " is on step " + sum[i]);
                                    break;
                            }

                        } while (dice == 6);
                    }
                }
            }
        }
    }
}

public class Game_snakeladder {
    public static void main(String[] args) {
        Dice ob = new Dice();
        ob.set();
    }
}

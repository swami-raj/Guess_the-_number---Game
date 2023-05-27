import java.util.Random;
import java.util.Scanner;
public class guesslogic {
    static int rnumber(){
        Random random=new Random();
        int num=random.nextInt(20);
        return num;
    }
     static void guess_no(){
        Scanner sc =new Scanner(System.in);
         int match=rnumber();
         int i=0;
         System.out.println("you have to 5 life line to won the game:");
         while(i<5) {
             System.out.println("enter your number :  ");
             int a = sc.nextInt();
             if (match == a) {
                 System.out.println("you guess the correct number ");
                 break;
             } else if (a > match) {
                 System.out.println("you guess greater number:");
             } else if (a < match) {
                 System.out.println("you guess smaller number:");
             }
             System.out.println(4-i+" life line remaining to won the game");
             i++;
         }
     }
}

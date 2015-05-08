package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
import java.util.Scanner;
public class Ex_5_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some integer: ");
        int num = input.nextInt();

        displayPattern(num);
    }
    //Vuvodutj poslidovnistj 4usel vid 1 do num piramidkojy
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j <= i){
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

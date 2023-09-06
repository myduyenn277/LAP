
package Common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vothi
 */
public class Library {
     public int getInt(String p, int n, int m) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(p + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= n && a <= m) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + n + " and " + m);
            }
        }
        return a;
    }

    public int[] createArray(int size_arr) {
        int[] array = new int[size_arr];
        Random rd = new Random();
        // random de tao ra cac so ngau nhien
        for (int i = 0; i < size_arr; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

   public void display(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
   

}

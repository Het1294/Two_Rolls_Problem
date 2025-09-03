import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Two_Roll_Problem {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        try {

            int T = sc.nextInt();
            if (T < 1 || T > 100) {
                throw new IllegalArgumentException("must be between 1 and 100");
            }
            while (T-- > 0) {
                int N = sc.nextInt();
                int minCost = Integer.MAX_VALUE;
                if (N < 100) {
                    for (int b = 0; b < N / 3; b++) {
                        int r = N - 3 * b;
                        if (r % 2 == 0) {
                            int a = r / 2;
                            int cost = 4 * a + 5 * b;
                            minCost = Math.min(minCost, cost);
                        }
                    }
                }
                System.out.println(minCost);
            }
        }

        catch (IllegalArgumentException e) {
            System.out.println("Not valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        } finally {
            sc.close();
        }
    }
}

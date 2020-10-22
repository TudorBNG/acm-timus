package no1876;

import java.util.Scanner;

/**
 * @author: Tudor Bungardean
 */

public class Centipede {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Centipede().solve();
    }

    private void solve() {
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int case1 = 40 + right * 2;
        int case2 = 78 + 40 + (left-40)*2 + 1;

        System.out.println(Math.max(case1, case2));
    }
}
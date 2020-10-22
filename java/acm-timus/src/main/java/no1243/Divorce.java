package no1243;

import java.util.Scanner;

/**
 * @author: Tudor Bungardean
 */

public class Divorce {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Divorce().solve();
    }

    private void solve() {
        String input = scanner.next();
        int[] items = new int[input.length()+1];
        for (int i = 0; i<input.length(); i++){
            items[i+1] = (items[i] + Character.getNumericValue(input.charAt(i))) % 7 * 10;
        }

        System.out.println(items[input.length()]/10);
    }
}
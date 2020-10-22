package no1545;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Tudor Bungardean
 */

public class Hieroglyphs {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Hieroglyphs().solve();
    }

    private void solve() {
        int n = scanner.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i<n; i++){
            strings.add(scanner.next());
        }
        char input = scanner.next().charAt(0);
        for (String s: strings){
            if (s.charAt(0)==input){
                System.out.println(s);
            }
        }
    }
}
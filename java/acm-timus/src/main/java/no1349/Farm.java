package no1349;

import java.util.Scanner;

/**
 * @author: Tudor Bungardean
 */

public class Farm {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Farm().solve();
    }

    private void solve() {
        int n = scanner.nextInt();
        if (n==1){
            System.out.println(1 + " " + 2 + " " + 3);
        }else if(n==2){
            System.out.println(3 + " " + 4 + " " + 5);
        }else{
            System.out.println(-1);
        }
    }
}
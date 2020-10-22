package no1327;

import java.util.Scanner;

/**
 * @author Tudor Bungardean
 */

public class Fuses {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new Fuses().solve();
    }

    public void solve(){
        int firstDay = this.scanner.nextInt();
        if (firstDay % 2 == 0){
            firstDay++;
        }
        int lastDay = this.scanner.nextInt();
        if (lastDay % 2 == 0){
            lastDay--;
        }
        System.out.println((lastDay-firstDay+2)/2);
    }
}

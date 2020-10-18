package no1991;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * @author Bungardean Tudor-Ionut
 */
public class TheBattle {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new TheBattle().solve();
    }

    public void solve(){
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        int soldiers = 0;
        int survivingDroids = 0, unusedBoomBooms = 0;

        for (int i = 0; i<n; i++){
            soldiers = Integer.parseInt(scanner.next()) - k;
            if (soldiers>0){
                survivingDroids += soldiers;
            }else{
                unusedBoomBooms += abs(soldiers);
            }
        }

        System.out.println(survivingDroids + " " + unusedBoomBooms);
    }
}

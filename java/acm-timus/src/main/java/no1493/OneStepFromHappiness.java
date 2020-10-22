package no1493;

import java.util.Scanner;

/**
 * @author: Tudor Bungardean
 */

public class OneStepFromHappiness {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new OneStepFromHappiness().solve();
    }

    private void solve() {
        long ticket = scanner.nextLong();
        if (ticket%10==9){
            System.out.println("No");
        }else{
            int firstHalf =(int)ticket/1000;
            int secondHalf =(int)ticket%1000;
            if (sum(firstHalf)==sum(secondHalf+1) || sum(firstHalf)==sum(secondHalf-1)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private int sum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}

package no1567;

import java.util.Scanner;

/**
 * @author Bungardean Tudor-Ionut
 */
public class SMSSpan {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new SMSSpan().solve();
    }

    private void solve(){
        String input = scanner.nextLine();
        int cost = 0;
        for (char c:input.toCharArray()) {
            int index = ".,! ".indexOf(c);
            if (index != -1){
                cost += index%3+1;
            }else{
                int aux = (int) c;
                cost += ((aux-97) %3) + 1;
            }
        }

        System.out.println(cost);
    }
}
